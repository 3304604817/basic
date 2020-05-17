package com.supers.basic.service.impl;

import com.supers.basic.domain.entity.IamUser;
import com.supers.basic.repository.UserRepository;
import com.supers.basic.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<IamUser> list(IamUser dto){
        return userRepository.list(dto);
    }
}
