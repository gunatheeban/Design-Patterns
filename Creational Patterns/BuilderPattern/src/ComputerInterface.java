public interface ComputerInterface {

    ComputerBuilder setProcessor(String processor);
    ComputerBuilder setMotherBuilder(String motherBoard);
    ComputerBuilder setRam(String ram);
    ComputerBuilder setHdd(String hdd);
    ComputerBuilder setPsu(String psu);

}
