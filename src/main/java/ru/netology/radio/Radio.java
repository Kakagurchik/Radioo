package ru.netology.radio;

class Radio {
    int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void prevStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else currentStation = 9;
    }

    public void nextStation() {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        } else currentStation = 0;


    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {

        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void volumeReduction() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}