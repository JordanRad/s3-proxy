package com.example.proxygateway;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("")
public class InfoController {
    @GetMapping("/")
    public ResponseEntity<?> index(){
        return  new ResponseEntity("Welcome to Jordan's webshop proxy gateway", HttpStatus.OK);
    }
}
