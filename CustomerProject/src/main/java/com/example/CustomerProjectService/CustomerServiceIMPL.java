package com.example.CustomerProjectService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CustomerProject.DTO.CustomerSaveDTO;
import com.example.CustomerProject.Entity.Customer;
import com.example.CustomerProjectRepo.CustomerRepo;

@Service

public class CustomerServiceIMPL implements CustomerService {
	
	@Autowired
	private CustomerRepo customerRepo;

	@Override
	public String addCustomer(CustomerSaveDTO customerSaveDTO) {
		// TODO Auto-generated method stub
		Customer customer = new Customer(
				
				customerSaveDTO.getCustomername(),
				customerSaveDTO.getCustomeraddress(),
				customerSaveDTO.getMobile()
				
				);
		customerRepo.save(customer);
		return customer.getCustomername();
	}

}
