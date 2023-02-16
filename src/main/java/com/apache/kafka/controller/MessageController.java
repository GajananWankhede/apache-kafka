package com.apache.kafka.controller;

import com.apache.kafka.kafka.KAfkaProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/kafka")
public class MessageController {

    private KAfkaProducer kAfkaProducer;


    @GetMapping("/publish")
    public ResponseEntity<String> publish(@RequestParam("message") String message){

   kAfkaProducer.sendMessage(message);
   return ResponseEntity.ok("Message sent to the topic");
    }

}
