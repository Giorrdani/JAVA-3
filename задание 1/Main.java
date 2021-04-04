public class Main {

    public static Object obj = new Object();
    static char abc = 'A';

    public static void main(String[] args) {
        Main m = new Main();
        new Thread(()-> m.printA()).start();
        new Thread(()-> m.printB()).start();
        new Thread(()-> m.printC()).start();
    }

    public void printA(){
        synchronized (obj) {
            for (int i = 0; i < 5; i++) {
                while (abc != 'A') {
                    try {
                        obj.wait();
                    } catch (InterruptedException exception) {
                        exception.printStackTrace();
                    }
                }
                System.out.print('A');
                abc = 'B';
                obj.notifyAll();
            }
        }
    }

    public void printB() {
        synchronized (obj) {
            for (int i = 0; i < 5; i++) {
                while (abc != 'B') {
                    try {
                        obj.wait();
                    } catch (InterruptedException exception) {
                        exception.printStackTrace();
                    }
                }
                System.out.print('B');
                abc = 'C';
                obj.notifyAll();
            }
        }
    }

    public void printC() {
        synchronized (obj) {
            for (int i = 0; i < 5; i++) {
                while (abc != 'C') {
                    try {
                        obj.wait();
                    } catch (InterruptedException exception) {
                        exception.printStackTrace();
                    }
                }
                System.out.print('C');
                abc = 'A';
                obj.notifyAll();
            }
        }
    }
}


