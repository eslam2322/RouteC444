package day6;

public interface Vehicle {
    void start();
    default void stop() {
        System.out.println("vehicle stop");
    }
}

