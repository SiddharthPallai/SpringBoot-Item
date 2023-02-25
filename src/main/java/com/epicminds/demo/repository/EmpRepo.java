package com.epicminds.demo.repository;

import com.epicminds.demo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Sidharth
 */
public interface EmpRepo extends JpaRepository<Employee, Integer> {

}
