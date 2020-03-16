package com.zyb.blog.service;

import com.zyb.blog.domain.Comment;

/**
 * Comment 服务接口.
 * 
 */
public interface CommentService {
	/**
	 * 根据id获取 Comment
	 * @param id
	 * @return
	 */
	Comment getCommentById(Long id);
	/**
	 * 删除评论
	 * @param id
	 * @return
	 */
	void removeComment(Long id);
}