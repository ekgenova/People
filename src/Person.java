public class Person {

    /*Variables used to define a Person*/
    private String name;
    private int age;
    private String occupation;

    /*Person class constructor*/

    public Person(String name, int age, String occupation){
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }

    /*Getters for : NAME, AGE, OCCUPATION*/
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getOccupation() {
        return occupation;
    }


    /*Setters for : NAME, AGE, OCCUPATION*/
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    /*toString method override to format Person string how we want to*/
    public String toString(){
        return "Name: " + this.name + " | Age: " + this.age + " | Job Title: " + this.occupation;
    }



}