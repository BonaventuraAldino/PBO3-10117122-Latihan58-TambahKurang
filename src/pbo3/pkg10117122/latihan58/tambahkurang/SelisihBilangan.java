/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117122.latihan58.tambahkurang;

/**
 *
 * @author Aldy Senda
 */
public class SelisihBilangan extends Bilangan{
    public void tampilSelisih(){
        int selisih = getX() - getY();
        System.out.println("Hasil Selisih "+getX()+" - "+getY()+" = " +selisih);
    }
}
