package com.syntax.mypractice;

public class Animall {
    private String name;
    private String color;

    public void eat() {
        System.out.println("munch");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
class Dogg extends Animall{
    private int breed;
    public void eat(){
        System.out.println("chomp chomp");
    }
    public int getBreed(){
        return breed;
    }
    public void setBreed(int breed){
        this.breed=breed;
    }

}
class Catt extends Animall{
    private String litterPreference;
    public void eat(){
        System.out.println("nom nom nom");
    }
    public String getLitterPreference(){
        return litterPreference;
    }
    public void setLitterPreference(){
        this.litterPreference=litterPreference;
    }
}