package com.infybuzz.app.response;

import com.infybuzz.app.entity.Address;

public class AddressResponse {
    
    private Long addressId;
    private String street;
    private String city;

    public AddressResponse(Address address) {
        this.addressId = address.getId();
        this.street = address.getStreet();
        this.city = address.getCity();
    }

    public Long getAddressId() {
        return addressId;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

	public AddressResponse(Long addressId, String street, String city) {
		super();
		this.addressId = addressId;
		this.street = street;
		this.city = city;
	}

	public AddressResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}
