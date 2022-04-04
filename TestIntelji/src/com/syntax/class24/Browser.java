package com.syntax.class24;

public class Browser {
    void openBrowser(){
        System.out.println("opening the browser");
    }
    void loadPage(String URL){
        System.out.println("loading the website "+ URL);
    }
    void testThePage(){
        System.out.println("testing the page");
    }
    void closeBrowser(){
        System.out.println("Closing the browser");
    }
}
class GoogleChrome extends Browser{
    void openBrowser(){
        System.out.println("opening the Google chrome browser");
    }
    void loadPage(String URL){
        System.out.println("loading the website "+ URL+" in GoogleChrome");
    }
    void testThePage(){
        System.out.println("testing the page in GoogleChrome");
    }
    void closeBrowser(){
        System.out.println("Closing the GoogleChrome browser");
    }
}
//shortcut to find and replace it ctrl+r
class FireFox extends Browser{
    void openBrowser(){
        System.out.println("opening the FireFox browser");
    }
    void loadPage(String URL){
        System.out.println("loading the website "+ URL+" in FireFox");
    }
    void testThePage(){
        System.out.println("testing the page in FireFox");
    }
    void closeBrowser(){
        System.out.println("Closing the FireFox browser");
    }
}
class Safari extends Browser{
    void openBrowser(){
        System.out.println("opening the Safari browser");
    }
    void loadPage(String URL){
        System.out.println("loading the website "+ URL+" in Safari");
    }
    void testThePage(){
        System.out.println("testing the page in Safari");
    }
    void closeBrowser(){
        System.out.println("Closing the Safari browser");
    }
}
class IE extends Browser{
    void openBrowser(){
        System.out.println("opening the IE browser");
    }
    void loadPage(String URL){
        System.out.println("loading the website "+ URL+" in IE");
    }
    void testThePage(){
        System.out.println("testing the page in IE");
    }
    void closeBrowser(){
        System.out.println("Closing the IE browser");
    }
}

