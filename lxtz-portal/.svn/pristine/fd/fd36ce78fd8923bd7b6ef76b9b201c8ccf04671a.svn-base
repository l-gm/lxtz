package cn.dosy.platform.core.web.vo;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 分页对象
 * </p>
 * 
 * <p>
 * Copyright: 2014 . All rights reserved.
 * </p>
 * <p>
 * Company: dosy
 * </p>
 * <p>
 * CreateDate:2014年09月29日
 * </p>
 * 
 * @author MM
 * @history 创建文档；Mender:MM；Date:2014年09月29日；
 */
public class Page<E> {
	
	public int pageNo = 1;   									//当前页码
	public int pageSize = 10;   								//显示行数
	public int total = 0;           							//总查阅数   
	public int totalPages = 0;									//总页面数
	
	public E vo ;  												//实体类请求参数
	
	public List<E> content = new ArrayList<E>();
	
	public Page() {
		
	}
	
	public Page(int pageNo, int pageSize, int total, int totalPages, E vo, List<E> content){
		this.pageNo = pageNo;
		this.pageSize = pageSize;
		this.total = total;
		this.totalPages = totalPages;
		this.vo = vo;
		this.content = content;
	}
	
	
	
	
	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	public E getVo() {
		return vo;
	}

	public void setVo(E vo) {
		this.vo = vo;
	}

	public List<E> getContent() {
		return content;
	}

	public void setContent(List<E> content) {
		this.content = content;
	}
	
	
	

}
