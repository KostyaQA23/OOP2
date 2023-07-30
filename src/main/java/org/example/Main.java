package org.example;

public class Main {
    public static void main(String[] args) {
        Radio radio = new Radio();
        System.out.println(radio.showInfo());

        System.out.println("\nУстановить номер радиостанции");
        radio.setCurrentRadioStationNumber(7);
        radio.setSoundVolume(98);
        System.out.println(radio.showInfo());

        System.out.println("\nСледующая радиостанция ->");
        radio.next();
        System.out.println(radio.showInfo());

        System.out.println("\nСледующая радиостанция ->");
        radio.next();
        System.out.println(radio.showInfo());

        System.out.println("\nСледующая радиостанция ->");
        radio.next();
        System.out.println(radio.showInfo());

        System.out.println("\nПредыдущая радиостанция <-");
        radio.prev();
        System.out.println(radio.showInfo());

        System.out.println("\nПредыдущая радиостанция <-");
        radio.prev();
        System.out.println(radio.showInfo());

        System.out.println("\nГромкость +3");
        for (int i = 0; i < 3; i++){
            radio.volumeIncrease();
            System.out.println(radio.showInfo());
        }

        System.out.println("\nГромкость 2");
        radio.setSoundVolume(2);
        System.out.println(radio.showInfo());

        System.out.println("\nГромкость -3");
        for (int i = 0; i < 3; i++){
            radio.volumeDecrease();
            System.out.println(radio.showInfo());
        }

        System.out.println("\nСледующая радиостанция -> и Громкость +1");
        radio.next();
        radio.volumeIncrease();
        System.out.println(radio.showInfo());
    }
}
