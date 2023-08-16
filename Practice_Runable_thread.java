package hello.com;
class MyThreadRunable1 implements Runnable{
    @Override
    public void run() {
        int i = 0;
        while (i<200);
        System.out.println("I'm the compiler of thread");
        i++;
    }
}
class MyThreadRunable2 implements Runnable{
    @Override
    public void run() {
        int i = 0;
        while (i<200);
        System.out.println("I'm the compiler of runable 2");
        i++;
    }
}
public class Practice_Runable_thread {
    public static void main(String[] args) {
        MythreadRunable1 Bullet1 = new MythreadRunable1();
        Thread Gun = new Thread(Bullet1);
        MythreadRunable2 Bullet2 = new MythreadRunable2();
        Thread Gun1 = new Thread(Bullet2);
        Gun.start();
        Gun1.start();

    }
}
