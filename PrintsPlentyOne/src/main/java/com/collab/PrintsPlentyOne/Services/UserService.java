package com.collab.PrintsPlentyOne.Services;

import org.springframework.security.core.userdetails.UserDetailsService;
import com.collab.PrintsPlentyOne.Models.User;

public interface UserService extends UserDetailsService {
    User findByUsername (String username);
    User save(UserRegistrationDto registration);

}
