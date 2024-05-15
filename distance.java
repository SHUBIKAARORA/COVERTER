package converter;
public class distance{
 public void mtokm(float x){
  float y;
  y=x/1000;
  System.out.println("Distance in Km is:"+y);
 }
 public void kmtom(float x){
  float y;
  y=x*1000;
  System.out.println("Distance in m is:"+y);
 }
 public void milestokm(float x){
  double y;
  y=x*1.60934;
  System.out.println("Distance in Km is:"+y);
 }
 public void kmtomiles(float x){
  double y;
  y=x/1.60934;
  System.out.println("Distance in Miles is:"+y);
 }
}