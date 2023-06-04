package com.easy2shop.eccomerce.dao;

import com.easy2shop.eccomerce.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {

    Customer findByEmail(String theEmails);
}
