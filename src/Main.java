public class Main {
    public static void main(String[] args) {
        World todaysWorld = new World(140, false,17,false);
        Robot roarRobot = new Robot("RoarRobot", 88, 9000, "B-Bot");
        Robot roxanneRobot = new Robot("RoxanneRobot", 20, 1000, "Toaster");
        Robot lauraBot = new Robot("LauraBot", 75, 6000, "B-Bot");
        Robot krisBot = new Robot("KrisBot", 80,5000,"Toaster");

        System.out.println(roarRobot.reportStatus());
        System.out.println(roxanneRobot.reportStatus());

        roarRobot.canWalkToThePark(todaysWorld);
        roxanneRobot.canWalkToThePark(todaysWorld);
        roxanneRobot.canWalkToThePark(todaysWorld);
        roxanneRobot.chargingTime(20);
        System.out.println(roxanneRobot.getBatterylevel());
        roxanneRobot.canWalkToThePark(todaysWorld);

        System.out.println(lauraBot.reportStatus());
        System.out.println(krisBot.reportStatus());
        lauraBot.canWalkToThePark(todaysWorld);
        krisBot.canWalkToThePark(todaysWorld);
        System.out.println(lauraBot.getBatterylevel());
        System.out.println(krisBot.getBatterylevel());
        lauraBot.chargingTime(35);
        krisBot.chargingTime(40);
        System.out.println(lauraBot.getBatterylevel());
        System.out.println(krisBot.getBatterylevel());

        lauraBot.canDanceAtClub(todaysWorld);
        krisBot.canDanceAtClub(todaysWorld);



        roarRobot.canDanceAtClub(todaysWorld);
        roxanneRobot.canDanceAtClub(todaysWorld);

        todaysWorld.setDay(2);
        System.out.println(todaysWorld.getDay());
        roarRobot.setBatterylevel(300);
        System.out.println(roarRobot.getBatterylevel());
        roarRobot.setDistanceToPark(600);
        System.out.println(roarRobot.getDistanceToPark());
        todaysWorld.setRaining(true);
        System.out.println(todaysWorld.getIsRaining());


    }
}
