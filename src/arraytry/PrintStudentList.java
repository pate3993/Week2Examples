package arraytry;

public class PrintStudentList {

    public static void main(String[] args) {
        Student [] list = new Student[3];
        Student s1 = new Student();
        s1.setName("Vandan");
        s1.setAge(20);
        Student s2 = new Student();
        s2.setName("Jinay");
        s2.setAge(18);
        Student s3 = new Student();
        s3.setName("Aum");
        s3.setAge(20);
        
        list[0]=s1;
        list[1]=s2;
        list[2]=s3;
        
        for(int i=0;i<list.length;i++){
            System.out.println(list[i].getName()+ " " +list[i].getAge());
        }
    }
    
}
