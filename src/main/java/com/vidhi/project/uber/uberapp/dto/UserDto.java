package com.vidhi.project.uber.uberapp.dto;

import com.vidhi.project.uber.uberapp.entities.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private String name;
    private String email;

    private Set<Role> roles;
}
