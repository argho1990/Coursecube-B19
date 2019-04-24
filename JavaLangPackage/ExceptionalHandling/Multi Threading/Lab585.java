public class Lab585 {

    public static void main(String[] args) {

        Hello h1 = new Hello();
        MyThread th1 = new MyThread(h1);
        MyThread th2 = new MyThread(h2);
        th1.start();
        th2.start();
    }
}

class MyThread extends Thread {

    Hello h;

    MyThread(Hello h) {

        this.h = h;
    }

    public void run() {

        h.show();

    }

}

class Hello {

    synchronized static void show() {

        Thread th = Thread.currentThread();
        for (int i = 0; i < 5; i++) {

            System.out.println(th.getName() + "-SHOW:" + i);
            try {

                wait(1000);
                System.out.println(th.getName() + "-SHOW:" + i + "\t" + this);

            } catch (Exception e) {

                e.printStackTrace();
            }
        }
    }

}