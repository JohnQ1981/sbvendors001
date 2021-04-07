package com.udemy.sp.vendor.service;

import java.util.List;

import com.udemy.sp.vendor.entities.Vendors;

public interface VendorService {
	
	Vendors saveVendors(Vendors vendors);
	Vendors updateVendors(Vendors vendors);
	Vendors editVendors(Vendors vendors);
	void deleteVendors(Vendors vendors);
	Vendors getVendorById(int id);
	List<Vendors> getAllVendors();
}
