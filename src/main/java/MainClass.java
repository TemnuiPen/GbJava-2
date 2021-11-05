import Barriers.RunningTrack;
import Barriers.Wall;
import Participants.Cat;
import Participants.Human;
import Participants.ParticipantType;
import Participants.Robot;

import java.util.Arrays;
import java.util.HashMap;

public class MainClass {
    static final int jumpLimit = 20;

    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik");
        Human human1 = new Human("Ivan");
        Robot robot1 = new Robot("Verter");

        String[] participants  = {
                cat1.getName(),
                human1.getName(),
                robot1.getName()
        };

        HashMap <String, ParticipantType> participantTypeHashMap = new HashMap<>();
        participantTypeHashMap.put(cat1.getName(),ParticipantType.CAT);
        participantTypeHashMap.put(human1.getName(), ParticipantType.HUMAN);
        participantTypeHashMap.put(robot1.getName(), ParticipantType.ROBOT);

        Wall wall1 = new Wall(1);
        Wall wall2 = new Wall(3);
        RunningTrack runningTrack1 = new RunningTrack(3000);

        int[] barriers = {
                wall1.getHeight(),
                runningTrack1.getLength(),
                wall2.getHeight()
        };

        for (String participant : participants) {
            System.out.println("Participant " + participant + " is ready to pass the barriers!");

            switch(participantTypeHashMap.get(participant)) {
                case CAT -> {
                    for (int barrier : barriers) {
                        if (barrier > jumpLimit) {
                            cat1.run(barrier);
                        }
                        else {
                            cat1.jump(barrier);
                        }
                    }
                }
                case HUMAN -> {
                    for (int barrier : barriers) {
                        if (barrier > jumpLimit) {
                            human1.run(barrier);
                        }
                        else {
                            human1.jump(barrier);
                        }
                    }
                }
                case ROBOT -> {
                    for (int barrier : barriers) {
                        if (barrier > jumpLimit) {
                            robot1.run(barrier);
                        }
                        else {
                            robot1.jump(barrier);
                        }
                    }
                }
            }
            System.out.println("______________________________________________________________");
            System.out.println("");
        }
    }

}
