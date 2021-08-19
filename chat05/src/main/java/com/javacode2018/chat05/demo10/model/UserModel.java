package com.javacode2018.chat05.demo10.model;

import com.javacode2018.chat05.demo10.enums.SexEnum;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserModel implements Serializable {
    private Integer id;
    private String name;
    private Integer age;
    private SexEnum sex;
}
