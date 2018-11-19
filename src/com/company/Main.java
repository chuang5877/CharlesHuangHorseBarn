package com.company;

public class Main {

    public static void main(String[] args) {
	Horse horse1=new Mustang("Horse1", 12000);
	Horse horse2=new Mustang("Horse2", 22000);
	Horse horse3=new Mustang("Horse3", 12000);
	Horse[] horses=new Horse[6];
	horses[1]=horse1;
	horses[3]=horse2;
	horses[5]=horse3;
	HorseBarn barn=new HorseBarn(horses);
	System.out.println(barn);
	System.out.println("Horse2 is in space: "+barn.findHorseSpace("Horse2"));
	barn.consolidate();
	System.out.println(barn);
	System.out.println("Horse2 is in space: "+barn.findHorseSpace("Horse2"));
    }
}
