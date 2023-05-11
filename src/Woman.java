public class Woman extends Person {

    public Woman(String firstName, String lastName, int age, boolean partner) {
        super(firstName, lastName, age, partner);
    }


    @Override
    public boolean isRetired() {
        return getAge() > 60;
    }

    @Override
    public void registerPartner(String lastNameOfHusband) {
        setLastName(lastNameOfHusband);

    }

    @Override
    public void deregisterPartnership(boolean ifChange) {
        setLastName(getLastName());
    }




}