package com.natraj.Springboot.practice.service;

import com.natraj.Springboot.practice.entity.Department;
import com.natraj.Springboot.practice.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // we add this annotate to know this is our service implementation for it
public class DepartmentServiceImpL implements DepartmentService {

    @Autowired // object will be attached to this particular reference by spring
    private DepartmentRepository departmentRepository;
    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);//with this method our department will save to my database.
    }

    @Override
    public List<Department> fetchDepartmentList() {
        return departmentRepository.findAll();//this particular method will get all the departments available in our db
    }

    @Override
    public Department fetchDepartmentById(Long departmentId) {
        return departmentRepository.findById(departmentId).get();
    }

    @Override
    public void deleteDepartmentById(Long departmentId) {
        departmentRepository.deleteById(departmentId);
    }
}



