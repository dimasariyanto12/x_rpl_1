/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualankopi;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author windows
 */
public class ModelPenjualan {
    private double subTotal=0;
    private double ppn=0;
    private double badmin=0;
    private double total=0;
    private DefaultTableModel tabel = new DefaultTableModel();
    
    public ModelPenjualan(){
        getTabel().addColumn("Jenis Kopi");
        getTabel().addColumn("Harga");
        getTabel().addColumn("Qty");
        getTabel().addColumn("Satuan");
        getTabel().addColumn("Jumlah");
    }

    public double countSubtotal(){
        subTotal=0;
        for (int i=0;i<tabel.getRowCount();i++){
            subTotal=subTotal+Double.parseDouble(tabel.getValueAt(i, 4).toString());
        }
        return subTotal;
    }
    
    public double countPPN(){
        ppn=subTotal*0.1;
        return ppn;
    }
    
    public double countBADMIN(){
        badmin=subTotal*0.05;
        return badmin; 
    }
    
    public double countTotal(){
        total=subTotal+ppn+badmin;
        return total;
    }
    /**
     * @return the subTotal
     */
    public double getSubTotal() {
        return subTotal;
    }

    /**
     * @param subTotal the subTotal to set
     */
    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    /**
     * @return the ppn
     */
    public double getPpn() {
        return ppn;
    }

    /**
     * @param ppn the ppn to set
     */
    public void setPpn(double ppn) {
        this.ppn = ppn;
    }
    
    /**
     * @param badmin the badmin to set
     */
    public void setBadmin(double badmin) {
        this.badmin = badmin;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
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

    void setText(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
