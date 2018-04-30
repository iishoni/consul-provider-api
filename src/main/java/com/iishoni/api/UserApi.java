package com.iishoni.api;

import com.iishoni.model.User;
import com.iishoni.web.view.ResponseVo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(Urls.User.ROOT)
public interface UserApi {

    @GetMapping(Urls.User.GET_USER_INFO)
    ResponseVo<User> getUserInfo(@PathVariable Long userId);

    @PostMapping(Urls.User.SAVE_USER)
    ResponseVo saveUser(@RequestBody User user);

    @PutMapping(Urls.User.UPDATE_USER)
    ResponseVo updateUser(@RequestBody User user);

    @DeleteMapping(Urls.User.DELETE_USER)
    ResponseVo deleteUser(@PathVariable Long userId);

}
