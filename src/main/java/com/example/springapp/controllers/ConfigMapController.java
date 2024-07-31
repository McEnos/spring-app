package com.example.springapp.controllers;


import com.example.springapp.models.DbInfo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ConfigMapController {

    @Value("${application.env.db-host}")
    private String host;

    @Value("${application.env.db-name}")
    private String name;

    @Value("${application.env.debug}")
    private String debug;


    @GetMapping("/db-config")
    public DbInfo getStatus() {
        return new DbInfo(host, name, debug);
    }
}
