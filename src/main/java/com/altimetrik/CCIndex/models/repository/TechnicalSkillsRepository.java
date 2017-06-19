package com.altimetrik.CCIndex.models.repository;

import com.altimetrik.CCIndex.models.*;



import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface TechnicalSkillsRepository extends MongoRepository<TechnicalSkills, Long>{

}



