package com.fernando.spring_boot_publisher_pubsub.publishers;

import com.fernando.spring_boot_publisher_pubsub.model.UserMessage;
import com.google.cloud.spring.pubsub.core.publisher.PubSubPublisherTemplate;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class HelloPubSubPublisher extends PubSubPublisher<UserMessage>{
    private final PubSubPublisherTemplate pubSubPublisherTemplate;

    @Override
    protected String topic() {
        return "myRunTopic";
    }

    @Override
    public void publish(UserMessage message) {
        log.info("Publishing to topic {}, message: {}", topic(), message);
        pubSubPublisherTemplate.publish(topic(), message);
    }
}
