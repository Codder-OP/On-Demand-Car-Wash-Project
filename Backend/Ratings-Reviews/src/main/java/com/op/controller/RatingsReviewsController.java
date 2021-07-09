package com.op.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.op.model.RatingsReviews;
import com.op.service.RatingsReviewsService;

@RestController
@RequestMapping("/rating")
public class RatingsReviewsController {
	@Autowired
	private RatingsReviewsService service;
	
	@PostMapping("/review")
	public String placeReview(@RequestBody RatingsReviews review) throws Exception{
		service.saveReview(review);
		return "Tanks! for your Valuable review.";
	}
	
	@GetMapping("/viewCustomerReview/{customerId}")
	public List<RatingsReviews> viewCustomerReview( @PathVariable int customerId) throws Exception{
		List<RatingsReviews> ratingObj=service.fetchReviewByCustomerId(customerId);
		if(ratingObj==null) {
			throw new Exception("No Ratings! for this order");
		}
		return ratingObj;	
	}
	@GetMapping("/viewWasherReview/{WasherId}")
	public List<RatingsReviews> viewWasherReview( @PathVariable int WasherId) throws Exception{
		List<RatingsReviews> ratingObj=service.fetchReviewByWasherId(WasherId);
		if(ratingObj==null) {
			throw new Exception("No Ratings! for this order");
		}
		return ratingObj;	
	}

}
