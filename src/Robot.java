public class Robot {
    private String name;
    private int batterylevel;
    private int distanceToPark;
    private String botType;

    public Robot(String name, int batterylevel, int distanceToPark, String botType){
        this.name = name;
        this.batterylevel = batterylevel;
        this.distanceToPark = distanceToPark;
        this.botType = botType;
    }

    public int getBatterylevel(){
        return batterylevel;
    }

    public int getDistanceToPark(){
        return distanceToPark;
    }

    public void setBatterylevel(int batterylevel){
        if (batterylevel < 0 || batterylevel >100){
            return;
        }
        this.batterylevel = batterylevel;
    }
    public void setDistanceToPark(int distanceToPark){
        if (distanceToPark <0){
            return;
        }
        this.distanceToPark = distanceToPark;
    }

    public String reportStatus() {

        return "Dette er bot " + name + " av type " + botType + ". Denne enheten har " + batterylevel + " igjen og bor " + distanceToPark + " meter fra parken.";}

    public boolean canWalkToThePark(World world) {

        System.out.println(name + " sjekker om det er mulig å gå til parken...");

        if (world.getIsRaining()) {
            // skriv ut hvorfor boten ikke kan gå i parken med System.out.println
            System.out.println("Denne dagen er det regn, derfor kan ikke " + name + " gå til parken.");
            return false;
        }

        if  (!world.isSunday()) {

            System.out.println("Det er dessverre ikke søndag,så " + name + " kan ikke gå til parken i dag.");
            return false;
        }
        if (batterylevel * 100 < distanceToPark) {
            System.out.println(name + " hadde for lavt batterinivå for å gå til parken.");
            return false;
        }
        int batteryUsed = distanceToPark/100;
        setBatterylevel(batterylevel-batteryUsed);
        System.out.println( name + " kan gå til parken i dag! :) Etter turen har du igjen " + batterylevel + "% strøm");
        return true;
    }

    public void chargingTime(int addBattery){
        if (addBattery <0){
            return;
        }
        if (batterylevel + addBattery >=100){
            System.out.println(name + " er fulladet! :)");
            this.batterylevel = 100;
        }
        else {
            System.out.println("Nå lader " + name +" "+ addBattery + "%");
            this.batterylevel += addBattery;
        }
    }

    public boolean canDanceAtClub(World world){
        if (!botType.equals("B-Bot")){
            System.out.println(name + " er typen " + botType + " som ikke kan danse.");
            return false;
        }
        if (batterylevel < 50){
            System.out.println( name + "har" + batterylevel + "% strøm, det er for lavt til å danse.");
            return false;
        }
        if (world.getDay()%7 == 1){
            System.out.println("I dag er det mandag, så " + name + "kan ikke danse fordi klubben er stengt.");
            return false;
        }
        if (world.getHour()>2 && world.getHour() < 18){
            System.out.println("Klubben er åpen fra kl 18:00 - kl 02:00, den er stengt nå");
            return false;
        }
        System.out.println( name + " kan dra på danseklubben i dag! :)");
        return true;
    }

}
