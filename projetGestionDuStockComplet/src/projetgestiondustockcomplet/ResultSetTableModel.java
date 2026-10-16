/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetgestiondustockcomplet;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author yassi
 */
public abstract  class ResultSetTableModel  extends AbstractTableModel{
 private ResultSet rs ;

    public ResultSetTableModel(ResultSet rs) {
        this.rs = rs;
        fireTableDataChanged();
    }
    public int getColumnCount(){
        try{
            if(rs==null){
                return 0 ;
            }else{
                return rs.getMetaData().getColumnCount();
            }
        }catch(SQLException ex){
            System.out.println("getColomnCount resultset generating error while getting colomn count");
            System.out.println(ex.getMessage());
        }
        return 0 ;
    }
    public int getRowCOunt (){
          try{
            if(rs==null){
                return 0 ;
            }else{
                rs.last();
                return rs.getRow();
            }
        }catch(SQLException ex){
            System.out.println("getRowcount resultset generating error while getting rows");
            System.out.println(ex.getMessage());
        }
        return 0 ;
    }
    
    public Object getVAlueAt(int rowIndex ,int columnIndex){
        if( rowIndex<0 || rowIndex>getRowCOunt()|| columnIndex<0 ||columnIndex>getColumnCount())   {
            return null ;
        }
        try{
            if(rs==null){
                return null ;
            }else{
                rs.absolute(rowIndex+ 1);
                return rs.getObject(columnIndex +1) ;
            }
        }catch(SQLException ex){
             System.out.println("getvalueat resultset generating error while fetching rows");
            System.out.println(ex.getMessage());
            return null ;
        }
    }
 
    @Override 
    public String getColumnName(int columnIndex){
        try{
            return rs.getMetaData().getColumnName(columnIndex+1) ;
        }catch(SQLException ex){
             System.out.println("getColomnname  resultset generating error while fetching column name");
             System.out.println(ex.getMessage());
            
        }
        return super.getColumnName(columnIndex);
    }
}
