package com.chen.cat.config;

import com.chen.cat.plugin.CatMybatisInterceptor;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
public class CatMybatisConfig {
    @Value("${spring.datasource.url}")
    private String jdbcUrl;

    private String mapperLocations = "classpath:mapper";
    @Bean
    public SqlSessionFactory mysqlSessionFactory(DataSource mysqlDataSource) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(mysqlDataSource);
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sqlSessionFactoryBean.setMapperLocations(resolver.getResources(mapperLocations));
        sqlSessionFactoryBean.setPlugins(new Interceptor[]{new CatMybatisInterceptor(jdbcUrl)});
        return sqlSessionFactoryBean.getObject();
    }
}
