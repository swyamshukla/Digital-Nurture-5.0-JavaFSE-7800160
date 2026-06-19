public class Main {
    public static void main(String[] args) {

        System.out.println("Builder Design Pattern");
        System.out.println("----------------------");

        Computer.Builder builder = new Computer.Builder();
        builder.setCPU("Apple M3");
        builder.setRAM("16GB Unified Memory");
        builder.setSTORAGE("512GB SSD");

        System.out.println(builder.build());

        System.out.println();

        builder = new Computer.Builder();
        builder.setCPU("Intel Core i9");
        builder.setRAM("64GB DDR5");
        builder.setSTORAGE("2TB NVMe SSD");

        System.out.println(builder.build());
    }
}