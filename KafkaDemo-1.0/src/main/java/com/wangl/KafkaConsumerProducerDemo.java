package com.wangl;

/**
 * Created by seentech on 2017/2/17.
 */
public class KafkaConsumerProducerDemo
{
    public static void main(String[] args)
    {
        KafkaProducer producerThread = new KafkaProducer(KafkaProperties.topic);
        producerThread.start();
        KafkaConsumer consumerThread = new KafkaConsumer(KafkaProperties.topic);
        consumerThread.start();
    }
}
