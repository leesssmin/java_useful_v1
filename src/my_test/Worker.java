package my_test;

// 상속을 통해
public class Worker extends Thread{

    private String name;

    Worker(String name){
        this.name = name;
    }

    @Override
    public void run() {
        for(int i = 0; i < 50; i++){
            System.out.println("worker" + name + " : " + i);
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e1){
                System.out.println("외부에서 예외 발생");
                e1.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        thread.Worker worker1 = new thread.Worker("워커1");
        worker1.start();
    }
}

