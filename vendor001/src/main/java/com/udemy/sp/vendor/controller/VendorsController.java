package com.udemy.sp.vendor.controller;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.udemy.sp.vendor.entities.Vendors;
import com.udemy.sp.vendor.repos.VendorRepo;
import com.udemy.sp.vendor.service.VendorService;
import com.udemy.sp.vendor.utility.EmailUtil;


@Controller
public class VendorsController {
	
	
	

	@Autowired
	private EmailUtil emailUtil;
	@Autowired
	private VendorService service;
	@Autowired
	ServletContext sc;
	
	@RequestMapping("/showVendors")
	public String createVendor() {
		
		return "createVendor";
	}
	
	
	@RequestMapping("/saveVendor")
	public String saveVendor(@ModelAttribute("vendors")Vendors vendors, ModelMap modelMap) {
		
		Vendors vendorsSaved = service.saveVendors(vendors);
		String msg = "Vendor saved with id: " + vendorsSaved.getId();
		modelMap.addAttribute("msg",msg);
		emailUtil.sendEmail("johnqatwork21@gmail.com", "Vendor Saved", "Vendor with id of "+ vendorsSaved.getId()+" has been saved");
		return "createVendor";
	}
	
	
	@RequestMapping("/displayVendors")
	public String displayVendors(ModelMap modelMap) {
		List<Vendors> vendors = service.getAllVendors();
		modelMap.addAttribute("vendors",vendors);
		return "displayVendors";
	}
	
	
	
	@RequestMapping("/showVendors2")
	public String showVendors() {
		
		service.getAllVendors();
		return "displayVendors";
		
	}
	
	
	@RequestMapping("/deleteVendor")
	public String deleteVendor(@RequestParam("id") int id, ModelMap modelMap) {
		Vendors vendorid = service.getVendorById(id);
		service.deleteVendors(vendorid);
		String msg = "Vendor with id of "+ vendorid.getId()+ " has been deleted";
		modelMap.addAttribute("msg"	, msg);
		List<Vendors> allVendors = service.getAllVendors();
		modelMap.addAttribute("vendors",allVendors);
		emailUtil.sendEmail("johnqatwork21@gmail.com", "Vendor Deleted", "Vendor with id of "+ vendorid.getId()+" has been deleted");
		return "displayVendors";
		
	}
	@RequestMapping("/showUpdate")
	public String showUpdate(@RequestParam("id")int id, ModelMap modelMap) {
		Vendors vendor = service.getVendorById(id);
		modelMap.addAttribute("vendor", vendor);
		String msg = "Vendor with id of "+ vendor.getId()+ " has been updated";
		modelMap.addAttribute("msg"	, msg);
		return "updateVendor";
	}
	
	@RequestMapping("/updateVendor")
	public String updateVendor(@ModelAttribute("vendors")Vendors vendors, ModelMap modelMap) {
		service.updateVendors(vendors);
		List<Vendors> allvendors = service.getAllVendors();
		modelMap.addAttribute("vendors",allvendors);
		String msg="Vendor has been updated "; 
		modelMap.addAttribute("msg",msg);
		return"displayVendors";
	}
	

}
