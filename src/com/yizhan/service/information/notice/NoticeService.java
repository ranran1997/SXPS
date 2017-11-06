package com.yizhan.service.information.notice;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.yizhan.dao.DaoSupport;
import com.yizhan.entity.Page;
import com.yizhan.util.PageData;

@Service("noticeService")
public class NoticeService {

	@Resource(name = "daoSupport")
	private DaoSupport dao;
	
	/**
	 * 获取列表
	 * @param page
	 * @return
	 * @throws Exception
	 */
	public List<PageData> headnewslistPage(Page page) throws Exception{
		return (List<PageData>) dao.findForList("NoticeMapper.headnewslistPage", page);
	}
	/**
	 * 获取列表(全部)
	 * @param page
	 * @return
	 * @throws Exception
	 */
	public List<PageData> headNewsList(PageData pd) throws Exception{
		return (List<PageData>) dao.findForList("NoticeMapper.headNewsList", pd);
	}
	/**
	 * 添加
	 * @param pd
	 * @throws Exception
	 */
	public void insertHeadNews(PageData pd) throws Exception{
		dao.save("NoticeMapper.insertHeadNews", pd);
	}
	/**
	 * 更新
	 * @param pd
	 * @throws Exception 
	 */
	public void updateHeadNews(PageData pd) throws Exception{
		dao.update("NoticeMapper.updateHeadNews", pd);
	}
	/**
	 * 根据ID获取对象信息
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public PageData getHeadNewsById(PageData pd) throws Exception{
		return (PageData) dao.findForObject("NoticeMapper.getHeadNewsById", pd);
	}
	/**
	 * 根据ID删除指定对象的信息
	 * @param map
	 * @throws Exception
	 */
	public void deleteHeadNewsById(Map<String, Object> map) throws Exception{
		dao.delete("NoticeMapper.deleteHeadNewsById", map);
	}
	
}
