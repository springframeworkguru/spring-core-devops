package guru.springframework.bootstrap.profilesysout;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by jt on 5/21/16.
 */
@Component
@Profile("qa")
public class QAProfileSysOut {

    public QAProfileSysOut() {
        System.out.println("##################################");
        System.out.println("##################################");
        System.out.println("##               QA             ##");
        System.out.println("##################################");
        System.out.println("##################################");
    }
}
