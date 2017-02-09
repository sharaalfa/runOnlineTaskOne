package a.sharafutdinov;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Timer timer = new Timer();
        Runnable timeOne = new Message(5, timer);
        Runnable timeTwo = new Message(1, timer);
        new Thread(timeOne, "timeOne").start();
        new Thread(timeTwo, "timeTwo").start();
        timer.timeCount((Message) timeOne, (Message) timeTwo, 10);

    }
}
