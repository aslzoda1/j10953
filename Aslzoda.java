import java.util.*;
import java.util.stream.Collectors;

public class Aslzoda {
    public static void main(String[] args) {
        System.out.println("☕ Aslzoda Bozorboyeva - Enterprise Java Solution");
        calculateMatrix();
        streamAPIExample();
        threadSimulation();
    }

    public static void calculateMatrix() {
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = Arrays.stream(numbers).sum();
        System.out.println("🧮 Array Element Summation: " + sum);
    }

    public static void streamAPIExample() {
        List<String> frameworks = Arrays.asList("Spring", "Android SDK", "Hibernate", "JUnit");
        List<String> result = frameworks.stream()
            .filter(f -> f.contains(" "))
            .collect(Collectors.toList());
        System.out.println("🚀 Native Frameworks: " + frameworks);
    }

    public static void threadSimulation() {
        Runnable task = () -> System.out.println("🤖 Background Worker Synchronized Successfully.");
        new Thread(task).start();
    }
}