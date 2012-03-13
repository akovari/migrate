package se.rl.migrate.ejb;


import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;

import rl.domain.Id;
import se.rl.migrate.domain.customer.CustomerImpl;

@Stateless 
public class CustomerBean implements CustomerLocal, CustomerRemote {
    
    @PostConstruct
    public void logVersion() {
        System.out.println("Customer bean constructed");
    }

    public CustomerImpl getCustomer() {
		return new CustomerImpl(new Id(10));
    }
}