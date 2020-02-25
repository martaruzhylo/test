public class Main {
    public static void main(String[] args)
    {
        Animal [] animal = new Otter[2];
        animal[0]=new Otter("Vlad", 19, 0);
        animal[1]=new Otter("Marta", 18, 0);
           for(int i=0; i<animal.length; i++)
           {
               animal[i].countRating();
               animal[i].printRating();
           }


        }

//        Animal animal = new Otter();
//        animal.countRating();
//        animal.printRating();

    }

