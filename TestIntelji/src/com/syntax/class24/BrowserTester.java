package com.syntax.class24;

public class BrowserTester {
    public static void main(String[] args) {
        /*GoogleChrome googleChrome=new GoogleChrome();
        googleChrome.openBrowser();
        googleChrome.loadPage("www.google.com");
        googleChrome.testThePage();
        googleChrome.closeBrowser();

        FireFox firefox=new FireFox();
        firefox.openBrowser();
        firefox.loadPage("www.google.com");
        firefox.testThePage();
        firefox.closeBrowser();

        Safari safari=new Safari();
        safari.openBrowser();
        safari.loadPage("www.google.com");
        safari.testThePage();
        safari.closeBrowser();

        IE explorer=new IE();
        explorer.openBrowser();
        explorer.loadPage("www.google.com");
        explorer.testThePage();
        explorer.closeBrowser();


        instead of writing the code like this we can use polymorphism to make our code more clean, and organized
         */
 //easiest and shortest way to write the code
        Browser[] browser={ new GoogleChrome(), new Safari(), new IE(), new FireFox()};
        for(Browser b:browser){
            b.closeBrowser();
            b.loadPage("www.google.com");
            b.openBrowser();
            b.testThePage();
        }
    }
}
