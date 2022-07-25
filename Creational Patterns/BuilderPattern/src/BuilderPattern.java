public class BuilderPattern {

    public static void main(String[] args) {
        Computer computer = new ComputerBuilder().setProcessor("i7").build();
        System.out.println(computer.toString());
    }

}

