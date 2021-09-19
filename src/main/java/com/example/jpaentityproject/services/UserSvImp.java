package com.example.jpaentityproject.services;

import com.example.jpaentityproject.repository.UserRepository;
import com.example.jpaentityproject.task.domain.User;
import com.example.jpaentityproject.task.dto.UserDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
@RequiredArgsConstructor
public class UserSvImp implements UserSv{

    private final UserRepository repository;

    @Override
    public UserDTO userSetInsert(UserDTO userDTO) {
        log.info("DTO : " + userDTO);
        User save = repository.save(dtoToEntity(userDTO));
        log.info("Entity : " + save);
        return entityToDto(save);
    }
}
