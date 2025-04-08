package com.ai.SpringAiDemo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ApiConfig {

    public String getApiKey() {
        return System.getenv("API_KEY");
    }
}
