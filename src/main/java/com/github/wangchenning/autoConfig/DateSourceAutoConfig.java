package com.github.wangchenning.autoConfig;

import com.github.wangchenning.datasource.aop.DynamicDataSourceAnnotationAdvisor;
import com.github.wangchenning.datasource.aop.DynamicDataSourceAnnotationInterceptor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty("spring.datasource.master.url")
//@AutoConfigureAfter(DataSourceAutoConfiguration.class)
//@Import(DynamicDataSourceRegister.class)
public class DateSourceAutoConfig {
    @Bean
    public DynamicDataSourceAnnotationAdvisor dynamicDatasourceAnnotationAdvisor() {
        return new DynamicDataSourceAnnotationAdvisor(new DynamicDataSourceAnnotationInterceptor());
    }
}
