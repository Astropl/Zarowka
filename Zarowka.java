package Samodzielne;

import java.util.Scanner;

public class Zarowka {

String wybor = "";
Scanner sc = new Scanner(System.in);


    public Zarowka() {
        System.out.println("WPISZ aby:\n wlacz  aby wlaczyc \n wylacz aby wylaczyc");
        wybor = sc.next();
if (wybor.equals("wlacz"))
{

    ZarowkaWlacz zarowkaWlacz = new ZarowkaWlacz();
    System.out.println(zarowkaWlacz.getZarWlacz());
}
else if (wybor.equals("wylacz")){
    ZarowkaWylacz zarowkaWylacz = new ZarowkaWylacz();
    System.out.println(zarowkaWylacz.getZarWylacz());
        }
    }

    public String getWybor() {
        this.wybor = wybor;
        return wybor;
    }

    public void setWybor() {
        this.wybor = wybor;
        return;
    }


}
