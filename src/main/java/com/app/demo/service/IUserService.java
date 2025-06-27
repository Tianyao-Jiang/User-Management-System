package com.app.demo.service;

import com.app.demo.pojo.User;
import com.app.demo.pojo.dto.UserDto;

public interface IUserService {

    User add(UserDto user);
}
