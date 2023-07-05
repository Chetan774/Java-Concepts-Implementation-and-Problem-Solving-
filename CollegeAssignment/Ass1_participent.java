package com.company.CollegeAssignment;

public class Ass1_participent {

    public static void main(String[] args) {
        Ass1_participent s1 = new Ass1_participent("Chetan", 123456, "IT");
        Ass1_participent s2 = new Ass1_participent("kamlesh", 126456, "IT");
        Ass1_participent s3 = new Ass1_participent("prajwal", 1264567, "cs");
        System.out.println("hey " + s1.getname() + " your registration id is " + s1.getRegistrationId());
        System.out.println("hey " + s2.getname() + " your registration id is " + s2.getRegistrationId());
        System.out.println("hey " + s3.getname() + " your registration id is " + s3.getRegistrationId());
    }

    static int counter;
    String registrationId;
    String name;
    long contactNumber;
    String branch;

    static {
        counter = 1001;
    }

    Ass1_participent(String name, long contactNumber, String branch) {
        this.registrationId = "D" + counter;
        this.name = name;
        this.contactNumber = contactNumber;
        this.branch = branch;
        counter++;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getname() {
        return name;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int getCounter() {
        return counter;
    }

    public String getRegistrationId() {
        return registrationId;
    }

}
