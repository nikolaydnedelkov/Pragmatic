package computer;

public class ComputerDemo {
    public static void main(String[] args) {
        Computer pc = new Computer(2012, 500, false, 1000, 300, "Windows 10");
        Computer mac = new Computer(2019, 4500, true, 2048, 1560, "macOS");

        System.out.println(pc.toString());
        System.out.println(mac.toString());

        System.out.println();

        pc.changeOperationSystem("Ubunto");
        mac.useMemory(1700);
        mac.useMemory(300);

        System.out.println();

        System.out.println(pc.toString());
        System.out.println(mac.toString());
    }
}
