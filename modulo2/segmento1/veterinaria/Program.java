public class Program {
    public static void main(String args[]) {
        Dog miPerro = new Dog("Fido", "Pastor aleman", "Mediano", 2.0, "negro");

        System.out.println(miPerro.getName());
        System.out.println(miPerro.getRace());
        System.out.println(miPerro.getSize());
        System.out.println(miPerro.getWeight());
        System.out.println(miPerro.getColor());
        System.out.println(miPerro.getAge());
        
        miPerro.bark();
        System.out.println(miPerro.getAge());
        miPerro.getOlder();
        System.out.println(miPerro.getAge());
        miPerro.bark();
        System.out.println(miPerro.getWeight());
        miPerro.eat(1.0);
        System.out.println(miPerro.getWeight());
        miPerro.bark();
        miPerro.poop(3.0);
        System.out.println(miPerro.getWeight());
    }
}