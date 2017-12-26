package com.w.smb.mapping;

import com.w.smb.bean.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper{

  /*  @InsertProvider(type = d.class, method = "dss")
    void insert(User user);
    @Select("select * from user")
    @Options(fetchSize = 500)
    List<User> select();
    class d {
        public String dss(User user){
            String sql = "INSERT INTO users(id,username,password) VALUES (#{id})";
            return sql;
        }
    }*/
  /*@Insert("Insert into users(id,username,password) values (#{id},#{username},#{password})")
  void insert(User user);

  @Select("select * from users where username in (#{usernames})")
  List<User> select(String usernames);*/

  @Insert("insert into users values (#{id},#{username},#{password})")
  void insert(User user);
}
