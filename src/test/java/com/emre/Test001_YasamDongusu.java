package com.emre;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class Test001_YasamDongusu {

    @BeforeAll
    void initAll(){
        System.out.println("BeforeAll--> Bu kısımda Tüm herşeyden önce çalışacak kısımdır" +
                "Aslında Constructor gibi düşünülebilir." +
                "VE yalnızca 1 kere calışır.");
    }

    @BeforeEach
    void init(){
        System.out.println("BeforeEach--> Bu kisim her test isleminden once calısacak");
    }

    @Test
    void testDemo(){
        System.out.println("TestDemo");
    }

    @Test
    void testIslem(){
        int sayi1,sayi2;
        sayi1= 6463;
        sayi2=5;
        int toplam=sayi1+sayi2;
        System.out.println("Toplam:"+toplam);
    }
    @Test
    void basarisizTestOrnegi(){
        Assertions.fail("Burada işlem başarısız olucak");
        System.out.println("Başarısız işlemden sonra calışacak kod");
    }

    @Test
    @Disabled("Kapatmak istediğiniz testleri pasife alıyoruz")
    void testBelliBirDurumicinKapatma(){
        System.out.println("Bazen Testler tek tek işlemek istemeyebiliriz." +
                "\n tüm sistemi test etmek isteriz. Ancak Bazı test işlemlerinin" +
                "\n bu toplu çalıştırma sırasında calışmasını istemeyebiliriz" +
                "\n Bunun için Test işleminin kapatılması gerekir. Bunun için @Disable");
    }


    @AfterEach
    void after(){
        System.out.println("AfterEach--> Her bir Test işleminin çalışmasından sonra çlışacak olan metot");
    }
    @AfterAll
    void afterAll(){
        System.out.println("AfterAll--> Tüm test işlemlerinden sonra 1 kere çalışacak metottur.");
    }


























}
