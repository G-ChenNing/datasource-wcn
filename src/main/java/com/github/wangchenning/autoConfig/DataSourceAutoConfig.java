package com.github.wangchenning.autoConfig;

import com.github.wangchenning.datasource.aop.DynamicDataSourceAnnotationAdvisor;
import com.github.wangchenning.datasource.aop.DynamicDataSourceAnnotationInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//@AutoConfigureAfter(DataSourceAutoConfiguration.class)
//@Import(DynamicDataSourceRegister.class)
public class DataSourceAutoConfig {
    @Bean
    public DynamicDataSourceAnnotationAdvisor dynamicDatasourceAnnotationAdvisor() {
        return new DynamicDataSourceAnnotationAdvisor(new DynamicDataSourceAnnotationInterceptor());
    }
}
