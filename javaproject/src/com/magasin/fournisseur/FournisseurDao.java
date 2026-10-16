/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.magasin.fournisseur;

import java.util.Collection;

/**
 *
 * @author yassi
 */
public interface FournisseurDao {
    public void add(Fournisseur fournisseur);
    public void update(Fournisseur fournisseur);
    public Fournisseur getOne(int id);
    public Collection<Fournisseur> getAll();
    public void delete(int id);
}
