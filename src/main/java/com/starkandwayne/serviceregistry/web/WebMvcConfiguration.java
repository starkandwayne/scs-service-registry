package com.starkandwayne.serviceregistry.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfiguration implements WebMvcConfigurer {
   public void addViewControllers(ViewControllerRegistry registry) {
      registry.addViewController("/dashboard").setViewName("/dashboard/index.html");
   }
}
