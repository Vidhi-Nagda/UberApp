package com.vidhi.project.uber.uberapp.services.impl;

import com.vidhi.project.uber.uberapp.dto.DriverDto;
import com.vidhi.project.uber.uberapp.dto.SignupDto;
import com.vidhi.project.uber.uberapp.dto.UserDto;
import com.vidhi.project.uber.uberapp.entities.Rider;
import com.vidhi.project.uber.uberapp.entities.User;
import com.vidhi.project.uber.uberapp.entities.enums.Role;
import com.vidhi.project.uber.uberapp.exceptions.RunTimeConflictException;
import com.vidhi.project.uber.uberapp.repositories.UserRepository;
import com.vidhi.project.uber.uberapp.services.AuthService;
import com.vidhi.project.uber.uberapp.services.RiderService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final ModelMapper modelMapper;
    private final UserRepository userRepository;
    private final RiderService riderService;
    @Override
    public String login(String email, String password) {
        return null;
    }

    @Override
    public UserDto signup(SignupDto signupDto) {
        User user = userRepository.findByEmail(signupDto.getEmail()).orElse(null);
        if(user!=null) {
            throw new RunTimeConflictException("Cannot signup, User already exists with email"+ signupDto.getEmail());
        }
        User mappedUser = modelMapper.map(signupDto, User.class);
        mappedUser.setRoles(Set.of(Role.RIDER));
        User savedUser = userRepository.save(mappedUser);

        // create user related entities
        riderService.createNewRider(savedUser);
        // TODO: Add wallet related services
        return modelMapper.map(savedUser,UserDto.class);
    }

    @Override
    public DriverDto onboardNewDriver(Long userId) {
        return null;
    }
}
