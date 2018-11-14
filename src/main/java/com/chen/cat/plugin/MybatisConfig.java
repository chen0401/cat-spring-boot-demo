package com.kye.map.ucenter.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

@Configuration
public class MybatisConfig implements EnvironmentAware {

    private Environment environment;

    @Bean
    public DataSource getDateSource(){

        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(environment.getProperty("spring.datasource.url"));
        dataSource.setUsername(environment.getProperty("spring.datasource.username"));
        dataSource.setPassword(environment.getProperty("spring.datasource.password"));
        dataSource.setMaxActive(10);
        dataSource.setDriverClassName(environment.getProperty("spring.datasource.driverClassName"));
        dataSource.setMaxIdle(5);
        return dataSource;
    }



    @Bean
    public SqlSessionFactory getSqlSession(DataSource dataSource) throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource);
        com.dianping.cat.plugins.CatMybatisPlugin catMybatisPlugin = new com.dianping.cat.plugins.CatMybatisPlugin();
        factoryBean.setPlugins(new Interceptor[]{catMybatisPlugin});
        Resource[] resources = new PathMatchingResourcePatternResolver().getResources("classpath*:mappers/**/*.xml");
        factoryBean.setMapperLocations(resources);
        SqlSessionFactory sessionFactory = factoryBean.getObject();
        return sessionFactory;
    }

    @Bean
    public MapperScannerConfigurer getMapperScannerConfigurer(SqlSessionFactory sqlSessionFactory){
        MapperScannerConfigurer configurer = new MapperScannerConfigurer();
        configurer.setBasePackage("com.kye.map.ucenter.domain.mappers");
        configurer.setSqlSessionFactory(sqlSessionFactory);
        return configurer;
    }


    @Bean
    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
//
//    @Bean
//    @Override
//    public PlatformTransactionManager annotationDrivenTransactionManager() {
//        return new DataSourceTransactionManager(dataSource);
//    }

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
}
