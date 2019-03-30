package com.briup.app03.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.briup.app03.dao")//映射文件地址
public class MybatisConfig {

}
