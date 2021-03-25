package com.bic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bic.dto.AuthenticationRequest;
import com.bic.util.JwtUtil;

@RestController
public class UserCntr {

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private AuthenticationManager authenticationManager;

    @GetMapping("/")
    public String Hello() {
	return "Hello";
    }

    @PostMapping("/authenticate")
    public String generateToken(@RequestBody AuthenticationRequest authRequest) throws Exception {
	try {
	    authenticationManager.authenticate(
		    new UsernamePasswordAuthenticationToken(authRequest.getUserName(), authRequest.getPassword()));
	} catch (Exception ex) {
	    throw new Exception("inavalid username/password");
	}
	return jwtUtil.generateToken(authRequest.getUserName());
    }

}
