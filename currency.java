package converter;
public class currency{
 public void inrtodollar(float x){
  double y=x*0.012;
  System.out.println("It is "+y+" in dollars");
 }
 public void dollartoinr(float x){
  double y=x/0.012;
  System.out.println("It is "+y+" in rupees");
 }
 public void inrtopound(float x){
  double y=x*0.0095;
  System.out.println("It is "+y+" in pounds");
 }
 public void poundtoinr(float x){
  double y=x/0.0095;
  System.out.println("It is "+y+" in rupees");
 }
 public void inrtoeuro(float x){
  double y=x*0.011;
  System.out.println("It is "+y+" in euros");
 }
 public void eurotoinr(float x){
  double y=x/0.011;
  System.out.println("It is "+y+" in rupees");
 }
 public void inrtoyen(float x){
  double y=x*1.77;
  System.out.println("It is "+y+" in yen");
 }
 public void yentoinr(float x){
  double y=x/1.77;
  System.out.println("It is "+y+" in rupees");
 }
}