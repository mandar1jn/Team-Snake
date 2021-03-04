package me.polymarsdev.teamsnake.entity;

import java.io.Serializable;

public class Segment implements Serializable {
    int x;
    int y;

    public Segment(int x, int y) {
        this.x = x;
        this.y = y;

    }

    void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    void moveUp() { //move functions only used on head
        y -= 1;
    }

    void moveDown() {
        y += 1;
    }

    void moveLeft() {
        x -= 1;
    }

    void moveRight() {
        x += 1;
    }
}