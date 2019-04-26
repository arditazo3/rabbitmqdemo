package com.rabbitmq.rabbitmqdemo;

import com.rabbitmq.rabbitmqdemo.message.SimpleMessageMQ;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RabbitmqdemoApplication implements CommandLineRunner {

    private RabbitTemplate rabbitTemplate;

    @Autowired
    public void setRabbitTemplate(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public static void main(String[] args) {
        SpringApplication.run(RabbitmqdemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        SimpleMessageMQ simpleMessageMQ = new SimpleMessageMQ();
        simpleMessageMQ.setName("FirstMessage");
        simpleMessageMQ.setDescription("simpleDescription");
        rabbitTemplate.convertAndSend("MyTopicExchange", "topic", simpleMessageMQ.toString());
    }
}
