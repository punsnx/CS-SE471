package DesignPattern3;

import java.io.IOException;
import java.io.InputStream;

public class LowercaseInputStream extends InputStream{
    private InputStream in;
    public LowercaseInputStream(InputStream in){
        this.in = in;

    }
    @Override
    public int read() throws IOException {
        int data = in.read();
        if(Character.isAlphabetic(data)){
            return Character.toLowerCase(data);
        }
        return data;
    }
    
}