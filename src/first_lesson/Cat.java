package first_lesson;

public class Cat {
    // свойства
    private String breed;
    private String name;
    private int age;
    private String color;

    public Cat(String breed, String name, int age, String color) {
        this.breed = breed;
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }
}
