package com.mimaraslan.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.mimaraslan.model.User;
import com.mimaraslan.repository.UserRepository;

/**
 * 
 @author Huseyin_Aydin
 @since 1994
 @category Spring Boot Security
 * 
 */


@Service
public class UserPrincipalDetailsService implements UserDetailsService {
	
	@Autowired
	private UserRepository userRepository;

    public UserPrincipalDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = this.userRepository.findByUsername(s);
        UserPrincipal userPrincipal = new UserPrincipal(user);
        return userPrincipal;
    }
}