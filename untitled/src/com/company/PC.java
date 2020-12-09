package com.company;

public class PC {

    public int HardDrive;
    public int Operativka;
    public String CPU;
    public int StartPC;

    public PC(int HardDrive, int Operativka, String  CPU,int StartPC) {
        this.CPU = CPU;
        this.HardDrive = HardDrive;
        this.Operativka = Operativka;
        this.StartPC = StartPC;
    }

    public static void TestPc() {
PC pc = new PC(1000,16,"intel core i7",0);
pc.Operativka = 16;
pc.HardDrive = 1000;
pc.CPU = "intel core i7";

    }
}