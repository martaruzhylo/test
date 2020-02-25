abstract class Animal implements IAnimal{
    String name;
    int age;
    double rating;

    public Animal(String name, int age, double rating) {
        this.name = name;
        this.age = age;
        this.rating = rating;
    }

    public double countRating (){ return rating=0 + (double) (Math.random() * 100); }
    public void printRating(){System.out.println(rating);}
}
