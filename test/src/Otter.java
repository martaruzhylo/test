public class Otter extends Animal implements IMammal{
    int coef=5;

    public Otter(String name, int age, double rating) {
        super(name, age, rating);
    }

    @Override
    public double countRating(){return rating=0 + (double) (Math.random() * 100 +coef);}
    @Override
    public void printRating(){System.out.println( name + ": " + rating + " coef: "+ coef);}
}
