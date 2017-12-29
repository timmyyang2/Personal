package RPGArena.Characters;
 
public class Rogue extends Character {
     
    // Rogue already has all the methods and variables of character - we only need to change what will be different.
     
    public int dexterity = 20;
      
    public Rogue(){
        super();
        this.strength = 8;
        this.defense = 4;
         
    }
}