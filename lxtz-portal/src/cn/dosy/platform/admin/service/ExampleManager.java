package cn.dosy.platform.admin.service;

import java.util.List;

import cn.dosy.platform.admin.dao.IExampleDAO;
import cn.dosy.platform.admin.domain.Example;
import cn.dosy.platform.core.web.vo.Page;

public class ExampleManager implements IExampleManager{
	
	private IExampleDAO exampleDAO;
	
	public void setExampleDAO(IExampleDAO exampleDAO) {
		this.exampleDAO = exampleDAO;
	}

	@Override
	public void add(Example example) {
		exampleDAO.add(example);
	}

	@Override
	public void removeById(String id) {
		exampleDAO.removeById(id);
	}

	@Override
	public void update(Example example) {
		exampleDAO.update(example);
	}

	@Override
	public List<Example> query(Example example) {
		return exampleDAO.query(example);
	}

	@Override
	public Page<Example> query(Page<Example> page) {
		return exampleDAO.query(page);
	}

	@Override
	public Example findById(String id) {
		return exampleDAO.findById(id);
	}

}
