package com.example.FinalProject;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FinalCustomerRepository extends CrudRepository<FinalCustomer, Long> {

    List<FinalCustomer> findByLastName(String lastName);

    FinalCustomer findById(long id);
}
