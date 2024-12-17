package com.example.tue171224;

public class MemePlayer {
    String play;
    int image;
    public MemePlayer(String play) {
        this.play = play;
    }

    public MemePlayer(int image) {
        this.image = image;
    }

    public String getPlay() {
        return play;
    }

    public int getImage() {
        return image;
    }
}
