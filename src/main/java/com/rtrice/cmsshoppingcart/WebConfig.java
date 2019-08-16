package com.rtrice.cmsshoppingcart;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * WebConfig
 */
// configuration annotation indicates to spring that this is a configuration
// class that will provide beans to the spring application context
@Configuration
// this webconfig class should implement the web MVC configure which defines the
// several methods for configuring Spring MVC. It provides default implentations
// of all its methods. So when you implement you just need to overide the ones
// you need.
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("home");
    }

}