package threads;

public class ThreadPractice extends Thread {

    public ThreadPractice (String name) {
        super(name);
        start();
    }
    @Override
    public void run() {
        // do something
    }
}
