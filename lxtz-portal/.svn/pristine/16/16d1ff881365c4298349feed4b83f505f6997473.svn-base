package cn.dosy.platform.admin.service;

import java.util.List;

import cn.dosy.platform.admin.dao.IBlogrollDAO;
import cn.dosy.platform.admin.domain.Blogroll;

public class BlogrollManager implements IBlogrollManager{
	
	private IBlogrollDAO blogrollDAO;
	
	public void setBlogrollDAO(IBlogrollDAO blogrollDAO) {
		this.blogrollDAO = blogrollDAO;
	}

	@Override
	public void add(Blogroll blogroll) {
		blogrollDAO.add(blogroll);
		
	}

	@Override
	public void removeById(String id) {
		blogrollDAO.removeById(id);
		
	}

	@Override
	public void update(Blogroll blogroll) {
		blogrollDAO.update(blogroll);
		
	}

	@Override
	public List<Blogroll> query(Blogroll blogroll) {
		return blogrollDAO.query(blogroll);
	}
	
	@Override
	public Blogroll findById(String id) {
		return blogrollDAO.findById(id);
	}

	@Override
	public List<Blogroll> findAll() {
		
		return blogrollDAO.findAll();
	}

}
