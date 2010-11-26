package org.powertac.server.module.customer;

import org.powertac.interfaces.Customer;

public class CustomerImpl implements Customer {

    public CustomerImpl() {
        System.out.println("CustomerImpl");
    }

    @Override
    public String id() {
        return "customer.0.0.1";
    }

    @Override
    public String name() {
        return "Default Customer Model";
    }

}
