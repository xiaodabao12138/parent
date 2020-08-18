package com.dabao.first.service;

import com.dabao.first.entity.Employee;
import com.dabao.first.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    public Employee methodOne(int id) {

        return employeeMapper.getById(id);
    }
}
