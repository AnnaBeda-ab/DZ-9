public class Person {
   private String firstName;
   private String lastName;
   private int age;
   Boolean partner;
   protected Person (String firstName, String lastName,int age, boolean partner){
      this.firstName = firstName;
      this.lastName=lastName;
      this.age=age;
      this.partner = partner;
   }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setPartner (Person partner){
       partner=partner;
    }
    protected boolean isRetired (){
       return true;
    }
    public void registerPartner (String lastNameOfHusband){
        setLastName(lastNameOfHusband);
    }
    public void deregisterPartnership (boolean ifChange){ //тут не зовсім розібралася
        setLastName(getLastName());
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
