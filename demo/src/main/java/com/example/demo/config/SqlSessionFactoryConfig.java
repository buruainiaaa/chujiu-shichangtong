//package com.example.demo.config;
//
//import java.util.Properties;
//
//import javax.sql.DataSource;
//
//import org.apache.ibatis.plugin.Interceptor;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.SqlSessionTemplate;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
//import org.springframework.core.io.support.ResourcePatternResolver;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//import org.springframework.transaction.PlatformTransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//import org.springframework.transaction.annotation.TransactionManagementConfigurer;
//
//
//@Configuration  
//@EnableTransactionManagement
//public class SqlSessionFactoryConfig implements TransactionManagementConfigurer  {
//
//	@Autowired
//    DataSource dataSource;
//
//    @Bean(name = "sqlSessionFactory")
//    public SqlSessionFactory sqlSessionFactoryBean() {
//        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
//        bean.setDataSource(dataSource);
//
//        //添加XML目录
//        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
//        try {
////            bean.setMapperLocations(resolver.getResources("classpath:mapper/*.xml"));
//            return bean.getObject();
//        } catch (Exception e) {
//            e.printStackTrace();
//            throw new RuntimeException(e);
//        }
//    }
//    
//    @Bean(name = "sqlSessionTemplate")					  
//    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
//    	SqlSessionTemplate sql= new SqlSessionTemplate(sqlSessionFactory);
//    	return sql;
//    }
//
//	@Override
//	public PlatformTransactionManager annotationDrivenTransactionManager() {
//		PlatformTransactionManager p=new DataSourceTransactionManager(dataSource);
//		return p;
//	}
//}
