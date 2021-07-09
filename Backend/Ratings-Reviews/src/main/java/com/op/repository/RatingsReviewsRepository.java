package com.op.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.op.model.RatingsReviews;

public interface RatingsReviewsRepository extends MongoRepository<RatingsReviews, Integer> {

	
	public RatingsReviews save(RatingsReviews review);

	public List<RatingsReviews> findByCustomerId(int customerId);

	public List<RatingsReviews> findByWasherId(int washerId);
	
}
