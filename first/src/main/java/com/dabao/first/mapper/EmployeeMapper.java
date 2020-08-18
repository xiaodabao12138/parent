package com.dabao.first.mapper;


import com.dabao.first.entity.Employee;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeMapper {

    Employee getById(int id);

    void insert(Employee employee);
}
