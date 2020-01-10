package com.asiainfo.soufang.repository;

import com.asiainfo.soufang.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * @author qml
 * @date 2020/1/10 0010 22:09
 */
public interface UserRepository extends CrudRepository<User,Long> {

}
