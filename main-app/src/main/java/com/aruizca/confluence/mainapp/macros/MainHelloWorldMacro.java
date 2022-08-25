package com.aruizca.confluence.mainapp.macros;

import com.aruizca.confluence.mainapp.api.MainService;
import com.atlassian.confluence.content.render.xhtml.ConversionContext;
import com.atlassian.confluence.macro.Macro;
import com.atlassian.confluence.macro.MacroExecutionException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

public class MainHelloWorldMacro implements Macro {

    private final MainService mainService;

    @Autowired
    public MainHelloWorldMacro(MainService mainService) {
        this.mainService = mainService;
    }

    public String execute(Map<String, String> map, String s, ConversionContext conversionContext) throws MacroExecutionException {
        return "<h2>Hello World using " + mainService.getMessage() + "</h2>";
    }

    public BodyType getBodyType() {
        return BodyType.PLAIN_TEXT;
    }

    public OutputType getOutputType() {
        return OutputType.INLINE;
    }
}