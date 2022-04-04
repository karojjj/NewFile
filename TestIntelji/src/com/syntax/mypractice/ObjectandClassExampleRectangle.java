package com.syntax.mypractice;

public class ObjectandClassExampleRectangle {
        public static void main(String[] args) {
         Rectangle r1=new Rectangle();
         Rectangle r2=new Rectangle();
         r1.insert(3,6);
         r2.insert(4, 7);
         r1.calculateArea();
         r2.calculateArea();
    }
}

class Rectangle {
        int length;
        int width;

        void insert(int l, int w) {
            length = l;
            width = w;
        }

        void calculateArea() {
            System.out.println(length * width);
        }
    }
