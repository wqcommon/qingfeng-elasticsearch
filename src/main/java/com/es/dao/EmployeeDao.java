package com.es.dao;

import com.es.po.Employee;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeDao extends ElasticsearchRepository<Employee,String>{


    List<Employee> findByFirstNameAndAge(String firstName, Integer age);

    List<Employee> findByFirstNameOrAge(String firstName,Integer age);
}
