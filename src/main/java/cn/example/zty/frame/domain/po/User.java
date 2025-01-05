package cn.example.zty.frame.domain.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    /**'Auto-increment ID' */
    private Long id;
    /** 'User ID'*/
    private String userId;
    /** 'User Nickname'*/
    private String userNickname;
    /** 'User Avatar'*/
    private String userHead;
    /** 'User Password'*/
    private String userPassword;
    /** 'Creation Time'*/
    private Date createTime;
    /** 'Update Time'*/
    private Date updateTime;


}
