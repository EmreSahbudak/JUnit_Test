package com.emre;

public class Islemler {

    public int tople(int sayi1, int sayi2){
        return sayi1+sayi2;
    }

    public double bolme(double sayi1, double sayi2){
        if (sayi2==0){
            return 0;
        }
        return sayi1/sayi2;
    }
}
