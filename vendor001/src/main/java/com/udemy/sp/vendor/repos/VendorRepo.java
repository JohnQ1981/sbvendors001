package com.udemy.sp.vendor.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.sp.vendor.entities.Vendors;

public interface VendorRepo extends JpaRepository<Vendors, Integer> {

}
