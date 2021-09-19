package com.example.jpaentityproject.services;

import com.example.jpaentityproject.task.domain.User;
import com.example.jpaentityproject.task.dto.UserDTO;

public interface UserSv {

    UserDTO userSetInsert(UserDTO userDTO);


    default User dtoToEntity(UserDTO dto){
        User entity = User.builder()
                .user_id(dto.getUser_id())
                .user_name(dto.getUser_name())
                .user_gender(dto.getUser_gender())
                .user_phone(dto.getUser_phone())
                .user_age(dto.getUser_age())
                .user_addr(dto.getUser_addr())
                .user_addr_detail(dto.getUser_addr_detail())
                .userDetails(dto.getUserDetails())
                .build();
        return entity;
    }

    default UserDTO entityToDto(User user){
        UserDTO dto = UserDTO.builder()
                .user_id(user.getUser_id())
                .user_name(user.getUser_name())
                .user_gender(user.getUser_gender())
                .user_phone(user.getUser_phone())
                .user_age(user.getUser_age())
                .user_addr(user.getUser_addr())
                .user_addr_detail(user.getUser_addr_detail())
                .userDetails(user.getUserDetails())
                .build();
        return dto;
    }


}
