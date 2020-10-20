/**
 * ClassName:testDao
 * Author:
 * Date:2020/10/20
 * Description:TODO
 */

package com.test.demo.dao;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface testDao {

    @Select("select * from student")
    List<Map<String,Object>> select();

    @Select("insert into role(name,nameZh) VALUES(#{name},#{value})")
    List<Map<String,Object>> insert(String name,String value);
}
