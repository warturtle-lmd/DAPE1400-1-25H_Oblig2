public class World {
    private boolean isRaining;
    private int day;// 1 er Mandag, 2 er Tirsdag, ..., 7 for Søndag, 8 er Mandag...
    private int hour;
    private boolean isSlippery;

    public World(int day, boolean isRaining, int hour, boolean isSlippery ) {
        this.day = day;
        this.isRaining = isRaining;
        this.hour = hour;
        this.isSlippery = isSlippery;
    }

    public boolean isSunday() {
        return  day%7 == 0;
    }

    public int getHour(){
        return this.hour;
    }

    public void setHour(int hour){
        if (hour <1 || hour >24 ){
            return;
        }
        this.hour = hour;
    }

    public boolean getIsSlippery(){
        return this.isSlippery;
    }

    public void setisSlippery(boolean isSlippery){
        this.isSlippery = isSlippery;

    }




    public boolean getIsRaining() {return this.isRaining;}
    public int getDay() {return this.day;}

    public void setDay(int day) {
        if(day<0){
            return;
        }
        this.day = day;
    }

    public void setRaining(boolean isRaining){
        this.isRaining = isRaining;
    }
}
