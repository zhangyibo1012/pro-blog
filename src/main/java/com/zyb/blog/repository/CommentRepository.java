package com.zyb.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zyb.blog.domain.Comment;

/**
 * Comment 仓库.
 *
 */
public interface CommentRepository extends JpaRepository<Comment, Long>{
 
}
