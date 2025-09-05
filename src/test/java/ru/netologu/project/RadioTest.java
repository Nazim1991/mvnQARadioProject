package ru.netologu.project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void setCurrentRadioStationNumberTestMinusOne() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(-1);
        assertEquals(0, radio.getCurrentRadioStationNumber());
    }
    @Test
    void setCurrentRadioStationNumberTestNull() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(0);
        assertEquals(0, radio.getCurrentRadioStationNumber());
    }
    @Test
    void setCurrentRadioStationNumberTestValid() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(7);
        assertEquals(7, radio.getCurrentRadioStationNumber());
    }
    @Test
    void setCurrentRadioStationNumberTestMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(9);
        assertEquals(9, radio.getCurrentRadioStationNumber());
    }
    @Test
    void setCurrentRadioStationNumberTestMoorMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(10);
        assertEquals(0, radio.getCurrentRadioStationNumber());
    }


    @Test
    void setSoundVolumeTestMinus() {
        Radio radio = new Radio();
        radio.setSoundVolume(-11);
        assertEquals(0, radio.getSoundVolume());
    }
    @Test
    void setSoundVolumeTestNull() {
        Radio radio = new Radio();
        radio.setSoundVolume(0);
        assertEquals(0, radio.getSoundVolume());
    }
    @Test
    void setSoundVolumeTestPlusMax() {
        Radio radio = new Radio();
        radio.setSoundVolume(111);
        assertEquals(0, radio.getSoundVolume());
    }
    @Test
    void setSoundVolumeTestMax() {
        Radio radio = new Radio();
        radio.setSoundVolume(100);
        assertEquals(100, radio.getSoundVolume());
    }

    @Test
    void setCurrentRadioStationNumberTestNext() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(9);

        radio.nextRadioStation();

        assertEquals(9, radio.getCurrentRadioStationNumber());
    }
    @Test
    void setCurrentRadioStationNumberTestNextValid() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(8);

        radio.nextRadioStation();

        assertEquals(9, radio.getCurrentRadioStationNumber());
    }

    @Test
    void prevRadioStationTestNull() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(0);

        radio.prevRadioStation();

        assertEquals(9, radio.getCurrentRadioStationNumber());
    }
    @Test
    void prevRadioStationTestPlus() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(1);

        radio.prevRadioStation();

        assertEquals(0, radio.getCurrentRadioStationNumber());
    }


    @Test
    void increaseVolumeTestHundrid() {
        Radio radio = new Radio();
        radio.setSoundVolume(100);

        radio.increaseVolume();

        assertEquals(0, radio.getSoundVolume());

    }
    @Test
    void increaseVolumeTestNull() {
        Radio radio = new Radio();
        radio.setSoundVolume(0);

        radio.increaseVolume();

        assertEquals(1, radio.getSoundVolume());

    }

    @Test
    void turnDownVolumeTestNull() {
        Radio radio = new Radio();
        radio.setSoundVolume(0);

        radio.turnDownVolume();

        assertEquals(100, radio.getSoundVolume());
    }
    @Test
    void turnDownVolumeTestNotNull() {
        Radio radio = new Radio();
        radio.setSoundVolume(97);

        radio.turnDownVolume();

        assertEquals(96, radio.getSoundVolume());
    }

    @Test
    void changeStationUserSelfTestValidNull(){
        Radio radio = new Radio();
        radio.changeStationUserSelf(0);

        assertEquals(0, radio.getCurrentRadioStationNumber());
    }
    @Test
    void changeStationUserSelfTestValidNotNull(){
        Radio radio = new Radio();
        radio.changeStationUserSelf(6);

        assertEquals(6, radio.getCurrentRadioStationNumber());
    }

}