package impl;


import devpeaple.Peaple;

public class DriverBus implements Transport, Driver{

    private Peaple peaple;
    private String category;
    private int speed =60;

    @Override
    public void setCategory(String catig) {
        this.category = catig;
        peaple = new Peaple("Петя","Петров",35,null);
    }

    @Override
    public void go() {
        if(peaple != null ){
            System.out.println("ПОЕХАЛИ!!!");
        }else {
            System.out.println("СТОППП!!!");
        }
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }
}
