public class Person {
    private String name;
    private int age;
    private String date_of_birth;
    private String contact;

    public Person(String name, int age, String date_of_birth, String contact) {
        this.name = name;
        this.age = age;
        this.date_of_birth = date_of_birth;
        this.contact = contact;
    }
    public Person() {}

    public void print(){
        System.out.printf("OWNER OF LAND%nName:%s%nAge:%d%nDOB:%s%nContact:%s", name, age, date_of_birth, contact);
    }


}
