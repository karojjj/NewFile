package com.syntax.class25;

public interface Task2 {
    /*
    Create a WebDriver Interface that will have the following unimplemented behaviour:
     openBrowser(), closeBrowser(),
     maximizeWindow(), findElement().
      Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
     */
}
//creating interface
interface WebDriver{

    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();

}
class ChromeDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("opening chrome browswer");

    }

    @Override
    public void closeBrowser() {
        System.out.println("close chrome browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("maximizi chrome window");

    }

    @Override
    public void findElement() {
        System.out.println("finding element in chrome browser");

    }
}
class FireFox implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("open firefox driver");
    }

    @Override
    public void closeBrowser() {
        System.out.println("close firefox driver");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("maximizing firefox driver");
    }

    @Override
    public void findElement() {
        System.out.println("finding elements in firefox driver");
    }

    public static void main(String[] args) {
        WebDriver webDriver=new FireFox();
        webDriver.openBrowser();
        webDriver.closeBrowser();
        webDriver.maximizeWindow();
        webDriver.findElement();
        //or we can do by this way it is easier
        WebDriver[] webDrivers={new ChromeDriver(), new FireFox()};
        for (WebDriver w:webDrivers){
            w.openBrowser();
            w.closeBrowser();
            w.maximizeWindow();
            w.findElement();
        }
    }
}