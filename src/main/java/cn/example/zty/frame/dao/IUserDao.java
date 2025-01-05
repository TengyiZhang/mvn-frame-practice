package cn.example.zty.frame.dao;

import cn.example.zty.frame.domain.po.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

//用户的DAO 操作
@Mapper
public interface IUserDao {
    List<User> queryUserList();
}
