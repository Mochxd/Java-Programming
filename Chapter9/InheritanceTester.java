package Chapter9;

public class InheritanceTester {
    public static void main(String[] args) {
        Emloyee em = new Emloyee();
        Mother mom = new Mother();
        mom.setName("Eman");
        System.out.println(mom.getName() + " is " + mom.getGender());
    }

}