package com.es.service;

import com.es.dao.EmployeeDao;
import com.es.po.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;


    public boolean addEmployee(Employee employee) {
        Employee r = employeeDao.index(employee);
        if(r != null){
            return true;
        }
        return false;
    }
}
