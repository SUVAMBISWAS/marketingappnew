package com.Marketing.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Marketing.Entities.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
