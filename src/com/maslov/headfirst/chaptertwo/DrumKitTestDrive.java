package com.maslov.headfirst.chaptertwo;

public class DrumKitTestDrive {
    public static void main(String[] args){
        DrumKit d = new DrumKit();

        d.playSnare();
        d.playTopHat();

        d.snare = false;

        if (d.snare) {
            d.playSnare();
        }

    }

}

class DrumKit {
    boolean topHat = true;
    boolean snare = true;

    void playSnare() {
        System.out.println("bax bax ba-bax");
    }

    void playTopHat() {
        System.out.println("din din di-din");
    }
}
