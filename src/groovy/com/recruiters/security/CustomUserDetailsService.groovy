package com.recruiters.security

import com.recruiters.model.User
import grails.plugin.springsecurity.SpringSecurityUtils
import grails.plugin.springsecurity.userdetails.GrailsUser
import grails.plugin.springsecurity.userdetails.GrailsUserDetailsService
import org.springframework.security.core.authority.GrantedAuthorityImpl
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UsernameNotFoundException

class CustomUserDetailsService implements GrailsUserDetailsService {

    def userRepository

    UserDetails loadUserByUsername(String username, boolean loadRoles) throws UsernameNotFoundException {
        return loadUserByUsername(username)
    }

    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        log.error "Try to load user by username ${username} with userrepository ${userRepository.userMapper}"
        User user = userRepository.findByUsername(username)
        log.error "User ${user.username}"
        if (!user) throw new UsernameNotFoundException('User not found', username)

        return user
    }
}
