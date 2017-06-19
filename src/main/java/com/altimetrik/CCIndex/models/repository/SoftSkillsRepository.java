package com.altimetrik.CCIndex.models.repository;

import com.altimetrik.CCIndex.models.*;



import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface SoftSkillsRepository extends MongoRepository<SoftSkills, Long>{

}



