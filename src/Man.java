public class Man extends Person {
    public Man(String firstName, String lastName, int age, boolean partner) {
        super(firstName, lastName, age, partner);
    }

    @Override
    public boolean isRetired() {
        return getAge() > 65;
    }

    @Override
    public void registerPartner(String lastNameOfHusband) {

    }

    @Override
    public void deregisterPartnership(boolean ifChange) {

    }
}
