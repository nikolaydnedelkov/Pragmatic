import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class LockExample {
    static int count = 0;
    static void increment() {
        count = count + 1;
    }

    public static void main(String[] args) {

//        ExecutorService executor = Executors.newFixedThreadPool(2);
//        IntStream.range(0, 10000)
//                .forEach(i -> executor.submit(Threads::increment));
//        executor.shutdown();
//        System.out.println(count); // 9887
    }
}
