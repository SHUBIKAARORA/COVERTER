import java.util.Scanner;
import converter.temperature;
import converter.distance;
import converter.currency;
import converter.numbersystem;
public class conversion{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  int x,y,s,t,r;
  float z,g;
  String b,k;
  char ch;
  System.out.println("CONVERTER");
  do{
  System.out.println("1.TEMPERATURE\n2.DISTANCE\n3.NUMBER BASE\n4.CURRENCY");
  x=sc.nextInt();
  temperature temp=new temperature();
  distance d=new distance();
  currency c=new currency();
  numbersystem n=new numbersystem();
  switch(x){
   case 1:
     System.out.println("TEMPERATURE CONVERSION");
     System.out.println("1.FAHRENHEIT TO CELCIUS\n2.CELCIUS TO FAHRENHEIT\n3.KELVIN TO CELCIUS\n4.KELVIN TO FAHRENHEIT\n5.CELCIUS TO KELVIN\n6.FAHRENHEIT TO KELVIN\n");
     y=sc.nextInt();
     switch(y){
      case 1:
      System.out.println("Enter temperature in Fahrenheit:");
      z=sc.nextFloat();
      temp.ftocelcius(z);
      break;
      case 2:
      System.out.println("Enter temperature in Celcius:");
      z=sc.nextFloat();
      temp.ctofahrenheit(z);
      break;
      case 3:
      System.out.println("Enter temperature in Kelvin:");
      z=sc.nextFloat();
      temp.ktocelcius(z);
      break;
      case 4:
      System.out.println("Enter temperature in Kelvin:");
      z=sc.nextFloat();
      temp.ktofahrenheit(z);
      break;
      case 5:
      System.out.println("Enter temperature in Celcius:");
      z=sc.nextFloat();
      temp.ctokelvin(z);
      break;
      case 6:
      System.out.println("Enter temperature Fahrenheit:");
      z=sc.nextFloat();
      temp.ftokelvin(z);
      break;
     }
     break;
   case 2:
     System.out.println("DISTANCE CONVERSION");
     System.out.println("1.M to Km\n2.Km to m\n3.Miles to Km\n4.Km to Miles\n");
     y=sc.nextInt();
     switch(y){
      case 1:
        System.out.println("Enter distance in m:");
        z=sc.nextFloat();
        d.mtokm(z);
        break;
      case 2:
        System.out.println("Enter distance in km:");
        z=sc.nextFloat();
        d.kmtom(z);
        break;
      case 3:
        System.out.println("Enter distance in miles:");
        z=sc.nextFloat();
        d.milestokm(z);
        break;
      case 4:
        System.out.println("Enter distance in km:");
        z=sc.nextFloat();
        d.kmtomiles(z);
        break;      
     }
     break;
   case 3:
     System.out.println("NUMBER SYSTEM:");
     System.out.println("\n1.TO DECIMAL\n2.TO BINARY\n3.TO OCTAL\n4.TO HEXADECIMAL");
     y=sc.nextInt();
     switch(y){
      case 1:
       System.out.println("\n1.BINARY TO DECIMAL\n2.OCTAL TO DECIMAL\n3.HEXADECIMAL TO DECIMAL");
       s=sc.nextInt();
       switch(s){
        case 1:
         System.out.println("Enter any binary number");
         b=sc.nextLine();
         t=n.binarytodecimal(b);
         System.out.println("ITS DECIMAL EQUIVALENT IS:"+t);
	 break;
        case 2:
         System.out.println("Enter any octal number");
         r=sc.nextInt();
         t=n.octaltodecimal(r);
         System.out.println("ITS DECIMAL EQUIVALENT IS:"+t);
	 break;
        case 3:
         System.out.println("Enter any hexadecimal number");
         b=sc.nextLine();
         t=n.hexadecimaltodecimal(b);
         System.out.println("ITS DECIMAL EQUIVALENT IS:"+t);
	 break;
        }
        break;
      case 2:
       System.out.println("1.DECIMAL TO BINARY\n2.OCTAL TO BINARY\n3.HEXADECIMAL TO BINARY");
       s=sc.nextInt();
       switch(s){
        case 1:
         System.out.println("Enter any decimal number");
         r=sc.nextInt();
         t=n.decimaltobinary(r);
         System.out.println("ITS BINARY EQUIVALENT IS:"+t);
	 break;
        case 2:
         System.out.println("Enter any octal number");
         r=sc.nextInt();
         t=n.octaltobinary(r);
         System.out.println("ITS BINARY EQUIVALENT IS:"+t);
	 break;
        case 3:
         System.out.println("Enter any hexadecimal number");
         b=sc.nextLine();
         t=n.hexadecimaltobinary(b);
         System.out.println("ITS BINARY EQUIVALENT IS:"+t);
	 break;
        }
 	break;
      case 3:
       System.out.println("\n1.BINARY TO OCTAL\n2.DECIMAL TO OCTAL\n3.HEXADECIMAL TO OCTAL");
       s=sc.nextInt();
       switch(s){
        case 1:
         System.out.println("Enter any binary number");
         b=sc.nextLine();
         k=n.binarytooctal(b);
         System.out.println("ITS OCTAL EQUIVALENT IS:"+k);
	 break;
        case 2:
         System.out.println("Enter any decimal number");
         t=sc.nextInt();
         b=n.decimaltooctal(t);
         System.out.println("ITS OCTAL EQUIVALENT IS:"+b);
	 break;
        case 3:
         System.out.println("Enter any hexadecimal number");
         b=sc.nextLine();
         k=n.hexadecimaltooctal(b);
         System.out.println("ITS OCTAL EQUIVALENT IS:"+k);
	 break;
        }
	break;
      case 4:
       System.out.println("\n1.BINARY TO HEXADECIMAL\n2.DECIMAL TO HEXADECIMAL\n3.OCTAL TO HEXADECIMAL");
       s=sc.nextInt();
       switch(s){
        case 1:
         System.out.println("Enter any binary number");
         b=sc.nextLine();
         System.out.println("ITS HEXADECIMAL EQUIVALENT IS: ");
	 n.binarytohexadecimal(b);
	 break;
        case 2:
         System.out.println("Enter any decimal number");
         t=sc.nextInt();
         System.out.print("ITS HEXADECIMAL EQUIVALENT IS: ");
 	 n.decimaltohexadecimal(t);
	 break;
        case 3:
         System.out.println("Enter any octal number");
         t=sc.nextInt();
         System.out.println("ITS HEXADECIMAL EQUIVALENT IS: ");
	 n.octaltohexadecimal(t);
	 break;
        }
     break;
    }
    break;
   case 4:
     System.out.println("CURRENCY CONVERSION:");
     System.out.println("1.INR TO DOLLAR\n2.DOLLAR TO INR\n3.INR TO POUND\n4.POUND TO INR\n5.INR TO EURO\n6.EURO TO INR\n7.INR TO YEN\n8.YEN TO INR\n");
     y=sc.nextInt();
     switch(y){
      case 1:
       System.out.println("Enter amount in INR:");
       g=sc.nextFloat();
       c.inrtodollar(g);
       break;
      case 2:
       System.out.println("Enter amount in Dollars:");
       g=sc.nextFloat();
       c.dollartoinr(g);
       break;
      case 3:
       System.out.println("Enter amount in Rupees:");
       g=sc.nextFloat();
       c.inrtopound(g);
       break;
      case 4:
       System.out.println("Enter amount in Pounds:");
       g=sc.nextFloat();
       c.poundtoinr(g);
       break;
      case 5:
       System.out.println("Enter amount in Rupees:");
       g=sc.nextFloat();
       c.inrtoeuro(g);
       break;
      case 6:
       System.out.println("Enter amount in Euros:");
       g=sc.nextFloat();
       c.eurotoinr(g);
       break;
      case 7:
       System.out.println("Enter amount in Rupees:");
       g=sc.nextFloat();
       c.inrtoyen(g);
       break;
      case 8:
       System.out.println("Enter amount in Yen:");
       g=sc.nextFloat();
       c.yentoinr(g);
       break;
     }
     break;
     default:
      System.out.println("WRONG INPUT");
      break;
    }
   System.out.println("Do you wish to continue(yes/no)");
   ch=sc.next().charAt(0);
   }while(ch=='y'||ch=='Y');
 }
}