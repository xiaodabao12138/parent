package com.dabao.first.controlller;

import com.dabao.first.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private IEmployeeService employeeService;

    @RequestMapping("/getById/{id}")
    public String getEmpById(@PathVariable int id){
        return employeeService.methodOne(id).toString();
    }
}
