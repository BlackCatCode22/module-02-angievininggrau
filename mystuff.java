public class Main {
    public static void main(String[] args) {
        System.out.println(Cat.getCatCount());

        Cat myCat = new Cat();
        myCat.Meow();
        myCat.Name = "Spooky";
        myCat.Color = "Black";
        myCat.Age = 3;
        System.out.println(Cat.MAX_LIVES);
        System.out.println(myCat.getClass()); }
}
