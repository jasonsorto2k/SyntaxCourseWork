package class23;

public class WebDriver {

    public void startBrowser(){
        System.out.println("Starting the browser...");
    }

    public void openURL(){
        System.out.println("Opening a URL...");
    }

    public void testLoginPage(){
        System.out.println("Checking if login page works...");
    }

    public void closeBrowser (){
        System.out.println("Closing the browser...");
    }
}

class Chrome extends WebDriver{

    public void startBrowser(){
        System.out.println("Starting google chrome");
    }

    public void openURL(){
        System.out.println("Opening the URL in google chrome");
    }

    public void testLoginPage(){
        System.out.println("Testing the login page in Chrome");
    }

    public void closeBrowser(){
        System.out.println("Closing the google chrome");
    }
}

class Safari extends WebDriver{

    public void startBrowser(){
        System.out.println("Starting safari");
    }

    public void openURL(){
        System.out.println("Opening the URL in safari");
    }

    public void testLoginPage(){
        System.out.println("Testing the login page in safari");
    }

    public void closeBrowser(){
        System.out.println("Closing safari");
    }
}

class Firefox extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("Starting Firefox");
    }

    @Override
    public void openURL() {
        System.out.println("Opening the URL in Firefox");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page in Firefox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing Firefox");
    }
}