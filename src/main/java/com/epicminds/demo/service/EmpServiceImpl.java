package com.epicminds.demo.service;

import com.epicminds.demo.model.Employee;
import com.epicminds.demo.repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author Sidharth
 */
@Service
public class EmpServiceImpl implements EmpService{

    @Autowired
    EmpRepo empRepo;

    @Override
    public Employee add(Employee employee) {
        if(employee == null){
            System.out.println("Employee is null");
        }
        return empRepo.save(employee);
    }

    @Override
    public Employee edit(Integer id, Employee employee) {
        Optional<Employee> e1 = empRepo.findById(id);
        Employee ee = e1.get();
        ee.setSalary(employee.getSalary());
        return empRepo.save(ee);
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public Employee get(Integer id) {
        return null;
    }

    @Override
    public List<Employee> getAllEmp() {
        return empRepo.findAll();
    }
}
