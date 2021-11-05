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
    public boolean run(int length) {
        if (length < maxRun) {
            System.out.println("Robot pass the barrier");
            return true;
        }
        else {
            System.out.println("Robot is not able to pass the barrier");
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if (height < maxRun) {
            System.out.println("Robot pass the barrier");
            return true;
        }
        else {
            System.out.println("Robot is not able to pass the barrier");
            return false;
        }
    }
}
