package com.example.mapper;

import com.example.bean.Department;
import com.example.bean.Employee;
import org.apache.ibatis.annotations.*;

/**
 * @Author Huang
 * @InterfaceName Employee
 * @Description
 * @Date 2022/8/18 0:59
 * @Version 1.0
 **/
@Mapper
public interface EmployeeMapper {

    public Employee getEmpById(Integer id);

    public int insertEmp(Employee employee);
}
