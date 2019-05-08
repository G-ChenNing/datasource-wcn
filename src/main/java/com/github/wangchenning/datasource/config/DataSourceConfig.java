package com.github.wangchenning.datasource.config;

import com.github.wangchenning.datasource.aop.DynamicDataSourceAnnotationAdvisor;
import com.github.wangchenning.datasource.aop.DynamicDataSourceAnnotationInterceptor;
import com.github.wangchenning.datasource.register.DynamicDataSourceRegister;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(DynamicDataSourceRegister.class)
public class DataSourceConfig {
    @Bean
    public DynamicDataSourceAnnotationAdvisor dynamicDatasourceAnnotationAdvisor() {
        return new DynamicDataSourceAnnotationAdvisor(new DynamicDataSourceAnnotationInterceptor());
    }
}


