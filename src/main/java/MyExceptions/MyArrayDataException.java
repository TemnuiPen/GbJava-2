package MyExceptions;

public class MyArrayDataException extends Exception{
    int i;
    int j;
    public MyArrayDataException(int i, int j) {
        this.i = i;
        this.j = j;
    }
    public void printException() {
        System.out.println("В ячейке " + i + "," + j + " лежат неверные данные");
    }
}
