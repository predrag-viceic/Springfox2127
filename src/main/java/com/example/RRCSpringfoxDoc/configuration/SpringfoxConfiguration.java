package com.example.RRCSpringfoxDoc.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

@EnableSwagger2WebMvc
@Configuration
@Import({
    springfox.documentation.spring.data.rest.configuration.SpringDataRestConfiguration.class,
    springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration.class})
public class SpringfoxConfiguration {


	private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Bean
    public Docket api() { 
    	   	
        return new Docket(DocumentationType.SWAGGER_2)
        	.select()
        	.build()
        	.pathMapping("/");

    }
    
    @Bean
    ApiInfo apiInfo() {
        final ApiInfoBuilder builder = new ApiInfoBuilder();
        builder.title("Test API")
        		.version("1.0.0");
        return builder.build();
    }
}
