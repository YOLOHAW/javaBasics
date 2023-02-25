package javabasics;
import java.util.Scanner;
import javax.swing.JOptionPane;

import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("This is my first java program again");
        
        //variables
        int number=1;
        boolean achain=true;
        double number2=3.24;
        char alphabet='y';
        String name="Htet Aung Win";
        
        System.out.println(number+number2);
        System.out.println(achain);
        System.out.println("My name is "+name);
        
        //Swap two variables
        String x="water";
        String y="coffee";
        String temp;
        
        temp=x;
        x=y;
        y=temp;
        
        System.out.println(x);
        System.out.println(y);
        
        //UserInput
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("What is your name");
        String name1=scanner.nextLine();
        
        System.out.println("How old are you");
        int age1=scanner.nextInt();
        scanner.nextLine();
        
        
        System.out.println("What is your favourite sport");
        String sport=scanner.nextLine();
        
        
        System.out.println("Your name is "+name1);
        System.out.println("You are "+age1+" years old");
        System.out.println("Your favourite sport is "+sport);
        
          //expressions(operands and operators)
          int friends=11;
          friends++;
          System.out.println(friends);
          
//          //GUI intro with JoptionPane
//          
//          String name2=JOptionPane.showInputDialog("What is your name");
//          JOptionPane.showMessageDialog(null,"Your name is "+name2);
//	
//          String age2=JOptionPane.showInputDialog("How old are you dude");
//          JOptionPane.showMessageDialog(null,"You are "+age2+" years old");
//     
          
          //Math class max,min,abs,round,ceil,floor
          double a=7.7;
          double b=9.9;
          
          double z = Math.min(a, b);
          System.out.println(z);
          
          double c=3;
          double d=4;
          double e;
          
          e= Math.sqrt((c*c)+(d*d));
          System.out.println("The result of hypotenuse is "+e);
          
          //Random Numbers nextInt nextDouble nextBoolean
        	Random random=new Random();
        	int l=random.nextInt(6)+1;
        	
        	System.out.println(l);
        	
          //If statements
        	
        	String job="Programmer";
        	
        	if(job=="Nothing") {
        		System.out.println("Who are You?");
        	}else {
        		System.out.println("I wish you to become a professional programmer");
        	}
        	
         //Switch statements mutiple choice for an expression
        	String day="Tuesday";
        	
        	switch(day) {
        		case "Monday":
        			System.out.println("It is every worker nightmare");
        			break;
        		case "Tuesday":
        			System.out.println("I was born in this day for not giving up life");
        			break;
        		case "Friday":
        			System.out.println("It is every worker desire");
        			break;
        		default: System.out.println("It is not a day");
        	}
        	
        //Logical Operators && || !=
        Scanner scannerr=new Scanner(System.in);
        System.out.println("To quit the GAME, q or Q");
        String response=scannerr.nextLine();
        
        if(!response.equals("q") && !response.equals("Q")) {
        	System.out.println("You are still inside the game,Meow Meow");
        }else {
        	System.out.println("You are already quitted the game");
        }
        
        //while loop executes as long as condition true
        Scanner scan=new Scanner(System.in);
        String Name="";
        
        while(Name.isBlank()) {
        	System.out.println("Enter the name: ");
        	Name=scan.nextLine();
        }
        System.out.println("Hello "+Name);
        
        //for loop executes a block of code a limited amount of time
        
        for(int i=10;i>=0;i--) {
        	System.out.println(i);
        }
        System.out.println("Happy New Year!");
        
        //nested loops a loop inside a loop
        Scanner sca=new Scanner(System.in);
        int rows;
        int columns;
        String symbol=" ";
        
        System.out.println("Enter the rows: #");
        rows=sca.nextInt();
        
        System.out.println("Enter the columns: #");
        columns=sca.nextInt();
        
        System.out.println("Enter the symbol: #");
        symbol=sca.next();
        
        for(int i=1;i<=rows;i++) {
        	System.out.println();
        	for(int j=1;j<=columns;j++) {
        		System.out.print(symbol);
        	}
        }
      //arrays used to store multiple values in a single value
        
        String[] colors= {
        		"White","Blue","Yellow","Red"
        };
        colors[3]="Brown";
        System.out.println(colors[3]);
        
        String[] newcolors=new String[2];
        newcolors[0]="Black";
        newcolors[1]="Red";
        
        System.out.println(newcolors[0]);
        
        for(int t=0;t<colors.length;t++) {
        	System.out.println(colors[t]);
        }
        
       //2D arrays an array of arrays
        
        //String[][] players=new String[3][3];
       String[][] players= {
    		   {
    			   "Cristiano Ronaldo","Karim Benzema","Gareth Bale"
    		   },
    		   {
    			   "Mbappe","Neymar","Messi"
    		   },
    		   {
    			   "Haaland","Grealish","Mahrez"
    		   }
       };
       for(int v=0;v<players.length;v++) {
    	   System.out.println();
    	   for(int w=0;w<players[v].length;w++) {
    		   System.out.println(players[v][w]+" ");
    	   }
       }
       
       //String Methods refer data types have access to useful methods
       String namae="Cristiano Ronaldo";
       
       //boolean result=namae.equals("Not Trying"); //equalsIgnoreCase
       //char result=namae.charAt(10);
       //int result=namae.indexOf("d");
       //String result=namae.trim();\
       String result=namae.replace("Ronaldo", "Goalnaldo");
       System.out.println(result);
       
       //Wrapper class a way to primitive to refer //autoboxing primitive to ref //unboxing ref to primitive
       //Boolean,Character,Interger,Double
       
       //ArrayList resizable array add or remove store reference
       
       ArrayList<String> food=new ArrayList();
       food.add("Humburger");
       food.add("Pizza");
       food.add("Avocado");
       //food.set(0,"Chicken") food.remove food.clear
       
       for(int f=0;f<food.size();f++) {
    	   System.out.println(food.get(f));
       }
       
       //2D ArrayList a dynamic list of lists
       
       ArrayList<ArrayList<String>> groceryList=new ArrayList();
       
       ArrayList<String> bakery=new ArrayList();
       bakery.add("Fudo");
       bakery.add("SP");
       
       ArrayList<String> product=new ArrayList();
       product.add("Shoes");
       product.add("IT");
       
       ArrayList<String> drinks=new ArrayList();
       drinks.add("Milk");
       drinks.add("Full Moon");
       
       groceryList.add(bakery);
       groceryList.add(product);
       groceryList.add(drinks);
       
       System.out.println(groceryList);
       System.out.println(groceryList.get(2).get(0));
       
       //for-each loop iterate elements in array and collection(arraylist)
       
       ArrayList<String> animals=new ArrayList();
       animals.add("dog");
       animals.add("cat");
       
       for(String m:animals) {
    	   System.out.println(m);
       }
       
       //Method a block of code executed whatever it is called
       String namee="Cr7";
       int agee=38;
       
       Hello(namee,agee);
       
       int k=3;
       int o=4;
       System.out.println(add(k,o));
   }
	static void Hello(String namee,int agee) {
		System.out.println("Hello "+namee);
		System.out.println("You are "+agee+" years old");
		
	}
	static int add(int k,int o) {
		return k+o;
	}
}
