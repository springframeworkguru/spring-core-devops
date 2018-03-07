package guru.springframework.bootstrap.profilesysout;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by jt on 5/21/16.
 */
@Component
public class NonProfileBean {

    @Autowired
    public NonProfileBean(@Value("${guru.springframework.profile.message}") String msg) {
        System.out.println("**********"  + msg + "************");

    }
}
