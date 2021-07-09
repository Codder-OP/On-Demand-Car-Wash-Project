package com.op.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.op.model.RatingsReviews;
import com.op.repository.RatingsReviewsRepository;
@Service
public class RatingsReviewsService {
	@Autowired
	private RatingsReviewsRepository repo;

	public RatingsReviews saveReview(RatingsReviews review) {
		return repo.save(review);
		
	}

	public List<RatingsReviews> fetchReviewByCustomerId(int customerId) {
		return repo.findByCustomerId(customerId);
	}

	public List<RatingsReviews> fetchReviewByWasherId(int washerId) {
		
		return repo.findByWasherId(washerId);
	}

	
	
}
