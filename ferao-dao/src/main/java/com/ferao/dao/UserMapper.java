package com.ferao.dao;

import com.ferao.pojo.User;
import org.springframework.stereotype.Component;
import java.util.List;

/**
 * 用户持久层接口
 */
@Component
public interface UserMapper {

    /**
     * 查找所有用户
     * @return
     */
    List<User> findAll();

}
