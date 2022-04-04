package com.syntax.class25;
    interface Heathable{
    void healthy();
}
     public interface Walk extends Heathable{

    void burnColories();

}
    interface Milk{

        void giveEnergy();
    }
    interface Banana{

        void healthy();

        void giveEnergy();
}
class Demo implements Banana{
    @Override
    public void healthy() {
        System.out.println("banana is good for health");
    }
    @Override
    public void giveEnergy() {
        System.out.println("it gives us energy");
    }

    public static void main(String[] args) {
        Demo demo=new Demo();
        demo.giveEnergy();
        demo.healthy();
    }
}
