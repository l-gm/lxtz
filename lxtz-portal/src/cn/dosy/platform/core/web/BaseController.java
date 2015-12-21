package cn.dosy.platform.core.web;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.dosy.platform.core.domain.Auditable;
import cn.dosy.platform.core.utils.StringUtils;

/**
 * <p>
 *  抽象通用 Controller
 * </p>
 * 
 * <p>
 * Copyright: 2014 . All rights reserved.
 * </p>
 * <p>
 * Company: dosy
 * </p>
 * <p>
 * CreateDate:2014年09月20日
 * </p>
 * 
 * @author MM
 * @history 创建文档；Mender:MM；Date:2014年09月20日；
 */
public class BaseController <E extends Auditable> {
	
	protected Logger logger = LoggerFactory.getLogger(getClass());
	
	protected static String CONTROLLER_REDIRECT = "redirect:";

	private static final Map<Class<?>, String> controllerPathMapping = new ConcurrentHashMap<Class<?>, String>();
	
	/**
	 * 相对于Controller中的RequestMapping所指定的路径
	 * 
	 * @param path
	 * @return
	 */
	protected String getRelativePath(String path) {
		Class<?> clz = getClass();
		String controllerPath = controllerPathMapping.get(clz);
		if (controllerPath == null) {
			Class<?> top = clz;
			RequestMapping mappings = null;
			while (top != Object.class) {
				mappings = top.getAnnotation(RequestMapping.class);
				if (mappings != null) {
					break;
				}
				top = top.getSuperclass();
			}
			if (mappings != null) {
				controllerPath = mappings.value()[0];
			} else {
				controllerPath = StringUtils.EMPTY;
			}
			controllerPathMapping.put(clz, controllerPath);
		}
		return controllerPath + path;
	}
	
	
	/**
	 * 将查询结果拷贝到Value Object
	 * @param page
	 * @return
	 */
	protected <T> Page<T> copyPageToVo(Page<E> page, Class<T> clz) {
		List<T> content = new ArrayList<T>();
		for (E code : page) {
			
			try {
				T codeVo = clz.newInstance();
				BeanUtils.copyProperties(codeVo, code);
				content.add(codeVo);
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		Page<T> pageVo = new PageImpl<T>(content, new PageRequest(page.getNumber(), page.getSize(), page.getSort()), page.getTotalElements());
		return pageVo;
	}
	
}
