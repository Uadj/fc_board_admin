package com.example.fc_board_admin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Configuration
public class ThymeleafConfig {

    @Bean
    public SpringResourceTemplateResolver thymleafTemplateResolver(
            SpringResourceTemplateResolver defaultTemplateResolver,
            Thymeleaf3Properties thymeleaf3Properties
    ){
        defaultTemplateResolver.setUseDecoupledLogic(thymeleaf3Properties.decoupledLogic());

        return defaultTemplateResolver;
    }

    @ConfigurationProperties("spring.thymeleaf3")
    public record Thymeleaf3Properties(boolean decoupledLogic){}
}
