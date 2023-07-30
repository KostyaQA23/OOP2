import org.example.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void increaseVolume() {   //прибавить громкость
        radio.setSoundVolume(5);
        radio.volumeIncrease();

        int expected = 6;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeMoreMax() {   //прибавить громкость больше Max
        radio.setSoundVolume(100);
        radio.volumeIncrease();

        int expected = 100;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume() {      //убавить громкость
        radio.setSoundVolume(5);
        radio.volumeDecrease();

        int expected = 4;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeLessMin() {      //убавить громкость меньше мин
        radio.setSoundVolume(0);
        radio.volumeDecrease();

        int expected = 0;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStation() {      //выбор станции
        radio.setCurrentRadioStationNumber(9);

        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationMoreMax() {   //выбор станции больше Max
        radio.setCurrentRadioStationNumber(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationLessMin() {   //выбор станции меньше Min
        radio.setCurrentRadioStationNumber(-1);

        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation() {     //следующая станция
        radio.setCurrentRadioStationNumber(5);
        radio.next();

        int expected = 6;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextStationAfterMax() {     //следущая станция после Max
        radio.setCurrentRadioStationNumber(9);
        radio.next();

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevStation() {     //предыдущая станция
        radio.setCurrentRadioStationNumber(5);
        radio.prev();

        int expected = 4;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevStationAfterMin() {     //предыдущая станция после Min
        radio.setCurrentRadioStationNumber(0);
        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }
}
