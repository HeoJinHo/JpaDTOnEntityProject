package com.example.jpaentityproject.task.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class UserDetail {

    @Id @GeneratedValue
    private Integer id;

    @JoinColumn(name = "user_id")
    private String p_id;

    private String family_name;

    private int family_age;

    private String family_gender;

    private String family_addr;

    private String family_addr_detail;

}
