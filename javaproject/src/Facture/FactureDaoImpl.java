/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facture;

import com.magasin.fournisseur.FournisseurData;
import java.util.Collection;

/**
 *
 * @author yassi
 */
public class FactureDaoImpl implements FactureDao{
    FactureData data_access = new FactureData(); 
    @Override
    public void add(Facture facture) {
       data_access.data.put(facture.getId(),facture);
    }

    @Override
    public void update(Facture facture) {
        data_access.data.put(facture.getId(),facture);
    }

    @Override
    public Facture getOne(int id) {
        return data_access.data.get(id) ;
    }

    @Override
    public Collection<Facture> getAll() {
        return data_access.data.values();
    }

    @Override
    public void delete(int id) {
        data_access.data.remove(id) ;
    }
    
}
