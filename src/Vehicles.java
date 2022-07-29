//Создайте перечислительный тип (enum) Vehicles, содержащий конструктор, который должен принимать целочисленное значение (стоимость автомобиля).
// Энум должен содержать метод getColor(), который возвращает строку с цветом автомобиля, и  перегруженный метод toString(),
// который должен возвращать строку с названием экземпляра, цветом и стоимостью автомобиля.
enum Vehicles {
    BMW(100,"red"),
    NISSAN(120,"blue"),
    AUDI(140,"white");

    private int price;
    private String color;


    Vehicles(int price,String color){
        this.price=price;
        this.color=color;

    }
    public String getColor(){
        return color;

    }
    public String toString(){
        return "название экземпляра"+"  "+name()+" / "+"цвет"+" "+ getColor() + " /"+"цена"+" "+ price;
    }




    public static void main(String[] args) {
        Vehicles vehicles =  Vehicles.AUDI;
        System.out.println(vehicles);

        Vehicles vehicles1 = Vehicles.BMW;
        System.out.println(vehicles1);

        Vehicles vehicles2 = Vehicles.NISSAN;
        System.out.println(vehicles2);






        }


    }


