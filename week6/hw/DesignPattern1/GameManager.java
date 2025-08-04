// 6610402230 Sirisuk Tharntham
// fix class to be singleton

package DesignPattern1;
import java.util.ArrayList;
import java.util.List;

public class GameManager {
    public static GameManager manager; //store only one object in static
    public List<Character> characters;
    private GameManager(){ //make it cannot be access to directly
        this.characters = new ArrayList<Character>();
    }
    public static GameManager getManager(){ //access or create new object if null
        if(manager == null) manager = new GameManager();
        return manager;

    }

    public void addCharacter(Character c){
        characters.add(c);
    }
    
}
