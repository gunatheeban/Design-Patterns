public class Computer {

    private String processor;
    private String motherBoard;
    private String ram;
    private String hdd;
    private String psu;

    public Computer(String processor, String motherBoard, String ram, String hdd, String psu) {
        this.processor = processor;
        this.motherBoard = motherBoard;
        this.ram = ram;
        this.hdd = hdd;
        this.psu = psu;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", motherBoard='" + motherBoard + '\'' +
                ", ram='" + ram + '\'' +
                ", hdd='" + hdd + '\'' +
                ", psu='" + psu + '\'' +
                '}';
    }
}
