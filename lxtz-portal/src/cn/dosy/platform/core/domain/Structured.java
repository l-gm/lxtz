package cn.dosy.platform.core.domain;

import java.util.List;

/**
 * <p>
 * 结构化父子节点 
 * </p>
 * 
 * <p>
 * Copyright: 2014 . All rights reserved.
 * </p>
 * <p>
 * Company: dosy
 * </p>
 * <p>
 * CreateDate:2014年08月31日
 * </p>
 * 
 * @author MM
 * @history 创建文档；Mender:MM；Date:2014年08月31日；
 */
public interface Structured<E> {

	/**
	 * 获取父节点
	 */
	E getParent();

	/**
	 * 设置父节点
	 * 
	 * @param parent
	 */
	void setParent(E parent);

	/**
	 * 获取子节点列表.
	 */
	List<E> getChildren();

	/**
	 * 设置子节点列表
	 * 
	 * @param children
	 */
	void setChildren(List<E> children);
}
