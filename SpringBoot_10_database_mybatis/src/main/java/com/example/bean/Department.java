package com.example.bean;

import org.springframework.data.relational.core.sql.In;

/**
 * @Author Huang
 * @ClassName Department
 * @Description
 * @Date 2022/8/18 0:19
 * @Version 1.0
 **/
public class Department {
    private Integer id;
    private String departmentName;

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", department='" + departmentName + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartment() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
