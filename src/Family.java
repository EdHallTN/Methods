/**
 * Created by EdHall on 8/29/16.
 * Manages my family tree.
 */
public class Family {

    private String name;
    private int age;
    private String gender;
    private String birthplace;

    public Family (String name, int age, String gender, String birthplace) {

        this.name = name;
        this.age = age;
        this.gender = gender;
        this.birthplace = birthplace;

    }


       public String getname() {
          return name;
       }
        public void setname(String name) {
           this.name = name;
       }

       public int getage() {
           return age;
       }
        public void setage(int age) {
            if(age < 100) {
                this.age = age;
            }
       }

       public String getgender() {
           return gender;
       }
       public void setgender(String gender) {
           this.gender = gender;
       }

        public String getbirthplace() {
           return birthplace;
        }
        public void setbirthplace(String birthplace) {
            this.birthplace = birthplace;
        }




}
