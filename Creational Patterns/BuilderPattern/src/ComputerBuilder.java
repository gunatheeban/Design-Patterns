public class ComputerBuilder {

    private String processor;
    private String motherBoard;
    private String ram;
    private String hdd;
    private String psu;

    public ComputerBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public ComputerBuilder setMotherBuilder(String motherBoard){
        this.motherBoard = motherBoard;
        return this;
    }

    public ComputerBuilder setRam(String ram){
        this.ram = ram;
        return this;
    }

    public ComputerBuilder setHdd(String hdd){
        this.hdd = hdd;
        return this;
    }

    public ComputerBuilder setPsu(String psu){
        this.psu = psu;
        return this;
    }

    public Computer build(){
        return new Computer(processor,motherBoard,ram,hdd,psu);
    }
}
