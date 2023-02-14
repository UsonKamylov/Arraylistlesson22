public class Student extends Exsepsion {
    private String name;
    private int age;

    public Student(String name, int age){

        this.name = name;
        if (age<0) {
            throw new Exsepsion("on san beriniz");
        }
        this.age=age;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {


        return age;
    }

    public void setAge(int age) throws Exception{
        if (getAge()<0){
            throw new Exsepsion("on san beriniz");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
