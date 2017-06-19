package com.altimetrik.CCIndex.api.service;

import com.altimetrik.CCIndex.models.Employeeccindex;


import com.altimetrik.CCIndex.exception.NotFoundException;
import java.util.List;

public interface EmployeeccindexApiService {
  
      List<Employeeccindex> findAllEmployeeccindex()
      throws NotFoundException;
  
      Employeeccindex updateEmployeeccindex(Employeeccindex employeeccindex)
      throws NotFoundException;
  
      Employeeccindex addEmployeeccindex(Employeeccindex employeeccindex)
      throws NotFoundException;
  
      Employeeccindex findByIdEmployeeccindex(String id)
      throws NotFoundException;
  
      void deleteEmployeeccindex(String id)
      throws NotFoundException;
  
}

