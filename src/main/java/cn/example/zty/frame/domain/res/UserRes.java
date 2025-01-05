package cn.example.zty.frame.domain.res;

import cn.example.zty.frame.common.Result;
import cn.example.zty.frame.domain.vo.UserVO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

//返回结果
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRes {
    private Result result;
    private List<UserVO> userVOList;
}
