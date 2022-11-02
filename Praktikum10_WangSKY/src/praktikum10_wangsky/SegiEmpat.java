/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum10_wangsky;

/**
 *
 * @author Praktikan
 */
public class SegiEmpat extends BangunDatar{
    private double sisi;

    public SegiEmpat(String warna, double sisi) {
        super(warna);
        this.sisi = sisi;
    }
    public SegiEmpat(){}

    @Override
    public double keliling() {
        return 4 * sisi;
    }

    @Override
    public double luas() {
        return sisi * sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
    
    
}
