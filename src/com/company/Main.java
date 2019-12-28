package com.company;

public class Main {

    public static void main(String[] args) {
        String name = "adilet";
        System.out.println(name);
        int vozrast = 21;
        System.out.println(vozrast +  " лет");
        int temperature = 23;
        if ((temperature > +30 && temperature < -20)|| (vozrast>20 &&vozrast<45)) {
            System.out.println("можно идти гулять");

        } else {
            System.out.println("НЕ идет гулят");
            System.out.println("__________________");
        }
        int  voz = 15;
        System.out.println(voz);

        if ((temperature < 0 && temperature > 28)|| (voz>20 &&  voz< 10)) {
        }else {
            System.out.println("можно гулять");
            System.out.println("____________________");
        }

        int vo = 46;
        System.out.println(vo);
       if ((temperature < - 10 && temperature > 25) || (vo > 47&& vo < 40)){

       }else {
           System.out.println("можно идти гулять");
       }
        System.out.println("рандом");
        int a = 0;
        int b = 107;
        int random_nuber1 = a + (int) (Math.random()*b);
        System.out.println("1-ое случайное число: "+ random_nuber1);







    }
}
