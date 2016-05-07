package guru.springframework.services.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * Created by jt on 5/6/16.
 */
@Component
public class JmsTextMessageListener {

    @JmsListener(destination = "text.messagequeue")
    public void onMessage(String msg){
        System.out.println("#### " + msg + " ###" );
    }
}
