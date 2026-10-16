/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facture;

import java.util.Collection;

/**
 *
 * @author yassi
 */
public interface FactureDao {
    public void add(Facture facture);
    public void update(Facture facture);
    public Facture getOne(int id);
    public Collection<Facture> getAll();
    public void delete(int id);
}
