package com.abelkelly.Listeners;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "abelkelly", groupId = "kelly1")
    void listener(String data){
        System.out.println("Listener received data " + data + " :(");
    }

}
