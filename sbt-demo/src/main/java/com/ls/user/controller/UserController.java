package com.ls.user.controller;

import com.ls.user.convert.UserConvert;
import com.ls.user.entity.UserDO;
import com.ls.user.entity.UserVO;
import com.ls.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;

@RestController
@RequestMapping("users")
public class UserController {

    @Resource
    private UserMapper userMapper;

    private final UserConvert userConvert = UserConvert.INSTANCE;

    @GetMapping("")
    public ArrayList<UserVO> list() {
        ArrayList<UserDO> doArrayList = userMapper.getUserList();
        ArrayList<UserVO> voArrayList = new ArrayList<>();
        for (UserDO userDO : doArrayList) {
            UserVO userVO = userConvert.do2Vo(userDO);
            voArrayList.add(userVO);
        }
        return voArrayList;
    }

    @GetMapping("/{id}")
    public UserVO get(@PathVariable("id")Long id) {
        return userConvert.do2Vo(userMapper.getUserById(id));
    }

    @PostMapping("")
    public Integer create(UserDO userDO) {
        return userMapper.insertUser(userDO);
    }

    @PutMapping("")
    public Integer update(UserDO userDO) {
        return userMapper.updateUser(userDO);
    }

    @DeleteMapping("/{id}")
    public Integer delete(@PathVariable("id")Long id) {
        return userMapper.deleteUserById(id);
    }

}
