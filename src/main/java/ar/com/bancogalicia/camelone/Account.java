package ar.com.bancogalicia.camelone;

import java.math.BigDecimal;
import java.util.Date;

public class Account {

    private int id;
    private String name;
    private BigDecimal amount;
    private Date dateCreated;


//    public Account(int id, String name, BigDecimal amount){
//        this.id =
//    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
}
