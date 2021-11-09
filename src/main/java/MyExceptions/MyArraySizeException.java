package MyExceptions;

public class MyArraySizeException extends Exception{
    public MyArraySizeException() {
        System.out.println("Массив должен иметь размер 4х4!!!");
    }
}
