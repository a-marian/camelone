package ar.com.bancogalicia.camelone;

public interface AccountService {


    String create(Account account);

    void update(Account account);

    void close(int accountId);

    Account findAccount(int accountId);
}
