package com.tngtech.confluence.plugins.example.atlassiancachecrash;

import com.atlassian.cache.CacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static com.atlassian.plugins.osgi.javaconfig.OsgiServices.importOsgiService;

@Configuration
public class SpringConfig {
    @Bean
    public CacheManager cacheManager() {
        return importOsgiService(CacheManager.class);
    }
}
