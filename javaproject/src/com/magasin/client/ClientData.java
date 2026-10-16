/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.magasin.client;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author yassi
 */
public class ClientData {
     public Map<Integer,Client> data = new HashMap<Integer,Client>() ;

    public void initData(){
      Client client = new Client(1, "yassine", "guenidi", "22334455");
      data.put(1, client);
      data.put(2, new Client(2,"amin","amin","23456845"));
      data.put(3, new Client(3,"mourad","mourad","97525456"));
      data.put(4, new Client(4,"ahmed","ahmed","22356478"));
      data.put(5, new Client(5,"foued","foued","54125785"));
      data.put(6, new Client(6,"sami","sami","21547562"));
      data.put(7, new Client(7,"marwa","marwa","97854682")); 
    
    }
    public ClientData(){
        initData();             
    }
}
