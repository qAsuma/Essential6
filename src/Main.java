//Создать функциональный интерфейс ErrorPrinter с абстрактным методом printError, принимающий строку error. Создайте на базе интерфейса
// ErrorPrinter анонимный класс, реализующий метод printError. printError принимает строку и выводит ее в консоль красным цветом.
interface ErrorPrinter {
    void printError();
    }


public class Main {
    public static final String Color = "\u001B[0m";
    public static final String Color1 = "\u001B[31m";

    public static void main(String[] args) {
       ErrorPrinter errorPrinter = new ErrorPrinter() {
           @Override
           public void printError() {
               System.out.println(Color1+"ERROR"+Color);
           }
       };
       errorPrinter.printError();

    }
}
