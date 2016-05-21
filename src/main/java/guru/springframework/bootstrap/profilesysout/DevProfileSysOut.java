package guru.springframework.bootstrap.profilesysout;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by jt on 5/21/16.
 */
@Component
@Profile("dev")
public class DevProfileSysOut {

    public DevProfileSysOut() {
        System.out.println("##################################");
        System.out.println("##################################");
        System.out.println("##              DEV             ##");
        System.out.println("##################################");
        System.out.println("##################################");
    }
}
