package com.serviceimpl;

import com.service.ActivemqService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

/**
 * Created by Administrator on 2017/6/20.
 */
@Service
public class ActivemqServiceImpl implements ActivemqService {

//    @Resource(name = "jmsTopicTemplate")
//    private JmsTemplate jmsTemplate;

    @Override
    public void publish() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("config/applicationContext-activemq.xml");
        JmsTemplate jmsTemplate = (JmsTemplate) ctx.getBean("jmsTopicTemplate");
        for (int i = 0; i < 10; i++) {
            jmsTemplate.send(new MessageCreator() {
                public Message createMessage(Session session) throws JMSException {
                    TextMessage msg = session.createTextMessage();
                    // 设置消息属性
                    msg.setStringProperty("phrCode", "C001");
                    // 设置消息内容
                    msg.setText("Hello World!");
                    return msg;
                }
            });
        }
    }

}
