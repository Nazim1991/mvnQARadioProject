package ru.netologu.project;
public class Radio {
    // Поля
    private int currentRadioStationNumber;
    private int soundVolume;
    private int numberOfRadioStations;


    public Radio (int StationCount) {
       this.numberOfRadioStations = StationCount - 1;
    }

    public Radio () {
        this.numberOfRadioStations = 9;
    }

    // Сеттеры
    public void setCurrentRadioStationNumber(int currentRadioStationNumber) {
        if (currentRadioStationNumber >= 0 && currentRadioStationNumber <= numberOfRadioStations) {
            this.currentRadioStationNumber = currentRadioStationNumber;
        }
    }

    public void setSoundVolume(int soundVolume) {
        if (soundVolume >= 0 && soundVolume <= 100) {
            this.soundVolume = soundVolume;
        }
    }
    // методы Радио
    public int nextRadioStation(){
        if (currentRadioStationNumber != numberOfRadioStations){
            this.currentRadioStationNumber = currentRadioStationNumber + 1;
        }
        return this.currentRadioStationNumber;
    }
    public void prevRadioStation() {
        if (currentRadioStationNumber != 0) {
            this.currentRadioStationNumber = currentRadioStationNumber - 1;
        } else {
            this.currentRadioStationNumber = numberOfRadioStations;
        }
    }

    public void changeStationUserSelf(int newRadioStation){
        setCurrentRadioStationNumber(newRadioStation);
    }


    // методы Звук
    public void increaseVolume(){
        if (soundVolume != 100){
            this.soundVolume = soundVolume + 1;
        }else {
            this.soundVolume = 100;
        }
    }
    public void turnDownVolume(){
        if (soundVolume != 0){
            this.soundVolume = soundVolume - 1;
        } else {
            this.soundVolume = 0;
        }
    }

    // геттеры
    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

}



