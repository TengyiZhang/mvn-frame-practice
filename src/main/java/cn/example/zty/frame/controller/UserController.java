package cn.example.zty.frame.controller;

import cn.example.zty.frame.common.Result;
import cn.example.zty.frame.domain.res.UserRes;
import cn.example.zty.frame.domain.vo.UserVO;
import cn.example.zty.frame.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RestController
public class UserController {
    @Resource
    private IUserService userService;

    /**
     * http://localhost:8089/queryUserInfo
     */
    @RequestMapping("queryUserInfo")
    public UserRes queryUserInfo() {
        try {
            log.info("查询用户信息");
            List<UserVO> userVOList = userService.queryUserList();
            return UserRes.builder().userVOList(userVOList).result(Result.buildSuccess()).build();
        } catch (Exception e) {
            log.error("查询用户信息失败", e);
            return UserRes.builder().result(Result.buildSuccess()).build();
        }
    }

}
