package com.epicminds.demo.controller;

import com.epicminds.demo.model.Employee;
import com.epicminds.demo.model.Item;
import com.epicminds.demo.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Sidharth
 */

@RestController
@RequestMapping("api/v2" )
public class EmpController {

    @Autowired
    EmpService empService;

    @PostMapping("/employees/add")
    public ResponseEntity<Employee> createEmp(@RequestBody Employee employee){
        return new ResponseEntity<Employee>(empService.add(employee), HttpStatus.CREATED);
    }

    @GetMapping("/employees/emps")
    public List<Employee> getItems() {
        return empService.getAllEmp();
    }

}
