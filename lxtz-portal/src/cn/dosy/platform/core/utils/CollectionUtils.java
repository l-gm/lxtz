package cn.dosy.platform.core.utils;

/**
 * <p>
 * 集合帮助类 
 * </p>
 * 
 * <p>
 * Copyright: 2014 . All rights reserved.
 * </p>
 * <p>
 * Company: dosy
 * </p>
 * <p>
 * CreateDate:2014年08月29日
 * </p>
 * 
 * @author MM
 * @history 创建文档；Mender:MM；Date:2014年08月29日；
 */
public class CollectionUtils extends org.apache.commons.collections.CollectionUtils {

	public static boolean isEmpty(Object[] array) {
		return array == null || array.length == 0;
	}
	
	public static boolean isNotEmpty(Object[] array) {
		return !isEmpty(array);
	}

}
