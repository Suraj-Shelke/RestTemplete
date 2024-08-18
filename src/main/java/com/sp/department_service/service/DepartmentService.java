package com.sp.department_service.service;

import com.sp.department_service.dao.DepartmentRepository;
import com.sp.department_service.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public interface DepartmentService {
    Department saveDepartment(Department department);

    Department getDepartmentById(Long departmentId);

}
