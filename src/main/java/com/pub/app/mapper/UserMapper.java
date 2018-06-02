package com.pub.app.mapper;

import com.pub.app.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Mapper
public interface UserMapper {
    //根据用户编号获取用户信息
    User selectUserbyUserSysNo(@Param("sysno") int sysno);

    //获取全部用户信息
    List<User> selectAllUser();
}