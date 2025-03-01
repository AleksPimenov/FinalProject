package com.example.FinalProject;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FinalCustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);

    Customer findById(long id);
}
