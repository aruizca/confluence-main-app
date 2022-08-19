package com.aruizca.confluence.mainapp.service;

import com.aruizca.confluence.mainapp.api.OtherService;
import com.atlassian.plugin.spring.scanner.annotation.export.ExportAsService;
import org.springframework.stereotype.Component;

@ExportAsService({OtherService.class})
@Component
public class OtherServiceImpl implements OtherService {
    public String getMessage() {
        return "message from main app";
    }
}
