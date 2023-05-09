public class Woman extends Person {

    public Woman(String firstName, String lastName, int age, boolean partner) {
        super(firstName, lastName, age,partner);
    }


    @Override
    public boolean isRetired() {
        if (getAge() > 60) {
            return true;
        }
        return false;
    }

}