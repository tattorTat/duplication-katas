package com.example.duplicationkatas.helpers;

import java.awt.*;

public class Player {

    private final Point currentPosition = new Point(0, 0);

    public void move(String direction) {
        int x = (int) currentPosition.getX();
        int y = (int) currentPosition.getY();
        switch (direction) {
            case "N" -> currentPosition.move(x, y + 1);
            case "S" -> currentPosition.move(x, y - 1);
            case "E" -> currentPosition.move(x + 1, y);
            case "W" -> currentPosition.move(x - 1, y);
        }

    }

    public String getCurrentPosition() {
        String x = String.valueOf(currentPosition.getX());
        String y = String.valueOf(currentPosition.getY());
        return "You are at the following position (" + x + "," + y + ")";
    }
}