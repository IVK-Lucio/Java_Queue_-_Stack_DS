
package mystruct;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
/**
 *
 * @author ivluc
 */
public class MyStruct 
{

    public static void main(String[] args) 
    {
       
       //Creation of queue object
       LinkedList queue = new LinkedList<>();
       
       //Creation of Stack  object
       Stack stck = new Stack();
        
       //Instatating four Lion objects for the queue
       Lion lObj1 = new Lion("Africa","  Big Cat"," Panthera Leo",             "      Blond");
       Lion lObj2 = new Lion("Asia","    Big Cat"," Panthera Leo persica   ",     " Dark Brown");
       Lion lObj3 = new Lion("Africa","  Big Cat"," Panthera Leo",             "      Brown");
       Lion lObj4 = new Lion("Africa","  Big Cat"," Panthera Leo",             "       Gold");
       
       //Instatating four Lion  objects for the Stack
       Lion sObj1 = new Lion("Africa","  Big Cat"," Panthera Leo",             "       Blond");
       Lion sObj2 = new Lion("Asia","    Big Cat"," Panthera Leo persica     ",     "  Dark Brown");
       Lion sObj3 = new Lion("Africa","  Big Cat"," Panthera Leo",             "        Brown");
       Lion sObj4 = new Lion("Africa","  Big Cat"," Panthera Leo",             "        Gold");
       
       //Adding  object to a queue 
       queue.add(lObj1);
       queue.add(lObj2);
       queue.add(lObj3);
       queue.add(lObj4);
       
       //Pushing objcts to a Stack
       stck.push(sObj1);
       stck.push(sObj2);
       stck.push(sObj3);
       stck.push(sObj4);
       //Color codes
       String c = "\u001B[36m";//Cian
       String R = "\033[1;34m"; // RED
       String yb =  "\033[1;32m";// YELLOW backgr
       
       Scanner in = new Scanner(System.in);
       int choice;
       
       do{
           //Details for my option menu 
            System.out.println("");
            System.out.println(c+"****WELCOME TO LUCIO (LION) STACK AND QUEUE***" +c);
            System.out.println("************************************************************************");
            System.out.println(R+"SELECT OPTION 1 TO 6 TO CONTINUE"+R);
            System.out.println("************************************************************************");
            System.out.println("1. View content of a Queue");
            System.out.println("2. View content of a Stack");
            System.out.println("3. Remove one object from the Queue");
            System.out.println("4. Pop one object from the Stack");
            System.out.println("5. Queue after removing an object");
            System.out.println("6. Stack after popping an object");
            System.out.println("________________________________________________________________________");
            choice = in.nextInt();
            switch  (choice)
            {
              //Choices  for my option menu as well as calling of methods to be executed during number selection
                case 1://Showing content of the Queue
                     System.out.println(c+"Viewing content of a Queue"+c);
                     System.out.println(yb+"CONTINENT  FAMILY         SPECIES                 COLOR"+yb);
                     System.out.print(yb+"........................................................"+yb+"\n");
                     for (int i =queue.size()-1; i >= 0; i--) 
                     {
                         System.out.println(((Lion)queue.get(i)).continent +",  "+ 
                                           ((Lion)queue.get(i)).family +  ",      "+
                                           ((Lion)queue.get(i)).species +",   " +
                                           ((Lion)queue.get(i)).color);
                                            queue.get(i);
                        }
                       System.out.println(yb+"........................................................"+yb);
       
                    break;
                case 2://Showing content of the Stack
                      System.out.println(c+"Viewing content of a Stack"+c);
                     System.out.println(yb+"CONTINENT  FAMILY         SPECIES                 COLOR"+yb);
                      System.out.print(yb+"........................................................"+yb+"\n");
                      for (int i =stck.size()-1; i >= 0; i--) 
                      {
                       
                        System.out.println(((Lion)stck.get(i)).continent +",  "+ 
                                          ((Lion)stck.get(i)).family +  ",      "+
                                          ((Lion)stck.get(i)).species +",   " +
                                          ((Lion)stck.get(i)).color);
                                          stck.get(i);
                      } 
                       System.out.println(yb+"........................................................"+yb);
                    break;
                    
                case 3://Removing an object from the queue
                        System.out.println(c+"Removed object from the Queue"+c);
                        System.out.println(yb+"CONTINENT  FAMILY         SPECIES                 COLOR"+yb);
                        System.out.print(yb+"........................................................"+yb+"\n");
                     
                      
                          System.out.println(((Lion)queue.getFirst()).continent +",  "+ 
                                           ((Lion)queue.getFirst()).family +  ",      "+
                                           ((Lion)queue.getFirst()).species +",   " +
                                           ((Lion)queue.getFirst()).color);
                                            queue.remove();
                                            
                        
                        System.out.println(yb+"........................................................"+yb);
                    break;
                    
                    
                case 4://Popping an object from the Stack
                        System.out.println(c+"Popped object from the Stack"+c);
                        System.out.println(yb+"CONTINENT  FAMILY         SPECIES                 COLOR"+yb);
                        System.out.print(yb+"........................................................"+yb+"\n");
                     
                      
                          System.out.println(((Lion)queue.getFirst()).continent +",  "+ 
                                           ((Lion)queue.getFirst()).family +  ",      "+
                                           ((Lion)queue.getFirst()).species +",   " +
                                           ((Lion)queue.getFirst()).color);
                                            stck.pop();
                                            
                        
                        System.out.println(yb+"........................................................"+yb);
                    
                    break; 
                    
                case 5://Queue after Removing an object
                        System.out.println(c+"Queue after Removing  an object"+c);
                        System.out.println(yb+"CONTINENT  FAMILY         SPECIES                 COLOR"+yb);
                        System.out.print(yb+"........................................................"+yb+"\n");
                        for (int i =queue.size()-1; i >= 0; i--) 
                        {
                          System.out.println(((Lion)queue.get(i)).continent +",  "+ 
                                           ((Lion)queue.get(i)).family +  ",      "+
                                           ((Lion)queue.get(i)).species +",   " +
                                           ((Lion)queue.get(i)).color);
                                            queue.get(i);
                        }
                        System.out.println(yb+"........................................................"+yb);
                    
                    break;
                case 6://Stack after Popping an object  
                      System.out.println(c+"Stack after popping an object"+c);
                      System.out.println(yb+"CONTINENT  FAMILY         SPECIES                 COLOR"+yb);
                      System.out.print(yb+"........................................................"+yb+"\n");
                      for (int i =stck.size()-1; i >= 0; i--) 
                      {
                       
                        System.out.println(((Lion)stck.get(i)).continent +",  "+ 
                                          ((Lion)stck.get(i)).family +  ",      "+
                                          ((Lion)stck.get(i)).species +",   " +
                                          ((Lion)stck.get(i)).color);
                                          stck.get(i);
                      }        
                     System.out.println(yb+"........................................................"+yb);
                    break;
                default:
                    System.out.println(R+"INVALID SELECTION!! Please select a number from 1 to 6"+R);
               }
         } while (choice != 6);

    }
    
    
    
}
