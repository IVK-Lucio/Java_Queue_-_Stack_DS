/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mystruct;

/**
 *
 * @author ivluc
 */
public class Lion 
{
      //Declaration of Lion attributes
    String continent;
    String family;
    String species;
    String color;
    
    public Lion()
    {
        //Declaration of Lion default constructor
        this.continent = null;
        this.family = null;
        this.species = null;
        this.color = null;
    }
    public Lion(String c,String s,String sp,String cl)
    {
        //Declaration of Lion full constructor
        this.continent = c;
        this.family = s;
        this.species = sp;
        this.color = cl;
    }
}
