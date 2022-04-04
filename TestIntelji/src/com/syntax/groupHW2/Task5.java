package com.syntax.groupHW2;

public class Task5 {
    //code for diagram question
    public static void main(String[] args) {
        RemoteWebdriver[] drivers={new ChromeDriver(), new FireFoxDriver(), new SafariDriver()};
        for (RemoteWebdriver driver: drivers){
            driver.open();
            driver.close();
           // driver.getTitle(); need to syso
            driver.navigate();
            System.out.println(driver.getTitle());
        }
    }
}
interface Webdriver{
    void open();
    void close();
    String getTitle();

}
interface RemoteWebdriver extends Webdriver{
    void navigate();


}
interface TakeScreenShot extends RemoteWebdriver{
    void getScreenShot();

}
class ChromeDriver implements  RemoteWebdriver{

    @Override
    public void open() {
        System.out.println("open chrom");

    }

    @Override
    public void close() {
        System.out.println("close chrome");

    }

    @Override
    public String getTitle() {
        return "title of chrome";
    }

    @Override
    public void navigate() {
        System.out.println("navigate to chrome");

    }
}
class FireFoxDriver implements  RemoteWebdriver{

    @Override
    public void open() {
        System.out.println("open firefox");

    }

    @Override
    public void close() {
        System.out.println("close firefox");

    }

    @Override
    public String getTitle() {
        return "get title of firefox";
    }

    @Override
    public void navigate() {
        System.out.println("navigate to firefox");

    }
}
class SafariDriver implements RemoteWebdriver{

    @Override
    public void open() {
        System.out.println("open safari");

    }

    @Override
    public void close() {
        System.out.println("close safari");

    }

    @Override
    public String getTitle() {
        return "get title of safari";

    }

    @Override
    public void navigate() {
        System.out.println("navigate to safari");
    }
}