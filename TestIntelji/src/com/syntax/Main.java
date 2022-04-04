package com.syntax;

public class Main {

    public static void main(String[] args) {



    }}
class Animal {
    String name;
    int age;
    String color;

    Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    void eat() {
        System.out.println("Cat eats");
    }

    void sleep() {
        System.out.println("Cat sleeps a lot");

    }

    class Cat extends Animal {

        Cat(String name, int age, String color) {
            super(name, age, color);
        }

        class kitten1 extends Cat {
            kitten1(String name, int age, String color) {
                super(name, age, color);
            }

            @Override
            void eat() {
                System.out.println("kitten1 eats milk");
            }

            @Override
            void sleep() {
                System.out.println("kitten1 sleeps a lot");
            }
        }

        class kitten2 extends Cat {
            kitten2(String name, int age, String color) {
                super(name, age, color);
            }

            @Override
            void eat() {
                System.out.println("kitten2 eats milk");
            }

            @Override
            void sleep() {
                System.out.println("kitten2 sleeps a lot");
            }
        }

        class kitten3 extends Cat {
            kitten3(String name, int age, String color) {
                super(name, age, color);
            }

            @Override
            void eat() {
                System.out.println("kitten3 eats milk");

            }

            @Override
            void sleep() {
                System.out.println("kitten3 sleeps a lot");
            }
        }

    }}