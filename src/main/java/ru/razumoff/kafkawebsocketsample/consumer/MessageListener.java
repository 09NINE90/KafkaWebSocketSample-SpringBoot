package ru.razumoff.kafkawebsocketsample.consumer;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Component;
import ru.razumoff.kafkawebsocketsample.modal.Message;

import static ru.razumoff.kafkawebsocketsample.Constants.Kafka.GROUP_ID;
import static ru.razumoff.kafkawebsocketsample.Constants.Kafka.KAFKA_TOPIC_CHAT;

@Component
@RequiredArgsConstructor
public class MessageListener {

    private final SimpMessagingTemplate template;

    @KafkaListener(
            topics = KAFKA_TOPIC_CHAT,
            groupId = GROUP_ID
    )
    public void listen(Message message) {
        template.convertAndSend("/topic/group", message);
    }
}
