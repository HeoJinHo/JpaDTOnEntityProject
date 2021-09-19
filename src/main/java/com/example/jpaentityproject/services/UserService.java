package com.example.jpaentityproject.services;

import com.example.jpaentityproject.repository.UserRepository;
import com.example.jpaentityproject.task.domain.User;
import com.example.jpaentityproject.task.domain.UserDetail;
import com.example.jpaentityproject.task.dto.UserDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;


    public UserDTO userSetInsert(UserDTO userDTO){

        for(UserDetail d : userDTO.getUserDetails()){
            System.out.println();
        }
        User save = repository.save(new User(userDTO));
        return new UserDTO(save);
    }

}
