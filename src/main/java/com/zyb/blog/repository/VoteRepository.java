package com.zyb.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zyb.blog.domain.Vote;

/**
 * Vote 仓库.
 *
 */
public interface VoteRepository extends JpaRepository<Vote, Long>{
 
}
