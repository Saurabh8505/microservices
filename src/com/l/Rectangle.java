package com.l;


class Rectangle {
    private int width;
     private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public int getWidth() { return width; }
    public void setWidth(int width) { this.width = width; }
    public int getHeight() { return height; }
    public void setHeight(int height) { this.height = height; }
    public int getArea() { return width * height; }
}

class Square extends Rectangle {
    public Square() {
        super(0, 0);
    }
    @Override
    public void setWidth(int width) { super.setWidth(width); }
    @Override
    public void setHeight(int height) { super.setHeight(height); }
   }

