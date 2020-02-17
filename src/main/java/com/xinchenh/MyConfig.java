package com.xinchenh;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@ComponentScan("com.xinchenh")
@Configuration
public class MyConfig extends WebMvcConfigurerAdapter {
    /*需要这个annotation*/
    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver vr = new InternalResourceViewResolver();
        vr.setPrefix("/WEB-INF/"); //在这个文件夹下搜索
        vr.setSuffix(".jsp"); //以什么作为后缀 .html .js
        return vr;
    }
}
