package com.kidchai.tacocloud.security;

import com.kidchai.tacocloud.data.UserRepository;
import com.kidchai.tacocloud.models.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    public interface UserDetailsService {
        UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
    }

    @Bean
    public UserDetailsService userDetailsService(UserRepository userRepo) {
        return username -> {
            User user = userRepo.findByUsername(username);
            if (user != null) return user;
            throw new UsernameNotFoundException("User ‘" + username + "’ not found");
        };
    }


    @Bean
    SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http.authorizeHttpRequests(authorizeHttpRequests -> {
            authorizeHttpRequests.requestMatchers("/design", "/orders").authenticated();
            authorizeHttpRequests.requestMatchers("/**").permitAll();
        });

        http.formLogin(formLogin -> formLogin.loginPage("/login"));
        http.oauth2Login(oauth2Login -> oauth2Login.loginPage("/login"));
        http.logout(logout -> logout.logoutSuccessUrl("/"));

        return http.build();
    }
}
