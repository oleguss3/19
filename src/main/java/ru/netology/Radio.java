package ru.netology;

public class Radio {
    private int currentStation = 0; // 0..9
    private int currentVolume = 0;  // 0..100

    // ===== Станции =====
    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0 || newCurrentStation > 9) {
            return; // игнорим некорректные значения
        }
        currentStation = newCurrentStation;
    }

    public void nextStation() {
        if (currentStation == 9) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prevStation() {
        if (currentStation == 0) {
            currentStation = 9;
        } else {
            currentStation--;
        }
    }

    // ===== Громкость =====
    public int getCurrentVolume() {
        return currentVolume;
    }

    // (не обязательно по заданию, но удобно)
    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0 || newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void reduceVolume() { // уменьшение на 1
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}
