class SleepDemo extends Thread {

    public void run() {
        for (int i = 1; i <= 10; i++) {

            System.out.println("Before sleep: " + i);

            try {
                Thread.sleep(1000);   
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            System.out.println("After sleep: " + i);
        }
    }
}

public class ProgrammeThree {  
    public static void main(String[] args) {

        SleepDemo t1 = new SleepDemo();
        t1.start();                    
    }
}