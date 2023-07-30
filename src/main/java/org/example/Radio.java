package org.example;

public class Radio {
    private int currentRadioStationNumber;
    private int soundVolume;

    //constructor
    public Radio (int currentRadioStationNumber, int soundVolume){
        this.setCurrentRadioStationNumber(currentRadioStationNumber);
        this.setSoundVolume(soundVolume);
    }

    //constructor
    public Radio (){
        this.setCurrentRadioStationNumber(0);
        this.setSoundVolume(0);
    }

    //getter
    public int getCurrentRadioStationNumber(){
        return this.currentRadioStationNumber;
    }

    //setter
    public void setCurrentRadioStationNumber(int currentRadioStationNumber){
        if (currentRadioStationNumber < 0){
            this.currentRadioStationNumber = 9;
            return;
        }
        else if (currentRadioStationNumber > 9){
            this.currentRadioStationNumber = 0;
            return;
        }
        this.currentRadioStationNumber = currentRadioStationNumber;
    }

    //getter
    public int getSoundVolume(){
        return this.soundVolume;
    }

    //setter
    public void setSoundVolume(int soundVolume){
        if (soundVolume < 0){
            this.soundVolume = 0;
            return;
        }
        else if (soundVolume > 100){
            this.soundVolume = 100;
            return;
        }
        this.soundVolume = soundVolume;
    }

    public void prev(){
        int nextRadioStationNumber = this.currentRadioStationNumber - 1;
        this.setCurrentRadioStationNumber(nextRadioStationNumber);
    }

    public void next(){
        int nextRadioStationNumber = this.currentRadioStationNumber + 1;
        this.setCurrentRadioStationNumber(nextRadioStationNumber);
    }

    public void volumeDecrease(){
        int soundVolume = this.soundVolume - 1;
        this.setSoundVolume(soundVolume);
    }

    public void volumeIncrease(){
        int soundVolume = this.soundVolume + 1;
        this.setSoundVolume(soundVolume);
    }

    public String showInfo(){
        return
                "Номер радиостанции: " + this.currentRadioStationNumber +
                        "\nГромкость: " + this.soundVolume;
    }
}
