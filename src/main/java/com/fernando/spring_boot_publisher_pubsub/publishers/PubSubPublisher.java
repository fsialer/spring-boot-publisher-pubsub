package com.fernando.spring_boot_publisher_pubsub.publishers;

public abstract class PubSubPublisher<T> {
    protected abstract String topic();

    public abstract void publish(T message);
}
