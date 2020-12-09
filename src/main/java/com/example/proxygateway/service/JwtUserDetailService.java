package com.example.proxygateway.service;

import com.example.proxygateway.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;



@Service
public class JwtUserDetailService implements UserDetailsService {

   //Webclient
    @Autowired
    private WebClient.Builder webClientBuilder;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException
    {

        String url = String.format("http://localhost:8081/api/user/getByEmail/%s",email);
        User user = webClientBuilder
                .build()
                .get()
                .uri(url)
                .retrieve()
                .bodyToMono(User.class)
                .block();

        return new org.springframework.security.core.userdetails.User (user.getEmail(), user.getPassword(), user.getAuthorities());

    }


}