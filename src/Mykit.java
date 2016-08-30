/**
 * Created by EdHall on 8/29/16.
 * Manage my drum kit configurations.
 */
public class Mykit {

    private String brand;
    private int totalDrums;
    private int totalCymbals;
    private String color;

    public Mykit (String brand, int totalDrums, int totalcymbals, String color) {

     this.brand = brand;
     this.totalDrums = totalDrums;
     this.totalCymbals = totalcymbals;
     this.color = color;


 }
        public String getbrand() {
            return brand;
        }
        public void setbrand(String brand) {
            this.brand = brand;
        }

         public int gettotalDrums() {
             return totalDrums;
         }
         public void settotalDrums(int totalDrums) {
             this.totalDrums = totalDrums;
         }

         public int gettotalCymbals() {
             return totalCymbals;
         }
         public void settotalCymbals(int totalCymbals) {
             this.totalCymbals = totalCymbals;
         }

         public String getcolor() {
             return color;
         }
          public void setcolor(String color) {
              if(color.contains("red") || color.contains("blue") || color.contains("yellow")) {
                  this.color = color;
              }
          }




}
