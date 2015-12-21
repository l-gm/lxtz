package cn.dosy.platform.admin.service;

import java.util.List;

import cn.dosy.platform.admin.dao.INoticeDAO;
import cn.dosy.platform.admin.domain.Notice;
import cn.dosy.platform.core.web.vo.Page;

public class NoticeManager implements INoticeManager{
	
	private INoticeDAO noticeDAO;
	
	public void setNoticeDAO(INoticeDAO noticeDAO) {
		this.noticeDAO = noticeDAO;
	}

	@Override
	public void add(Notice notice) {
		noticeDAO.add(notice);
	}

	@Override
	public void removeById(String id) {
		noticeDAO.removeById(id);
	}

	@Override
	public void update(Notice notice) {
		noticeDAO.update(notice);
	}

	@Override
	public List<Notice> query(Notice notice) {
		return noticeDAO.query(notice);
	}

	@Override
	public Page<Notice> query(Page<Notice> page) {
		return noticeDAO.query(page);
	}

	@Override
	public Notice findById(String id) {
		return noticeDAO.findById(id);
	}

}
