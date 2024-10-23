package main;
import GusDealer.*;

public class main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil(
                "1",
                "Honda",
                "Jazz",
                "Hitam",
                200000000,
                2008);

        System.out.println(mobil.getId());
        System.out.println(mobil.getMerk());
        System.out.println(mobil.getModel());
        System.out.println(mobil.getWarna());

    }



}
