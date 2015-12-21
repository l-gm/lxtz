package cn.dosy.platform.core.service;


/**
 * <p>
 * 可刷新接口
 * </p>
 * 
 * <p>
 * Copyright: 2014 . All rights reserved.
 * </p>
 * <p>
 * Company: dosy
 * </p>
 * <p>
 * CreateDate:2014年09月01日
 * </p>
 * 
 * @author MM
 * @history 创建文档；Mender:MM；Date:2014年09月01日；
 */
public interface Refreshable {

	/**
	 * 返回是否刷新成功
	 */
	boolean refresh();
}
