package first_lesson;

public class FirstProgram {
    public static void main(String[] args) {

        Cat firstCat = new Cat("Siam", "John", 1, "black");
        Cat secondCat = new Cat("British", "Boris", 58, "white");

        System.out.println("First cat breed: " + firstCat.getBreed());
        System.out.println("First cat name " + firstCat.getName());
        System.out.println("First cat age " + firstCat.getAge());
        System.out.println("First cat color " + firstCat.getColor());
        System.out.println("Second cat breed: " + secondCat.getBreed());
        System.out.println("Second cat name " + secondCat.getName());
        System.out.println("Second cat age " + secondCat.getAge());
        System.out.println("Second cat color " + secondCat.getColor());
    }
}
