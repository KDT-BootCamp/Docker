package com.devops.study.devopsdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devops.study.devopsdemo.dao.DockerMapper;
import com.devops.study.devopsdemo.domain.UserRequestDTO;
import com.devops.study.devopsdemo.domain.UserResponseDTO;

@Service
public class DockerService {
    
    @Autowired
    private DockerMapper dockerMapper;

    public UserResponseDTO login(UserRequestDTO userRequestDTO){
        System.out.println("debug >>> service login");
        return dockerMapper.loginRow(userRequestDTO);
    }

    public void join(UserRequestDTO userRequestDTO){
        System.out.println("debug >>> service join");
        dockerMapper.joinRow(userRequestDTO);
    }

}
