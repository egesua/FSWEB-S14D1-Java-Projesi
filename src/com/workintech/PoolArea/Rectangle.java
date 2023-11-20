package com.workintech.PoolArea;

public class Rectangle {
    private int width;
    private int length;

    public Rectangle(int width, int length) {
        this.width = Math.max(width, 0);
        this.height = Math.max(height,0);
    }

    public int getWidth(){
        return width;
    }

    public int getLength(){
        return length;
    }

    public void setWidth(int width){
        this.width = width < 0 ? 0 : width;
    }

    public int getArea(){
        return width * length;
    }

}
