package com.aruizca.confluence.mainapp.service;

import com.aruizca.confluence.mainapp.service.api.MainServiceI;
import com.aruizca.confluence.moresampleapp.api.MoreSampleService;
import com.aruizca.confluence.newsampleapp.api.NewSampleService;
import com.aruizca.confluence.sampleapp.api.SampleService;
import org.springframework.stereotype.Component;

@Component
public class MainService implements MainServiceI {

    private final SampleService sampleService;

    public MainService(SampleService sampleService, NewSampleService newSampleService, MoreSampleService moreSampleService) {
        this.sampleService = sampleService;
        System.out.println("MainService sampleService " + sampleService.getMessage());
    }

    public void initialize() {
        System.out.println("MainService is using " + sampleService.getMessage());
    }
}
