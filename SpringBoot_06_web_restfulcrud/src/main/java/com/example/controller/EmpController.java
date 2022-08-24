package com.example.controller;

import com.example.dao.DepartmentDao;
import com.example.dao.EmployeeDao;
import com.example.entities.Department;
import com.example.entities.Employee;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @Author Huang
 * @ClassName EmpsController
 * @Description
 * @Date 2022/8/15 23:19
 * @Version 1.0
 **/

@Controller
@RequestMapping("/emps")
public class EmpController {

    @Autowired
    private EmployeeDao dao;

    @Autowired
    private DepartmentDao departmentDao;

    //返回回所有员工列表
    @GetMapping
    public String list(Model model) {
        Collection<Employee> employees = dao.getAll();
        model.addAttribute("emps", employees);
        return "emp/list";
    }

    //跳转员工添加页面
    @GetMapping("/emp")
    public String toAddPage(Model model) {
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("depts", departments);
        return "emp/add";
    }

    //员工添加
    @PostMapping
    public String addEmp(Employee employee) {

        System.out.println("employee = " + employee);
        //保存员工
        dao.save(employee);
        //redirect: 重定向
        //forward: 资源转发
        return "redirect:/emps";
    }

    //员工跳转修改页面
    @GetMapping("/emp/{id}")
    public String toEditPage(@PathVariable("id") Integer id, Model model) {

        //查询员工和部门信息
        Employee employee = dao.get(id);
        model.addAttribute("emp", employee);
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("depts", departments);
        return "emp/add";
    }

    //员工修改
    @PutMapping
    public String toUpdateEmp(Employee employee) {
        System.out.println(employee);
        dao.save(employee);
        return "redirect:/emps";
    }

    //员工删除
    @DeleteMapping("/{id}")
    public String toDeleteEmp(@PathVariable("id") Integer id) {
        dao.delete(id);
        return "redirect:/emps";
    }

}
