package com.udemy.sp.vendor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udemy.sp.vendor.entities.Vendors;
import com.udemy.sp.vendor.repos.VendorRepo;
@Service
public class VendorsServiceImpl implements VendorService {
	
	@Autowired
	private VendorRepo repo;

	@Override
	public Vendors saveVendors(Vendors vendors) {
		return repo.save(vendors);
		
		
	}

	@Override
	public Vendors updateVendors(Vendors vendors) {
		return repo.save(vendors);
	}

	@Override
	public Vendors editVendors(Vendors vendors) {
		return repo.save(vendors);
	}

	@Override
	public void deleteVendors(Vendors vendors) {
		repo.delete(vendors);

	}

	@Override
	public Vendors getVendorById(int id) {
		return repo.findById(id).get();
	}

	@Override
	public List<Vendors> getAllVendors() {
		
		return repo.findAll();
	}

}
