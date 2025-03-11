package ru.razumoff.kafkawebsocketsample;

import lombok.experimental.UtilityClass;

@UtilityClass
public class Constants {

    public static class Kafka{
        public static final String KAFKA_TOPIC = "KafkaChat";
        public static final String KAFKA_BROKER = "localhost:9092";
        public static final String GROUP_ID = "my-consumer-group";
    }
}
