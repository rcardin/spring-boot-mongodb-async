package com.example;

import com.mongodb.async.client.MongoClient;
import com.mongodb.async.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by rcardin on 23/11/2016.
 */
@Configuration
public class DemoConfiguration {
    @Bean
    public MongoClient mongo() {
        return MongoClients.create();
    }
}
