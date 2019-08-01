package com.sda.dealership.storage;

import com.sda.dealership.model.Client;
import java.util.ArrayList;
import java.util.List;

public class ClientDAO extends GenericDAO<Client> {
    private static List<Client> clients = new ArrayList<Client>();

    @Override
    protected List<Client> getItems() {
        return clients;
    }
}
