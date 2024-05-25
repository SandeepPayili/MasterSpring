package org.sandeeppayili;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"org.sandeeppayili","org.masteraop"})
public class SpringConfig {

//    @Bean
//    public Doctor doctor(){
//        return new Doctor();
//    }
}
