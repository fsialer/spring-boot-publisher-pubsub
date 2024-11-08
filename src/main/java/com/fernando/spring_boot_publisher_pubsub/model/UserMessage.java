package com.fernando.spring_boot_publisher_pubsub.model;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserMessage {
    private String body;
    private String username;
    private LocalDateTime createdAt;
}
