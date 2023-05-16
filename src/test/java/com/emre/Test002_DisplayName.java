package com.emre;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class Test002_DisplayName {

    @Test
    @DisplayName("Tüm kullanıcıları kısıt olmadan getirir")
    void findAll(){
        System.out.println("Tüm kullanıcıları getir. Standart Kullanıcı");
    }

    @Test
    @DisplayName("tipine göre tüm kullanıcıları getirir.")
    void findAll(String name){
        System.out.println("Tüm kullanıcıları getir. Kullanıcı tipine göre");
    }

    @Nested
    class IcClassOrnek{

        void icMethod(){
            System.out.println("Nested clas içindeki metot");
        }
    }


    @Test
    @DisplayName("😍")
    void emojiTest(){
        System.out.println("emoji test");
    }


















}
