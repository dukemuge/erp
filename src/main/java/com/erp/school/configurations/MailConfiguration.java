package com.erp.school.configurations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Properties;

@Configuration
public class MailConfiguration {
    @Value("${spring.mail.host}")
    private String mailHost;
    @Value("${spring.mail.host}")
    private String mailPort;
    @Value("${spring.mail.username}")
    private String userName;
    @Value("${spring.mail.password}")
    private  String  password;

    @Bean
    public JavaMailSender getJavaMailSender(){
        JavaMailSenderImpl javaMailSender = new JavaMailSenderImpl();
        javaMailSender.setHost(mailHost);
        javaMailSender.setPort(Integer.parseInt(mailPort));
        javaMailSender.setUsername(userName);
        javaMailSender.setPassword(password);

        Properties prop = javaMailSender.getJavaMailProperties();
        prop.put("mail.smtp.starttls.enable","true");

        return  javaMailSender;
    }

}
