package Server;

import Client.MyClient;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/*
Task:
Написать консольный вариант клиент\серверного приложения, в котором пользователь может писать сообщения как
на клиентской стороне, так и на серверной. Т.е. если на клиентской стороне написать «Привет»,
нажать Enter, то сообщение должно передаться на сервер и там отпечататься в консоли.
Если сделать то же самое на серверной стороне, сообщение, соответственно, передаётся клиенту и печатается у него
в консоли. Есть одна особенность, которую нужно учитывать: клиент или сервер может написать несколько сообщений подряд.
Такую ситуацию необходимо корректно обработать.
 */

public class MyServer {
    static MyClient myClient = new MyClient();

    public static void main(String[] args) throws IOException {
        establishServerConnection();
    }

    private static void establishServerConnection() {
        Socket socket = null;
        try (ServerSocket serverSocket = new ServerSocket(333)) {
            new MyClient();
            System.out.println("Сервер запущен, ожидаем подключения...");
            socket = serverSocket.accept();
            System.out.println("Клиент подключился");
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            while (true) {
                new Thread(() -> {
                    try {
                        sendMessage(out);
                    } catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }).start();
                myClient.manageMessages(); // Запуск обработки и отправки сообщений в MyClient
                if (!in.readUTF().equals("")) {
                    new Thread(() -> {
                        boolean flag = true;
                        try {
                            while (flag) {
                                flag = printMessage(in);
                            }
                        } catch (IOException exception) {
                            exception.printStackTrace();
                        }
                    }).start();
                }
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    private static void sendMessage(DataOutputStream out) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сообщение для отправки клиенту:");
        String str = sc.nextLine();
        out.writeUTF(str);
    }

    private static boolean printMessage(DataInputStream in) throws IOException {
        String str = in.readUTF();
        if (str.equals("/end")) {
            return false;
        }
        System.out.println("Server message:" + str);
        return true;

    }
}
