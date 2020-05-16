package day40_Encapsulation;

public class Encapsulation {

    private long SSN;

    // eger ulasmak istiyorsam diger classda private e getter kullancam

    // getter: read only

    public long getSSN()
    {                 // biz bunu dogrudan ulasilamayn privite ulasmak icin yapiyoruz
        return SSN;
    }


    // setter: write only

    public void setSSN(long SSN){         // ins variable      // set and get isimdeki not mandatory sadece boyl;e kulanimi kolay isteedigini yazabilirsin
        // SSN=SSN;   local var okuyor
        this.SSN=SSN;   // ins variableden aliyor

        System.out.println(SSN);

        // you cannot use these methods with private method. hata vermiyor ama boyle yaparsan sadece ayni class da ulasabilirsin.
    }



}
