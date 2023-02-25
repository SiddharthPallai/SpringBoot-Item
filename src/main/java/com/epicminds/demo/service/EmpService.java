package com.epicminds.demo.service;

import com.epicminds.demo.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Sidharth
 */

public interface EmpService {

    public Employee add(Employee employee);
    public Employee edit(Integer id, Employee employee);
    public void delete(Integer id);

    public Employee get(Integer id);
    public List<Employee> getAllEmp();

}
