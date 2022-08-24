package com.example.controller;

import com.example.bean.Department;
import com.example.bean.Employee;
import com.example.mapper.DepartmentMapper;
import com.example.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Author Huang
 * @ClassName Department
 * @Description
 * @Date 2022/8/18 0:30
 * @Version 1.0
 **/
@Controller
public class DepartmentController {


    @Autowired
    private DepartmentMapper departmentMapper;

    @Autowired
    private EmployeeMapper employeeMapper;

    @ResponseBody
    @GetMapping("/depart/{id}")
    public Department getDepartmentById(@PathVariable("id") Integer id) {
        Department deptById = departmentMapper.getDeptById(id);
        return deptById;
    }

    @ResponseBody
    @GetMapping("/emp/{id}")
    public Employee getEmployeeById(@PathVariable("id") Integer id) {
        Employee employee = employeeMapper.getEmpById(id);
        return employee;
    }


    @ResponseBody
    @GetMapping("/depart")
    public Department insertDepartment(Department department) {
        departmentMapper.insertDept(department);
        return department;
    }
}
