package com.Marketing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Marketing.DTO.LeadData;
import com.Marketing.Entities.Lead;
import com.Marketing.services.LeadService;
import com.Marketing.util.EmailService;

@Controller
public class LeadController {
	
	@Autowired
	private LeadService leadService;
	
	@Autowired
	private EmailService emailservice;
	
	//handler method
	//http://localhost:8080/create
	@RequestMapping("/create")
	public String viewCreateLeadPage() {
		return "create_lead";
	}
	
	@RequestMapping("/saveLead")
	public String saveOneLead(@ModelAttribute("l") Lead lead, Model model) {
		leadService.saveLeadInfo(lead);
		emailservice.sendEmail(lead.getEmail(), "india vs england match", "there is match against india vs england today, please be ready with all things.");
		model.addAttribute("msg", "record is saved!!");
		return "create_lead";
	}	
//	@RequestMapping("/saveLead")
//	public String saveOneLead(@RequestParam("firstName") String firstName,@RequestParam("lastName") String lastName,@RequestParam("email") String email,@RequestParam("mobile") String mobile, ModelMap model) {
//		
//		Lead lead= new Lead();
//		lead.setFirstName(firstName);
//		lead.setLastName(lastName);
//		lead.setEmail(email);
//		lead.setMobile(mobile);
//		leadService.saveLeadInfo(lead);
//		model.addAttribute("msg", "record is saved!!");
//		return "create_lead";
//	}
//	@RequestMapping("/saveLead")
//		public String saveOneLead(LeadData leadData, Model model) {
//		Lead lead= new Lead();
//		lead.setFirstName(leadData.getFirstName());
//		lead.setLastName(leadData.getLastName());
//		lead.setEmail(leadData.getEmail());
//		lead.setMobile(leadData.getMobile());
//		leadService.saveLeadInfo(lead);
//		
//			model.addAttribute("msg", "record is saved!!");
//	
//			
//			return "create_lead";
	
	//http://localhost:8080/listall
			@RequestMapping("/listall")
			public String listAllLeads(Model model) {
				List<Lead> leads=leadService.getLeads();
				model.addAttribute("leads", leads);
			
				return "list_leads";			
}
			@RequestMapping("/delete")
			public String deleteOneLead(@RequestParam("id") long id,Model model) {
				leadService.deleteId(id);
				List<Lead> leads = leadService.getLeads();
				model.addAttribute("leads", leads);
				return "list_leads";
}
			@RequestMapping("/update")
		public String getLeadInfo(@RequestParam("id") long id, Model model) {
				Lead lead=leadService.getOneLead(id);
				model.addAttribute("lead", lead);
				return "update_lead";
			}

			@RequestMapping("/updateLead")
		public 	String updateLeadInfo(LeadData data, Model model) {
				Lead l= new Lead();
				l.setId(data.getId());
				l.setFirstName(data.getFirstName());
				l.setLastName(data.getLastName());
				l.setEmail(data.getEmail());
				l.setMobile(data.getMobile());
				leadService.saveLeadInfo(l);
				List<Lead> leads = leadService.getLeads();
				model.addAttribute("leads", leads);
				return "list_leads";
				
			}
			
     
}
