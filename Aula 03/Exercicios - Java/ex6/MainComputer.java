package ex6;

public class MainComputer {
    public static void main(String[] args) {
        Computer myComputer = new Computer("Intel Core i3 7020U", 8, 240);

        myComputer.displayInformation();

        myComputer.toConnect();

        myComputer.toConnect();

        myComputer.disconnect();

        myComputer.disconnect();

        myComputer.displayInformation();
    }
}
