package com.example.demo.Annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.example.demo.Annotations")
@PropertySource("classpath:sport.properties")
public class SportConfig {

    @Bean
    public FortuneService sadFortuneService(){
        return new SadFortuneService();
    }

    @Bean
    public Coach swimCoach(){
        return new SwimCoach(sadFortuneService());
    }

    @Bean
    public FortuneService optimisticFortune(){
        return new OptimisticFortune();
    }

    @Bean
    public Coach handballCoach(){
        return new HandBallCoach(optimisticFortune());
    }


}
