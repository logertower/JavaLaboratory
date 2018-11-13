package com.liutf.demo.mq.rocketMq;

import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendCallback;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.common.message.MessageQueue;

import java.util.ArrayList;
import java.util.List;

/**
 * rocketmq消息发送方式示例
 *
 * @author ltf
 * @create 2018-11-07 下午 10:05
 */
public class RocketMqSendModeDemo {

    DefaultMQProducer producer = null;
    Message message = null;
    MessageQueue messageQueue = null;

    public void initProducer() {
        /**
         * 初始化生产者
         */
        producer = new DefaultMQProducer();
        producer.setProducerGroup("productGroup");
        producer.setNamesrvAddr("ip:host;ip2:host2");
        producer.setInstanceName(System.currentTimeMillis() + "");

        /**
         * 初始化消息
         */
        Message message = new Message();
        message.setBody("我是一条消息".getBytes());
        message.setTopic("topic1");
        message.setDelayTimeLevel(0);

        /**
         * 初始化消息队列
         */
        messageQueue = new MessageQueue();
        messageQueue.setBrokerName("");
        messageQueue.setTopic("topic1");
        messageQueue.setQueueId(11);
    }

    /**
     * 同步发送
     * 需要返回结果
     */
    public void sendNeedResult() throws InterruptedException, MQClientException, MQBrokerException {
        /**
         * 发送消息
         */
        //简单发送
        SendResult sendResult = producer.send(message);
    }

    /**
     * 异步发送
     * 回调方法中返回结果
     */
    public void sendNeedResultByCallBack() throws MQClientException, InterruptedException {
        /**
         * 发送消息
         */
        producer.send(message, new SendCallback() {
            @Override
            public void onSuccess(SendResult sendResult) {
                //成功的处理
            }

            @Override
            public void onException(Throwable e) {
                //失败的处理
            }
        });
    }

    /**
     * 单向发送
     * 无需返回结果
     */
    public void sendNotNeedResul() throws MQClientException, InterruptedException {
        /**
         * 发送消息
         */
        producer.sendOneway(message);
    }

}
