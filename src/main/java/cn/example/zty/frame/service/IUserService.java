package cn.example.zty.frame.service;

import cn.example.zty.frame.domain.vo.UserVO;

import java.util.List;

// 查询信息

public interface IUserService {
    List<UserVO> queryUserList();


    UserVO queryUserInfo(String uId);

}
