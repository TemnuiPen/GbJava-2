package Participants;

public class Robot implements Participants{
    final int maxRun = 10000;
    final int maxJump = 3;

    String name;

    public Robot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run(int length) {
        if (length < maxRun) {
            System.out.println("Robot pass the barrier");
        }
        else {
            System.out.println("Robot is not able to pass the barrier");
        }
    }

    @Override
    public void jump(int height) {
        if (height < maxRun) {
            System.out.println("Robot pass the barrier");
        }
        else {
            System.out.println("Robot is not able to pass the barrier");
        }
    }
}
