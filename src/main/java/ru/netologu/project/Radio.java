package ru.netologu.project;
public class Radio {
    // Поля
    private int currentRadioStationNumber;
    private int soundVolume;


    // Сеттеры
    public void setCurrentRadioStationNumber(int currentRadioStationNumber) {
        if (currentRadioStationNumber >= 0 && currentRadioStationNumber <= 9) {
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
        if (currentRadioStationNumber != 9){
            this.currentRadioStationNumber = currentRadioStationNumber + 1;
        }
        return this.currentRadioStationNumber;
    }
    public void prevRadioStation() {
        if (currentRadioStationNumber != 0) {
            this.currentRadioStationNumber = currentRadioStationNumber - 1;
        } else {this.currentRadioStationNumber = 9;}
    }

    public void changeStationUserSelf(int newRadioStation){
        setCurrentRadioStationNumber(newRadioStation);
    }


    // методы Звук
    public void increaseVolume(){
        if (soundVolume != 100){
            this.soundVolume = soundVolume + 1;
        }else {
            this.soundVolume = 0;
        }
    }
    public void turnDownVolume(){
        if (soundVolume != 0){
            this.soundVolume = soundVolume - 1;
        } else {
            this.soundVolume = 100;
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



