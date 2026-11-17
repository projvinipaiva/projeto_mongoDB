package com.vinipaiva.workshopmongo.services;

import com.vinipaiva.workshopmongo.domain.User;
import com.vinipaiva.workshopmongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findALL(){
        return repo.findAll();
    }

}
