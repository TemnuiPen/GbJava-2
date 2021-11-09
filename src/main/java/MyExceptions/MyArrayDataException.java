package MyExceptions;

public class MyArrayDataException extends Exception{
    public MyArrayDataException(int i, int j) {
        System.out.println("В ячейке " + i + "," + j + " лежат неверные данные");
    }
}
