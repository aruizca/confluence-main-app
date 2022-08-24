package com.aruizca.confluence.mainapp.service;

import com.aruizca.confluence.mainapp.api.ParentService;
import com.atlassian.plugin.spring.scanner.annotation.export.ExportAsService;
import org.springframework.stereotype.Component;

@ExportAsService({ParentService.class})
@Component
public class ParentServiceImpl implements ParentService {
    public String getMessage() {
        return "message from main app";
    }
}
