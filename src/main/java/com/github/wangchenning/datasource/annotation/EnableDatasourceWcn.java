package com.github.wangchenning.datasource.annotation;

import com.github.wangchenning.autoConfig.DataSourceAutoConfig;
import com.github.wangchenning.datasource.register.DynamicDataSourceRegister;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({DataSourceAutoConfig.class,DynamicDataSourceRegister.class})
public @interface EnableDatasourceWcn {
}
