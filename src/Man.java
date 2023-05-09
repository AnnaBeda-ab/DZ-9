public class Man extends Person {
    public Man(String firstName, String lastName, int age, boolean partner) {
        super(firstName, lastName, age, partner);
    }

    @Override
    public boolean isRetired() {
        if (getAge() > 65) {
            return true;
        }
        {
            return false;
        }
    }
}
