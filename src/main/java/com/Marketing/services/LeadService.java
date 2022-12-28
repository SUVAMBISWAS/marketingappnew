package com.Marketing.services;

import java.util.List;

import com.Marketing.Entities.Lead;

public interface LeadService {
	
	public void saveLeadInfo(Lead lead);

	public List<Lead> getLeads();

	public void deleteId(long id);

	public Lead getOneLead(long id);


	

}
