/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.magasin.client;

import java.util.Collection;

/**
 *
 * @author yassi
 */
public class ClientDaoImpl implements ClientDao{
     ClientData data_access = new ClientData(); 
    @Override
    public void add(Client client) {
     data_access.data.put(client.getId(), client);
    }

    @Override
    public void update(Client client) {
     data_access.data.put(client.getId(), client);
    }

    @Override
    public Client getOne(int id) {
     return data_access.data.get(id) ;   
    }

    @Override
    public Collection<Client> getAll() {
           return data_access.data.values();
    }

    @Override
    public void delete(int id) {
          data_access.data.remove(id) ;
    }
    
}
