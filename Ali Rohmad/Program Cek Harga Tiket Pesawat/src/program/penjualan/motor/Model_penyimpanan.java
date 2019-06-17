/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package program.penjualan.motor;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ardy Sendleep
 */
public class Model_penyimpanan {
    
    private DefaultTableModel tabel = new DefaultTableModel();
    public Model_penyimpanan(){
        
        getTabel().addColumn("No");
        getTabel().addColumn("Tujuan Penerbangan");
        getTabel().addColumn("Harga");
        getTabel().addColumn("Waktu");
        getTabel().addColumn("Maskapai");
       
    }
    
  


    /**
     * @return the tabel
     */
    public DefaultTableModel getTabel() {
        return tabel;
    }

    /**
     * @param tabel the tabel to set
     */
    public void setTabel(DefaultTableModel tabel) {
        this.tabel = tabel;
    }
 
    
     
}
