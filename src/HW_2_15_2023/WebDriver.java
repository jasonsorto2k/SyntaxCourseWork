package HW_2_15_2023;

public interface WebDriver {

    // Create a WebDriver Interface that will have the following unimplemented behaviour:
    // openBrowser(), closeBrowser(), maximizeWindow(), findElement().
    // Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.

    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}

class chromeDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Chrome browser has initialized");
    }
    @Override
    public void closeBrowser() {
        System.out.println("Chrome is being terminated");
    }
    @Override
    public void maximizeWindow() {
        System.out.println("Chrome's window has maximized to full-screen!");
    }
    @Override
    public void findElement() {
        System.out.println("Chrome program is finding the element");
    }
}

class FirefoxDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Firefox has been initialized");
    }
    @Override
    public void closeBrowser() {
        System.out.println("Firefox is being terminated");
    }
    @Override
    public void maximizeWindow() {
        System.out.println("Firefox's window has maximized to full-screen!");
    }
    @Override
    public void findElement() {
        System.out.println("Firefox program is finding the element");

    }
}
