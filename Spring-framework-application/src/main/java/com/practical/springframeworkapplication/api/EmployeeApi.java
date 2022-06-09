package com.practical.springframeworkapplication.api;

import com.practical.springframeworkapplication.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.practical.springframeworkapplication.service.EmployeeService;

@CrossOrigin(value = "*")
@RestController
@RequestMapping(path="api/v1/employees")
public class EmployeeApi {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Iterable<Employee>> findAll(){
        return ResponseEntity.ok(employeeService.findAll());
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Employee> save(@RequestBody Employee employee){
        return ResponseEntity.ok(employeeService.save(employee));
    }
}
