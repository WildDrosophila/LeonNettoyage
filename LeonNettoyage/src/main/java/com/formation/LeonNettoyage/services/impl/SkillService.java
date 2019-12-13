package com.formation.LeonNettoyage.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formation.LeonNettoyage.persistence.entities.Skill;
import com.formation.LeonNettoyage.persistence.repositories.ISkillRepository;
import com.formation.LeonNettoyage.services.ISkillService;
import com.formation.LeonNettoyage.services.common.AbstractService;

@Service
@Transactional
public class SkillService extends AbstractService<Skill> implements ISkillService {
	
	@Autowired
	private ISkillRepository repo;
	
	public JpaRepository<Skill, Long> getRepo() {
		return repo;
	}

}
