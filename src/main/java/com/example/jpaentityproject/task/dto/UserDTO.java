package com.example.jpaentityproject.task.dto;

import com.example.jpaentityproject.task.domain.User;
import com.example.jpaentityproject.task.domain.UserDetail;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class UserDTO {

    private String user_id;

    private String user_password;

    private String user_name;

    private String user_gender;

    private String user_phone;

    private int user_age;

    private String user_addr;

    private String user_addr_detail;

    List<UserDetail> userDetails = new ArrayList<>();

    public UserDTO() {}

    public UserDTO(User user) {
        this.user_id = user.getUser_id();
        this.user_password = user.getUser_password();
        this.user_name = user.getUser_name();
        this.user_gender = user.getUser_gender();
        this.user_phone = user.getUser_phone();
        this.user_age = user.getUser_age();
        this.user_addr = user.getUser_addr();
        this.user_addr_detail = user.getUser_addr_detail();
        this.userDetails = user.getUserDetails();
    }
}
