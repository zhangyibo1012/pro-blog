package com.zyb.blog.service;
 

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.zyb.blog.domain.User;
import com.zyb.blog.domain.es.EsBlog;
import com.zyb.blog.vo.TagVO;

/**
 * Blog 服务接口.
 * 
 */
public interface EsBlogService {
 	
	/**
	 * 删除Blog
	 * @param id
	 * @return
	 */
	void removeEsBlog(String id);
	
	/**
	 * 更新 EsBlog
	 * @param EsBlog
	 * @return
	 */
	EsBlog updateEsBlog(EsBlog esBlog);
	
	/**
	 * 根据id获取Blog
	 * @param id
	 * @return
	 */
	EsBlog getEsBlogByBlogId(Long blogId);
 
	/**
	 * 最新博客列表，分页
	 * @param keyword
	 * @param pageable
	 * @return
	 */
	Page<EsBlog> listNewestEsBlogs(String keyword, Pageable pageable);
 
	/**
	 * 最热博客列表，分页
	 * @param keyword
	 * @param pageable
	 * @return
	 */
	Page<EsBlog> listHotestEsBlogs(String keyword, Pageable pageable);
	
	/**
	 * 博客列表，分页
	 * @param pageable
	 * @return
	 */
	Page<EsBlog> listEsBlogs(Pageable pageable);
	/**
	 * 最新前5
	 * @param keyword
	 * @return
	 */
	List<EsBlog> listTop5NewestEsBlogs();
	
	/**
	 * 最热前5
	 * @param keyword
	 * @return
	 */
	List<EsBlog> listTop5HotestEsBlogs();
	
	/**
	 * 最热前 30 标签
	 * @return
	 */
	List<TagVO> listTop30Tags();

	/**
	 * 最热前12用户
	 * @return
	 */
	List<User> listTop12Users();
}
