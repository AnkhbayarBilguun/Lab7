// Үндсэн класс

public class NomadLivestockDemo {

public static void main(String[] args) {

Herd herd = new Herd();

herd.addLivestock(new Horse("Шарга", 4));

herd.addLivestock(new Sheep("Халзан", 2));

herd.addLivestock(new Camel("Хүрэн", 6));


herd.dailyRoutine();

}

}
