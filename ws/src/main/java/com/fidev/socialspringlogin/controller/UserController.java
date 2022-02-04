package com.fidev.socialspringlogin.controller;

import com.fidev.socialspringlogin.exception.ResourceNotFoundException;
import com.fidev.socialspringlogin.model.User;
import com.fidev.socialspringlogin.repository.UserRepository;
import com.fidev.socialspringlogin.security.CurrentUser;
import com.fidev.socialspringlogin.security.UserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user/me")
    @PreAuthorize("hasRole('USER')")
    public User getCurrentUser(@CurrentUser UserPrincipal userPrincipal) {
        return userRepository.findById(userPrincipal.getId())
                .orElseThrow(() -> new ResourceNotFoundException("User", "id", userPrincipal.getId()));
    }
}
