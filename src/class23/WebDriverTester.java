package class23;

public class WebDriverTester {

    public static void main(String[] args) {

        WebDriver webDriver = new Firefox();
        webDriver.startBrowser();
        webDriver.openURL();
        webDriver.testLoginPage();
        webDriver.closeBrowser();

        // An array of type parent class the all objects of child classes belong to

        WebDriver [] browsers = {new Chrome(),new Safari(),new Firefox()};

        for (WebDriver browser:browsers) {
            browser.startBrowser();
            browser.openURL();
            browser.testLoginPage();
            browser.closeBrowser();
        }


//        Safari MacSafari = new Safari();
//        MacSafari.startBrowser();
//        MacSafari.openURL();
//        MacSafari.testLoginPage();
//        MacSafari.closeBrowser();
//
//        Firefox ff = new Firefox();
//        ff.startBrowser();
//        ff.openURL();
//        ff.testLoginPage();
//        ff.closeBrowser();


    }
}
