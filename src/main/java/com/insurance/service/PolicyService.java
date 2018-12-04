package com.insurance.service;

import java.util.List;

import com.insurance.model.Policy;

public interface PolicyService {
	List<Policy> show(String username);
	int addPolicy(Policy p);
}
