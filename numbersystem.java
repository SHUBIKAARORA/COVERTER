package converter;
public class numbersystem{
 public int decimaltobinary(int decimal){
  int binaryvalue=0;
  int i=1;
  while(decimal>0){
   binaryvalue+=(decimal%2)*i;
   decimal=decimal/2;
   i*=10;
  }
  return binaryvalue;
 }
 public int octaltodecimal(int octal){
  int decimalvalue=0;
  int i=1;
  while(octal!=0){
   decimalvalue+=(octal%10)*Math.pow(8,i);
   i++;
   octal=octal/10;
  }
 return decimalvalue;
 }
 public int octaltobinary(int octal){
  int decimal=octaltodecimal(octal);
  int binary=decimaltobinary(decimal);
  return binary; 
 }
 public int hexadecimaltodecimal(String hex){
  hex=hex.toUpperCase();
  int decimal=0;
  int d;
  int len=hex.length();
  for (int i=0;i<len;i++){
   char ch=hex.charAt(i);
   if (Character.isDigit(ch)==false && ((int)ch<65 && (int)ch>70)){
    System.out.println("INVALID INPUT");
   }
   else if((int)ch>=65 && (int)ch<=70){
    d=(int)ch-55;
    decimal+=d*Math.pow(16,len-(i+1));
   }
  else{
   d=Integer.parseInt(String.valueOf(ch));
   decimal+=d*Math.pow(16,len-(i+1));
  }
 }
 return decimal;
 }
 public int hexadecimaltobinary(String hex){
  int decimal=hexadecimaltodecimal(hex);
  int binary=decimaltobinary(decimal);
  return binary;
 }
 public int binarytodecimal(String binary){
  int i=0;
  int decimal=0;
  int len=binary.length();
  for(i=0;i<len;i++){
   char ch=binary.charAt(i);
   int d=Integer.parseInt(String.valueOf(ch));
   decimal+=d*Math.pow(2,len-(i+1)); 
  }
  return decimal;
 }
 public String decimaltooctal(int decimal){
  String octal="";
  String d="";
  while (decimal!=0){
   d+=decimal%8;
   decimal=decimal/8;
  }
  for (int i=d.length()-1;i>=0;i--){
   octal+=d.charAt(i);
  }
  return octal; 
 }
 public String binarytooctal(String binary){
  int decimal=binarytodecimal(binary);
  String octal=decimaltooctal(decimal);
  return octal;
 }
 public String hexadecimaltooctal(String hex){
  int decimal=hexadecimaltodecimal(hex);
  String octal=decimaltooctal(decimal);
  return octal;
 }
 public void decimaltohexadecimal(int decimal){
  int hex[]=new int[100];
  int i=0;
  while (decimal!=0){
   hex[i]=decimal%16;
   decimal=decimal/16;
   i++;
  }
  for (int j=i-1;j>=0;j--){
   if(hex[j]>9){
   System.out.print((char)(hex[j]+55));
  }
  else{
  System.out.print(hex[j]);
  }
  }
}
 public void octaltohexadecimal(int octal){
  int decimal=octaltodecimal(octal);
  decimaltohexadecimal(decimal);
 }
 public void binarytohexadecimal(String binary){
  int decimal=binarytodecimal(binary);
  decimaltohexadecimal(decimal);
}
}

 