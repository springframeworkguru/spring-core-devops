package guru.springframework.bootstrap.profilesysout;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by jt on 5/21/16.
 */
@Component
@Profile("prod")
public class ProdProfileSysOut {
    public ProdProfileSysOut() {
        System.out.println("##################################");
        System.out.println("##################################");
        System.out.println("##              PROD            ##");
        System.out.println("##################################");
        System.out.println("##################################");
    }
}
