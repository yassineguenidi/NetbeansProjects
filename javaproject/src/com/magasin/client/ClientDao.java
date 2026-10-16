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
public interface ClientDao {
    public void add(Client client);
    public void update(Client client);
    public Client getOne(int id);
    public Collection<Client> getAll();
    public void delete(int id);
}
