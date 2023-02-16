package com.apache.kafka.kafka;

import com.apache.kafka.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);

    @KafkaListener(topics = "myJavaTopicJson",groupId = "myGroup")
    public void consume(User user){
           LOGGER.info(String.format("Json Message received ->%s", user.toString()));
    }

}
