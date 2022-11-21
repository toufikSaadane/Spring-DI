package com.toufik.springdi.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"It", "default"})
@Service("i18nService")
public class I18nItalianGreetingService  implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Ciao Tutti! -- Italian Service";
    }
}

