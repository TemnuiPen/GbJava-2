package Participants;

public class Human implements Participants {
    final int maxRun = 3000;
    final int maxJump = 2;

    String name;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean run(int length) {
        if (length < maxRun) {
            System.out.println("Human pass the barrier");
            return true;
        }
        else {
            System.out.println("Human is not able to pass the barrier");
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if (height < maxRun) {
            System.out.println("Human pass the barrier");
            return true;
        }
        else {
            System.out.println("Human is not able to pass the barrier");
            return false;
        }
    }
}
