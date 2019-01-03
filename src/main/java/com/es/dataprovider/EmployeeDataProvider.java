package com.es.dataprovider;

import com.es.po.Employee;

import java.util.Random;

public class EmployeeDataProvider {


    public static Employee newEmployee() {
        Random random = new Random();
        int bound = 1000000000;
        Employee employee = new Employee();
        employee.setAbout("about"+random.nextInt(bound));
        employee.setId(String.valueOf(random.nextInt(bound)));
        employee.setAge(random.nextInt(bound));
        employee.setFirstName("joe" + random.nextInt(bound));
        employee.setLastName("last" + random.nextInt(bound));
        return employee;
    }
}
