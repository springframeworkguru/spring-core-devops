package guru.springframework.test.ds;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by jt on 5/21/16.
 */
@Component
@Profile("prod")
public class ProdDataSource implements FakeDataSource {
    @Override
    public String getConnectionInfo() {
        return "I'm the Production Datasource";
    }
}
