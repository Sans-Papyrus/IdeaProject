package com.mirrorseek.method;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Demo1Method {
    public static void main(String[] args) {
        PrintStarts();
    }
    
    public static void PrintStarts() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
