/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualankopi;

/**
 *
 * @author user
 */
public class ModelBarang {
    private String jenisKopi;
    private String satuan;
    private double harga;

    public ModelBarang(String namaBarang, String satuan, double harga) {
        this.jenisKopi = namaBarang;
        this.satuan = satuan;
        this.harga = harga;
    }

    @Override
    public String toString() {
        return this.jenisKopi;
    }

    /**
     * @return the namaBarang
     */
    public String getNamaBarang() {
        return jenisKopi;
    }

    /**
     * @param namaBarang the namaBarang to set
     */
    public void setNamaBarang(String namaBarang) {
        this.jenisKopi = jenisKopi;
    }

    /**
     * @return the satuan
     */
    public String getSatuan() {
        return satuan;
    }

    /**
     * @param satuan the satuan to set
     */
    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }

    /**
     * @return the harga
     */
    public double getHarga() {
        return harga;
    }

    /**
     * @param harga the harga to set
     */
    public void setHarga(double harga) {
        this.harga = harga;
    }
    
}
