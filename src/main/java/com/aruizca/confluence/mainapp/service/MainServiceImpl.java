package com.aruizca.confluence.mainapp.service;

import com.aruizca.confluence.mainapp.api.MainService;
import com.aruizca.confluence.sampleapp.api.SampleService;
import com.atlassian.plugin.spring.scanner.annotation.imports.ComponentImport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MainServiceImpl implements MainService {

    private final SampleService sampleService;

    @Autowired
    public MainServiceImpl(@ComponentImport SampleService sampleService) {
        this.sampleService = sampleService;
        System.out.println("MainService sampleService " + sampleService.getMessage());
    }

    public void initialize() {
        System.out.println("MainService is using " + sampleService.getMessage());
    }
}
