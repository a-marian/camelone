package ar.com.bancogalicia.camelone;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class AccountRoute extends RouteBuilder {


    @Override
    public void configure() throws Exception {

        rest("accounts")
                .get("{id}").outType(Account.class)
                    .to("bean:accountService?method=findAccount(${header.id})")
                .post().type(Account.class)
                    .to("bean:accountService?method=create")
                .put().type(Account.class)
                    .to("bean:accountService?method=update")
                .delete("{id}")
                    .to("bean:accountService?method=cancel(${header.id})");

    }
}
