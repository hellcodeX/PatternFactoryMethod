package ua.vlad;

public class Main {
    public static void main(String[] args) {
        WatchMaker watchMaker = new DigitalWatchMaker();
        Watch watch = watchMaker.createWatch();
        watch.showTime();
    }
}

interface Watch {
    void showTime();
}

class DigitalWatch implements Watch {
    public void showTime() {
        System.out.println("Digital time!");
    }
}

class RomeWatch implements Watch {
    public void showTime() {
        System.out.println("Rome watch!");
    }
}

interface WatchMaker {
    Watch createWatch();
}

class DigitalWatchMaker implements  WatchMaker {
    public Watch createWatch() {
        return new DigitalWatch();
    }
}

class RomeWatchMaker implements  WatchMaker {
    public Watch createWatch() {
        return new RomeWatch();
    }
}