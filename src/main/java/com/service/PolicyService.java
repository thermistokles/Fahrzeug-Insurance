package com.service;

import java.util.List;
import com.model.Policy;

public interface PolicyService {
	List<Policy> show(String username);
	int addPolicy(Policy p);
}
