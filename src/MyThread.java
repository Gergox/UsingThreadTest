public class MyThread implements Runnable {
    Thread thread;
    int start;
    int end;

    MyThread(String name, int start, int end) {
        thread = new Thread(this, name);
        this.start = start;
        this.end = end;
        thread.start();
    }

    public void counter() {
        if (this.start > this.end) {
            for (int i = start; i >= end; i--) {
                System.out.println("name = " + this.thread.getName() + " i = " + i);
            }
        } else{
            for (int i = start; i < end + 1; i++) {
                System.out.println("name = " + this.thread.getName() + " i = " + i);
            }
        }
    }

    @Override
    public void run() {
        counter();
    }
}
