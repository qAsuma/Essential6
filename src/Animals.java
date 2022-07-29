//Создайте перечислительный тип (enum) Animals, содержащий конструктор, который должен принимать целочисленное значение (возраст животного).
// Энум должен содержать перегруженный метод toString(), который должен возвращать название экземпляра и возраст животного.
public enum Animals {
    TIGER(5),
    BEAR(3),
    MOUSE(6),
    ELEPHANT(50);

    private int age;


    Animals(int age) {
        this.age = age;


    }

    public String toString(){
        return "название экземпляра"+"  "+name()+" "+ "возраст животного" +" "+ age;
    }

    public static void main(String[] args) {

//        for (Animals all : Animals.values()) {
//            System.out.println(all + "- " + all.age);
//        }
        Animals animal = Animals.TIGER;
        System.out.println(animal);

        Animals animal1 = Animals.BEAR;
        System.out.println(animal1);

        Animals animal2 = Animals.MOUSE;
        System.out.println(animal2);

        Animals animal3 = Animals.ELEPHANT;
        System.out.println(animal3);


    }
}
