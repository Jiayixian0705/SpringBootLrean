package com.example.mapper;

import com.example.bean.Department;
import org.apache.ibatis.annotations.*;

/**
 * @Author Huang
 * @ClassName DepartmentMapper
 * @Description
 * @Date 2022/8/18 0:29
 * @Version 1.0
 **/
/*注解版本*/
@Mapper
public interface DepartmentMapper {

    @Select("select * from department where id=#{id}")
    public Department getDeptById(Integer id);

    @Delete("delete from department where id=#{id}")
    public int deleteDeptById(Integer id);

    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into department(departmentName) values(#{departmentName})")
    public int insertDept(Department department);

    @Update("update department set departmentName=#{departmentName} where id=#{id}")
    public int updateDept(Department department);
}
