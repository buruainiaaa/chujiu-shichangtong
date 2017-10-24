//package com.example.demo.config;
//
//import javax.sql.DataSource;
//
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.annotation.MapperScan;
//import org.mybatis.spring.boot.autoconfigure.SpringBootVFS;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.autoconfigure.AutoConfigureAfter;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import com.alibaba.druid.pool.DruidDataSource;
//
//@Configuration
//@MapperScan(basePackages = {"org.rainbow.persistence.mysql"}, sqlSessionFactoryRef = "mysqlSqlSessionFactory")
//public class MyBatisConfig {
//	@Value("${spring.datasource.url}")
//	private String url;
//	
//	@Value("${spring.datasource.username}")
//	private String username;
//	
//	@Value("${spring.datasource.password}")
//	private String password;
//	
//	@Value("${spring.datasource.driver-class-name}")
//	private String className;
//	
//	
//	@Bean
//	public DataSource dataSource(){
//		DruidDataSource datasource = new DruidDataSource();
//		datasource.setUrl(url);  
//        datasource.setDriverClassName(className);  
//        datasource.setUsername(username);  
//        datasource.setPassword(password);  
//        return datasource;
//	}
//}
