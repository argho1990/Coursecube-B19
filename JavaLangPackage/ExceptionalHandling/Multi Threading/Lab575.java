public class Lab575 {

    public static void main(String[] args) {

        MyThread th = new MyThread();
        MyThread t1 = new MyThread(th);
        MyThread t2 = new MyThread(th);
        t1.start();
        t2.start();
        Thread t = Thread.currentThread();
        for (int i = 100; i <= 110; i++) {
            System.out.println(t.getName() + "-value is:" + i);
        }

        try {
            Thread.sleep(500);
        } catch (Exception e) {

            e.printStackTrace();

        }
    }
}

class MyThread implements Runnable {

    public void run() {

        Thread th = Thread.currentThread();
        for (int i = 1; i <= 10; i++) 
        
        }

}

}