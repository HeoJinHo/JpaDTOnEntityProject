package com.example.jpaentityproject.task.domain;

import com.example.jpaentityproject.task.dto.UserDTO;
import lombok.Getter;
import lombok.NonNull;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class User {

    @Id @NonNull
    private String user_id;

    private String user_password;

    private String user_name;

    private String user_gender;

    private String user_phone;

    private int user_age;

    private String user_addr;

    private String user_addr_detail;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "p_id")
    List<UserDetail> userDetails = new ArrayList<>();

    public User(){}

    public User(UserDTO userDTO) {
        this.user_id = userDTO.getUser_id();
        this.user_password = userDTO.getUser_password();
        this.user_name = userDTO.getUser_name();
        this.user_gender = userDTO.getUser_gender();
        this.user_phone = userDTO.getUser_phone();
        this.user_age = userDTO.getUser_age();
        this.user_addr = userDTO.getUser_addr();
        this.user_addr_detail = userDTO.getUser_addr_detail();
        this.userDetails = userDTO.getUserDetails();
    }
}
