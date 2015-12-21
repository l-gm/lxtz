package cn.dosy.platform.admin.service;

import java.util.List;

import cn.dosy.platform.admin.dao.IAdvShortMessageDAO;
import cn.dosy.platform.admin.domain.AdvShortMessage;
import cn.dosy.platform.core.web.vo.Page;

public class AdvShortMessageManager implements IAdvShortMessageManager {

	private IAdvShortMessageDAO advShortMessageDAO;
	
	public void setAdvShortMessageDAO(IAdvShortMessageDAO advShortMessageDAO) {
		this.advShortMessageDAO = advShortMessageDAO;
	}

	@Override
	public void add(AdvShortMessage advShortMessage) {
		advShortMessageDAO.add(advShortMessage);

	}

	@Override
	public List<AdvShortMessage> queryAll() {
 
		return advShortMessageDAO.queryAll();
	}

	@Override
	public void del(String id) {
		advShortMessageDAO.del(id);

	}

	@Override
	public void update(AdvShortMessage advShortMessage) {
		advShortMessageDAO.update(advShortMessage);

	}

	@Override
	public AdvShortMessage findById(String id) {

		return advShortMessageDAO.findById(id);
	}

	@Override
	public Page<AdvShortMessage> query(Page<AdvShortMessage> page) {

		return advShortMessageDAO.query(page);
	}

}
