package DesignPattern3;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream fileIn = new FileInputStream("/Users/sirisuk/Desktop/SKDEV/CS/Y3S1/se/week6/hw/3-design-pattern/test.txt");
        LowercaseInputStream lowerIn = new LowercaseInputStream(fileIn);
        char lower = (char) lowerIn.read();
        System.out.println(lower);
        
        
    }
}
