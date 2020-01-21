package computer;

public class Computer {
    private int year;
    private double price;
    private boolean isNotebook;
    private int hardDiskMemory;
    private int freeMemory;
    private String operationSystem;

    public Computer(int year, double price, boolean isNotebook, int hardDiskMemory, int freeMemory, String operationSystem) {
        this.year = year;
        this.price = price;
        this.isNotebook = isNotebook;
        this.hardDiskMemory = hardDiskMemory;
        this.freeMemory = freeMemory;
        this.operationSystem = operationSystem;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "year=" + year +
                ", price=" + price +
                ", isNotebook=" + isNotebook +
                ", hardDiskMemory=" + hardDiskMemory +
                ", freeMemory=" + freeMemory +
                ", operationSystem='" + operationSystem + '\'' +
                '}';
    }

    public void changeOperationSystem(String newOperationSystem) {
        this.operationSystem = newOperationSystem;
    }

    public void useMemory(double memory) {
        if (memory < this.freeMemory) {
            this.freeMemory -= memory;
        } else {
            System.out.println("Not enough free memory!");
        }
    }
}
