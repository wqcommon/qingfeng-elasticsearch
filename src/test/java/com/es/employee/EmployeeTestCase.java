package com.es.employee;

import com.alibaba.fastjson.JSONObject;
import com.es.ElasticApplication;
import com.es.dao.EmployeeDao;
import com.es.po.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ElasticApplication.class)
public class EmployeeTestCase {

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void testFindByFirstNameAndAge(){
        String firstName = "joe24865036";
        int age = 413957401;
        List<Employee> employees = employeeDao.findByFirstNameAndAge(firstName,age);
        System.out.println(JSONObject.toJSONString(employees));
        assert employees.size() == 1;
    }


    @Test
    public void testFindByFirstNameOrAge(){
        String firstName = "joe24865036";
        int age = 983922907;
        List<Employee> employees = employeeDao.findByFirstNameOrAge(firstName,age);
        System.out.println(JSONObject.toJSONString(employees));
        assert employees.size() == 2;
    }
}
