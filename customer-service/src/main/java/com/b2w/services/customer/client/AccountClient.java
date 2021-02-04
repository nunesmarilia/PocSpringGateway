package com.b2w.services.customer.client;

import com.b2w.services.customer.model.Account;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "account-service")
public interface AccountClient {

	@GetMapping("/customer/{customerId}")
	List<Account> findByCustomer(@PathVariable("customerId") Long customerId);
	
}
