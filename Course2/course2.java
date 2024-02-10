public class course2 extends grade2 {
    protected String course2Name;

    course2(){
        String course2Name="No name";
    }

    course2(String Course2Name){
        String course2Name= Course2Name;
    }

    public static void inputtedLetter1(String courseGrade){
        System.out.println("What is the letter grade for this course? ");
    }

    public static void Course2(){
        System.out.print("Please input the course name: ");
    }

    private static void Course2(String course2Name){ 
        System.out.println("The course name you have entered is: " + course2Name);
    }
}
