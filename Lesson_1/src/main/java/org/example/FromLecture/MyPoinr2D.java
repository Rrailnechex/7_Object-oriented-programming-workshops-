package org.example.FromLecture;

public class MyPoinr2D {
    int x,y;
    public MyPoinr2D(int X, int Y){
        x = X;
        y = Y;
    }

    public MyPoinr2D(){
        x = 0;
        y = 0;
    }
    public String getInfo(){
        return String.format("x:%d; y:%d", x,y);
    }

    @Override
    public String toString() {
        return getInfo();
    }
}
