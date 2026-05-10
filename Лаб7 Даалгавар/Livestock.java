import java.util.ArrayList;

// Абстракт класс
abstract class Livestock {
    String name;
    int age;

    public Livestock(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract String makeSound();

    // Overloading
    void graze() {
        System.out.println(name + " талбайд бэлчинэ.");
    }

    void graze(String food) {
        System.out.println(name + " " + food + "-ыг бэлчинэ.");
    }

    // Overloaded method (шинэ шаардлага)
    String makeSound(int volume) {
        return makeSound() + " (дууны түвшин: " + volume + ")";
    }
}

// Интерфейс
interface WorkRole {
    String performTask();
}

// Морь
class Horse extends Livestock implements WorkRole {
    public Horse(String name, int age) {
        super(name, age);
    }

    @Override
    String makeSound() {
        return "Янцгаана!";
    }

    @Override
    public String performTask() {
        return "Морь талбайд уналгад хэрэглэгдэнэ.";
    }
}

// Хонь
class Sheep extends Livestock {
    public Sheep(String name, int age) {
        super(name, age);
    }

    @Override
    String makeSound() {
        return "Маа!";
    }
}

// Тэмээ
class Camel extends Livestock implements WorkRole {
    public Camel(String name, int age) {
        super(name, age);
    }

    @Override
    String makeSound() {
        return "Буйлна!";
    }

    @Override
    public String performTask() {
        return "Тэмээ говийн тээвэрт хэрэглэгдэнэ.";
    }
}

// Ямаа (шинэ)
class Goat extends Livestock {
    public Goat(String name, int age) {
        super(name, age);
    }

    @Override
    String makeSound() {
        return "Мээ!";
    }
}

// Үхэр (шинэ)
class Cow extends Livestock implements WorkRole {
    public Cow(String name, int age) {
        super(name, age);
    }

    @Override
    String makeSound() {
        return "Мүү!";
    }

    @Override
    public String performTask() {
        return "Үхэр сүү, махны үйлдвэрлэлд ашиглагдана.";
    }
}

// Сүрэг
class Herd {
    ArrayList<Livestock> livestock = new ArrayList<>();

    void addLivestock(Livestock animal) {
        livestock.add(animal);
    }

    // Polymorphism тест
    void dailyRoutine() {
        for (Livestock animal : livestock) {
            System.out.println(animal.name + ": " + animal.makeSound());

            if (animal instanceof WorkRole) {
                System.out.println(((WorkRole) animal).performTask());
            }
        }
    }

    // graze() polymorphism тест
    void grazingTest() {
        for (Livestock animal : livestock) {
            animal.graze();
        }
    }
}

