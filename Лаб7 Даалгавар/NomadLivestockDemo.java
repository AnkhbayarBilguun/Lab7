// Main
public class NomadLivestockDemo {
    public static void main(String[] args) {

        Herd herd = new Herd();

        herd.addLivestock(new Horse("Шарга", 4));
        herd.addLivestock(new Sheep("Халзан", 2));
        herd.addLivestock(new Camel("Хүрэн", 6));
        herd.addLivestock(new Goat("Залаа", 3));
        herd.addLivestock(new Cow("Хөх", 5));

        herd.dailyRoutine();

        System.out.println("\n--- Grazing Test ---");
        herd.grazingTest();
    }
}