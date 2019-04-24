public class Lab577 {

    public static void main(String[] args) {

        ThreadGroup tg = new ThreadGroup("WE");
        MyThread th1 = new ThreadGroup(tg, "JLC-Thread");
        MYThread th2 = new Thread();
        th1.start();
        th2.start();
    }
}

class MyThread implements Runnable {

    public void run() {

        Thread th = Thread.currentThread();
        ThreadGroup tg = th.getThreadGroup();
        int pri = th.getPriority();
        for (int i = 0; i < 5; i++) {
            System.out.println(i + "\t" + th.getName() + "\t" + tg.getName() + "\t" + pri);
        }

    }

}