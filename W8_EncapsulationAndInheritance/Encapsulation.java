import com.java.p8.Student;
import com.java.p8.Teacher;

class Encapsulation {
    public static void main(String[ ] args) {
      Student murid_1 = new Student();
      // set attr
      murid_1.setName("John");
      murid_1.setAge(20);
      murid_1.setEntryYear(2020);
  
      System.out.println("Name\t\t: " + murid_1.getName());
      System.out.println("Age\t\t: " + murid_1.getAge());
      System.out.println("Graduation Year\t: " + murid_1.getGraduationYear());
      murid_1.task();


      System.out.println("");


      Teacher guru_1 = new Teacher();
      // set attr
      guru_1.setName("Jane");
      guru_1.setAge(50);

      System.out.println("Name\t\t: " + guru_1.getName());
      System.out.println("Age\t\t: " + guru_1.getAge());
      guru_1.task();









      // InheritStudent s = new InheritStudent();
      // s.task();

      // InheritTeacher t = new InheritTeacher();
      // t.task();


    }
  }

  // class InheritStudent extends Student {
  //   public InheritStudent(){
  //     System.out.println("Test Student");
  //   }
  // }

  // class InheritTeacher extends Teacher {
  //   public InheritTeacher(){
  //     System.out.println("Test Teacher");
  //   }
  // }