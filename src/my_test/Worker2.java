package my_test;

// 인터페이스 사용해서 쓰레드 설계
public class Worker2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(i + "\t");

            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
            }
    }

    //테스트 코드
    public static void main(String[] args) {
       thread.Worker2 worker2 = new thread.Worker2();
        Thread subT1 = new Thread(worker2);
        subT1.start();

    }
}
