package org.example.FromLecture;

public class ExamplesFromLecture_1 {
    public static void main(String[] args) {

        int ax = 0;
        int ay = 0;
        int bx = 5;
        int by = 4;

        System.out.println(distance(ax, bx, ay, by));
    }

    static double distance (int x1, int x2, int y1, int y2){
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}