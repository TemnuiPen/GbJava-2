package Participants;

public class Cat implements Participants{
    final int maxRun = 2000;
    final int maxJump = 1;

    String name;

    public String getName() {
        return name;
    }

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void run(int length) {
        if (length < maxRun) {
            System.out.println("Cat pass the barrier");
        }
        else {
            System.out.println("Cat is not able to pass the barrier");
        }
    }

    @Override
    public void jump(int height) {
        if (height < maxRun) {
            System.out.println("Cat pass the barrier");
        }
        else {
            System.out.println("Cat is not able to pass the barrier");
        }
    }
}
