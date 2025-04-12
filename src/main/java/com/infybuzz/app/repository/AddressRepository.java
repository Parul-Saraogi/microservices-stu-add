package com.infybuzz.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infybuzz.app.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}
