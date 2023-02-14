import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        try {
            Student student=new Student("Aibek",17);
            Student student2=new Student("Asan",24);
            Student student3=new Student("Bakyt",22);
            Student student4=new Student("Uson",23);

            ArrayList<Student> arrayList=new ArrayList<>();
            arrayList.add(student);
            arrayList.add(student2);
            arrayList.add(student3);
            arrayList.add(student4);
            System.out.println(arrayList.get(2));

        } catch (Exsepsion e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("oilonup anan jash beruu kerek");
        }




    }
}