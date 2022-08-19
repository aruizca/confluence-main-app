package com.aruizca.confluence.mainapp.service;

import com.aruizca.confluence.mainapp.api.MainService;
import com.aruizca.confluence.sampleapp.api.SampleService;
import org.springframework.stereotype.Component;

@Component
public class MainServiceImpl implements MainService {

    private final SampleService sampleService;

    public MainServiceImpl(SampleService sampleService) {
        this.sampleService = sampleService;
        System.out.println("MainService sampleService " + sampleService.getMessage());
    }

    public String getMessage() {
        return sampleService.getMessage();
    }
}
