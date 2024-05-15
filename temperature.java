package converter;
public class temperature{
 public void ftocelcius(float fahrenheit){
  float celcius;
  celcius=(fahrenheit-32)*(5/9);
  System.out.print("TEMPERATURE IN CELCIUS:");
  System.out.println(celcius);
 }
 public void ctofahrenheit(float celcius){
  float fahrenheit;
  fahrenheit=celcius*(9/5)+32;
  System.out.print("TEMPERATURE IN FAHRENHEIT:");
  System.out.println(fahrenheit);
 }
 public void ctokelvin(float celcius){
 double kelvin;
 kelvin=celcius+273.15;
 System.out.print("TEMPERATURE IN KELVIN:");
 System.out.println(kelvin);
 }
 public void ktocelcius(float kelvin){
 double celcius;
 celcius=kelvin-273.15;
 System.out.print("TEMPERATURE IN CELCIUS:");
 System.out.println(celcius);
 }
 public void ftokelvin(float fahrenheit){
 double kelvin;
 kelvin=(fahrenheit-32)*(5/9)+273.15;
 System.out.print("TEMPERATURE IN KELVIN:");
 System.out.println(kelvin);
 }
 public void ktofahrenheit(float kelvin){
  double fahrenheit;
  fahrenheit=1.8*(kelvin-273.15)+32;
  System.out.print("TEMPERATURE IN FAHRENHEIT:");
  System.out.println(fahrenheit);
 }
}