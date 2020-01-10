package com.asiainfo.soufang.entity;

import com.asiainfo.soufang.ApplicationTests;
import com.asiainfo.soufang.repository.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author qml
 * @date 2020/1/10 0010 22:14
 */
public class UserRepositoryTest extends ApplicationTests {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void testFindOne(){
        User user = userRepository.findOne(1L);
        Assert.assertEquals("wali",user.getName());
    }
}
