package threads;

public class RunnablePractice implements Runnable {

    // instantiate a Thread object
    Thread thrd;

    public RunnablePractice(String name) {

        thrd = new Thread (this, name);
        thrd.start();
    }
    // must call the run method when implementing the runnable interface
    @Override
    public void run() {
        // does something
    }
}

