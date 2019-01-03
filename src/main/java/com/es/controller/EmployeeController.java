package com.es.controller;


import com.es.dataprovider.EmployeeDataProvider;
import com.es.po.Employee;
import com.es.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String add(){
        Employee employee = EmployeeDataProvider.newEmployee();
        boolean added = employeeService.addEmployee(employee);
        if(added){
            return "success";
        }
        return "faliure";
    }
}
