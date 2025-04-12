package com.infybuzz.app.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infybuzz.app.entity.Address;
import com.infybuzz.app.repository.AddressRepository;
import com.infybuzz.app.request.CreateAddressRequest;
import com.infybuzz.app.response.AddressResponse;

@Service
public class AddressService {

	Logger logger = LoggerFactory.getLogger(AddressService.class);
	
	@Autowired
	AddressRepository addressRepository;
	
	public AddressResponse getById(long id) {
		logger.info("Inside getById" + id);
		
		Address address =addressRepository.findById(id).get();
		return new AddressResponse(address);
		
	}

	public AddressResponse createAddress(CreateAddressRequest createAddressRequest) {
		
		Address address = new Address();
		address.setCity(createAddressRequest.getCity());
		address.setStreet(createAddressRequest.getStreet());
		addressRepository.save(address);
		return new AddressResponse(address);
	}

}
