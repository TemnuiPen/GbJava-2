package Client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class MyClient {
    private final String SERVER_ADDR = "localhost";
    private final int SERVER_PORT = 333;

    private Socket socket;
    private DataInputStream in;
    private DataOutputStream out;

    public MyClient() {
        try {
            openConnection();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public void openConnection() throws IOException {
        socket = new Socket(SERVER_ADDR, SERVER_PORT);
        in = new DataInputStream(socket.getInputStream());
        out = new DataOutputStream(socket.getOutputStream());
        manageMessages();
    }

    public void manageMessages() throws IOException {
        try {
            printMessage();
        } catch (IOException e){
            e.printStackTrace();
        }
        try {
            sendMessage();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void sendMessage() throws IOException {
        new Thread(() -> {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите сообщение для отправки на сервер:");
            String str = sc.nextLine();
            try {
                out.writeUTF(str);
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        });

    }

    private void printMessage() throws IOException{
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while(true) {
                        String str = in.readUTF();
                        if(str.equals("/end")) {
                            closeConnection();
                            break;
                        }
                    }
                } catch (IOException exception) {
                    exception.printStackTrace();
                }
            }
        }).start();
    }
    public void closeConnection() {
        try {
            in.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        try {
            out.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        try {
            socket.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
