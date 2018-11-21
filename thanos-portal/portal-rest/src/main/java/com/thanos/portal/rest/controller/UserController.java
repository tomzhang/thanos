package com.thanos.portal.rest.controller;

import com.thanos.portal.app.UserApp;
import com.thanos.portal.domain.identity.User;
import com.thanos.portal.domain.identity.command.UserSave;
import io.swagger.annotations.ApiOperation;
import javax.annotation.Resource;
import org.bson.types.ObjectId;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by zhangzheng on 7/20/18
 * Email:zhangzheng@youzan.com
 */
@RestController
@RequestMapping("/users")
public class UserController {
  @Resource
  UserApp userApp;


  @PostMapping
  @ApiOperation(value = "新增用户")
  public void save(@RequestBody UserSave userSave){
    userSave.validate();
    userApp.save(userSave);
  }

  @GetMapping("/{id}")
  @ApiOperation(value = "查询用户信息")
  public User detail(@PathVariable("id") ObjectId id){
    return userApp.detail(id);
  }




}
