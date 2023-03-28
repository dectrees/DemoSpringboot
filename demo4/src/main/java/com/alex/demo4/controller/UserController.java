package com.alex.demo4.controller;

import com.alex.demo4.common.ResponseResult;
import com.alex.demo4.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 3/26/2023, Sunday
 **/
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    // 注意：这里@Autowired是报错的，因为@Autowired按照类名注入的
    @Resource
    private RedisTemplate<String, User> redisTemplate;

    /**
     * @param user user param
     * @return user
     */
//    @ApiOperation("Add")
    @PostMapping("add")
    public ResponseResult<User> add(@RequestBody User user) {
        log.info("set key:"+user.getId());
        redisTemplate.opsForValue().set(String.valueOf(user.getId()), user);
        return ResponseResult.success(redisTemplate.opsForValue().get(String.valueOf(user.getId())));
    }

    /**
     * @return user list
     */
//    @ApiOperation("Find")
    @GetMapping("find/{userId}")
    public ResponseResult<User> edit(@PathVariable("userId") String userId) {
        log.info("find id:"+userId);
        return ResponseResult.success(redisTemplate.opsForValue().get(userId));
    }

}

