/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sperosdonutproject;

import java.util.Scanner;

/**
 *
 * @author siddharthgupta
 */
public class Donut {
    Scanner scan = new Scanner(System.in);
    private String name;
    Flavor flower = new Flavor();
    private String flavor = flower.getFlavor();
    private String filling = flower.getFilling();

    
    public String whatIsThis(){
        System.out.println(this.name);
        return (this.name);
    }
    
    public void whatFlavorIsThis(){
        System.out.println("This donut is "+flavor);
    }
    public void whatFillingIsThis(){
        System.out.println("This donut has "+filling);
    }
    
    public void changeFlavor(){
        System.out.println("What do you want to change your flavor to?");
        String fla = scan.nextLine();
        this.flavor = fla;
        
    }
    public void changeFilling(){
        System.out.println("What do you want to change your flavor to?");
        String fla = scan.nextLine();
        this.filling = fla;
        
    }

  
}

