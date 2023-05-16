package com.emre;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;
public class Test003_AssertUsing {

    private final static Islemler islemler=new Islemler();
    @Test
    void standartassertionsMethodsUsing(){
        assertEquals(15,islemler.tople(6,9));
        assertEquals(9,islemler.tople(6,3),
                "İki sayının toplanması ile ilgili sonuçları karşılaştırır." +
                        "\n burada bir hata olursa bu mesaj götüntülenir.");
        assertTrue(islemler.tople(5,6)== 11);
    }
    @Test
    void groupedAssertions(){
        assertAll("İşlemler",
                () -> assertEquals(15, islemler.tople(6,9)),
                () -> assertEquals(15, islemler.tople(6,9)),
                () -> assertTrue(islemler.tople(5,6)== 11)
                );
    }
    @Test
    void timeoutTest(){
        assertTimeout(Duration.ofSeconds(1),() -> {
            System.out.println("işlem başladı");
            Thread.sleep(980);
            System.out.println("işlem bitti");
        });
    }

}
