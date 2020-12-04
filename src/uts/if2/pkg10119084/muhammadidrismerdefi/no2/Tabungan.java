/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if2.pkg10119084.muhammadidrismerdefi.no2;
/**
Nama : Muhammad Idris Merdefi
Kelas : PBOIF2
NIM : 10119084
Deskripsi Program : Program ini berisi program untuk menampilkan tabungan
 */
public class Tabungan {
  private int saldo;
  
   public Tabungan(int saldo){
       this.saldo = saldo;
   }
   
   public int ambilUang(int jumlah){
       return saldo - jumlah;
   }
    
    
}
