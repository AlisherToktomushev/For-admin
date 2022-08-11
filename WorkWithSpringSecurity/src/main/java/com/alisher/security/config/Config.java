package com.alisher.security.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.util.Properties;

@Configuration
@ComponentScan(basePackages = "com.alisher.security")
@EnableWebMvc
@EnableTransactionManagement
public class Config {
    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver internalResourceViewResolver=
                new InternalResourceViewResolver();
        internalResourceViewResolver.setPrefix("/WEB-INF/view/");
        internalResourceViewResolver.setSuffix(".jsp");
        return internalResourceViewResolver;
    }


    @Bean
    public DataSource dataSource1() {

        ComboPooledDataSource dataSource1 = new ComboPooledDataSource();
        try {
            dataSource1.setDriverClass("com.mysql.cj.jdbc.Driver");
            dataSource1.setJdbcUrl("jdbc:mysql://127.0.0.1:3306/klient?useSSL=false");
            dataSource1.setUser("bestuser");
            dataSource1.setPassword("bestuser");
        } catch (PropertyVetoException e) {
            e.printStackTrace();

        }
        return dataSource1;


    }
   @Bean
   public LocalSessionFactoryBean sessionFactoryBean() {
       LocalSessionFactoryBean sessionFactoryBean1=new LocalSessionFactoryBean();
      sessionFactoryBean1.setDataSource(dataSource1());
      sessionFactoryBean1.setPackagesToScan("com.alisher.security.model");
      Properties properties =new Properties();
      properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
      properties.setProperty("hibernate.show_sql","true");
      sessionFactoryBean1.setHibernateProperties(properties);
      return sessionFactoryBean1;
   }
   @Bean
   public HibernateTransactionManager transactionManager(){
       HibernateTransactionManager transactionManager =new HibernateTransactionManager();
       transactionManager.setSessionFactory(sessionFactoryBean().getObject());
      return transactionManager;
   }
}


