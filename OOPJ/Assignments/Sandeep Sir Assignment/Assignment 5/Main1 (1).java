class InstanceCounter {
    private static int count = 0;  // Static variable to keep count

    public InstanceCounter() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}

public class Main1 {
    public static void main(String[] args) {
        new InstanceCounter();  // First instance
        new InstanceCounter();  // Second instance
        new InstanceCounter();  // Third instance

        System.out.println("Total instances created: " + InstanceCounter.getCount());
    }
}