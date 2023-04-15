import java.util.*;
import java.io.*;

class randomNumber{
    Scanner sc = new Scanner(System.in);
	   int min = 1;  
       int max = 100; 
       int psc = 0;
       int msc = 0;
       int playernum,cnt=0,attempt=0;
       String pname;
       char ch;
       
       
       randomNumber(String name){
           pname = name;
       } 
       
    void score(){
      System.out.println("instructions");
      System.out.println("enter a number in between 0 to 100");
      System.out.println("If your number match with computers number then you will get a point");
      System.out.println("*****************************************************************************");
      System.out.println("--------------------");
      System.out.println(pname + "   machine");
      System.out.println("--------------------");
      System.out.println("  "+ psc + "       " + msc );
      System.out.println("--------------------");
    }

public final static void clrscr()  {
try{  
try  
{  
final String os = System.getProperty("os.name");  
if (os.contains("Windows"))  
{  
Runtime.getRuntime().exec("cls");  
}  
else  
{  
Runtime.getRuntime().exec("clear");  
}  
}  
catch (final Exception e)  
{  
new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
}  
}catch(final Exception es){
}
}

void random(){
   do{
    clrscr();
    score();
    attempt=0;
    cnt =0;
    int machinenum = (int)(Math.random()*(max-min+1)+min); 
    System.out.println("\ncomputer is ready with its number");
    while (attempt < 5){
      System.out.print(pname + " guess the number : ");
      playernum = sc.nextInt();   
      cnt ++;
      if(machinenum == playernum){
          System.out.println("Congratulations you got a point");
          psc= psc + 5- attempt ;
          System.out.println(pname + "you got " + (5-attempt) + "points");
          break;
      }
      else if (playernum <  machinenum){
              System.out.println("your number is small");
              System.out.println("\nyou have "+ (4-attempt) +" chances "); 
              attempt+=1;
          }
      else{
           System.out.println("your number is big");
           System.out.println("\nyou have "+ (4-attempt) +" chances ");
           attempt+=1; 
          }
     if(cnt == 5){
              System.out.println("\n TRY AGAIN");
              System.out.println("\nyou got 0 points");
              System.out.println("machine got 5 points");
              msc = msc +5;
              break;
          }
    }     
      System.out.println("\nmachine number is " + machinenum);
      System.out.print("\n do u want to play Y/N : ");
      ch = sc.next().charAt(0);
      }while(ch == 'Y');
      if(ch == 'N'){
         clrscr();
         score();
}
    }
}


public class randomNumberGuess{
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("instructions");
       System.out.println("enter a number in between 0 to 100");
       System.out.println("If your number match with computers number then you will get a point");
       System.out.println("***********************************************************************");
       System.out.print("enter your name :");
       String name = sc.nextLine();
       
	   randomNumber obj = new randomNumber(name);
	   obj.random();
	   
	  
	  
	}   
}  
	