package com.aruizca.confluence.mainapp.service;

import com.aruizca.confluence.mainapp.api.MainSimpleService;
import org.springframework.stereotype.Component;

@Component
public class MainSimpleServiceImpl implements MainSimpleService {

    @Override
    public String getMessage() {
        return "I'm a simple service";
    }
}
