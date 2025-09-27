public class Main {
    public static void main(String[] args) {
        World todaysWorld = new World(140, false);
        Robot roarRobot = new Robot("RoarRobot", 88, 9000, "B-Bot");
        Robot roxanneRobot = new Robot("RoxanneRobot", 20, 100, "Toaster");

        System.out.println(roarRobot.reportStatus());
        System.out.println(roxanneRobot.reportStatus());

        roarRobot.canWalkToThePark(todaysWorld);
        roxanneRobot.canWalkToThePark(todaysWorld);

        roarRobot.canDanceAtClub(todaysWorld);
        roxanneRobot.canDanceAtClub(todaysWorld);

    }
}
