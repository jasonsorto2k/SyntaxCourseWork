package HW_2_11_2023;

public class Task1 {

    public static void main(String[] args) {

        Computer[] computers = {new Apple(), new HP()};

        for (Computer c : computers) {
            c.browserInternet();
            c.playVideo();

            if(c instanceof Apple){ // we are checking if the variable c contains the object of an Apple class
                Apple apple = (Apple)c; // c:Apple
            }

        }
    }
}


class Computer {

    int RAM;

    int Storage;

    String OS;


    void playVideo() {
        System.out.println("Video is playing");
    }

    void browserInternet() {
        System.out.println("Browse the internet");
    }
}

class Apple extends Computer {
    @Override
    void playVideo() {
        System.out.println("Playing the video on quick time player");
    }

    @Override
    void browserInternet() {
        System.out.println("Browsing the internet using safari");
    }

    void editVideos() {
        System.out.println("Editing on iMovies");
    }

    void installApps() {
        System.out.println("Installing apps from App Store");
    }
}

class HP extends Computer {
    @Override
    void browserInternet() {
        System.out.println("Browing internet using Chrome");
    }

    @Override
    void playVideo() {
        System.out.println("Playing the video using VLC player");
    }
}

