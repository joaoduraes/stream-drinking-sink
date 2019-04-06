package com.joaoduraes.stream.drinking.sink.service;

import com.joaoduraes.stream.drinking.sink.domain.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.integration.annotation.MessageEndpoint;

@EnableBinding(Sink.class)
@MessageEndpoint
@Slf4j
public class Catcher {

    @StreamListener(Sink.INPUT)
    void logMessage(Person person) {
        log.info(person.toString());
    }
}
