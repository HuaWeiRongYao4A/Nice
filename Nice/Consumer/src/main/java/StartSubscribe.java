import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.JmsException;

import javax.jms.JMSException;
import javax.jms.TextMessage;

/**
 * Created by Administrator on 2017/6/20.
 */
public class StartSubscribe {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("config/applicationContext-activemq.xml");
        while(true) {
        }
    }

    public void receive(TextMessage message) throws JmsException, JMSException {
        System.out.println(message.getStringProperty("phrCode"));
        System.out.println(message.getText());
    }
}
