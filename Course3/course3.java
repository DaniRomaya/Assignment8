public class course3 extends grade3 {
    protected String course3Name;

    course3(){
        course3Name="No name";
    }

    course3(String Course3Name){
        course3Name=Course3Name;

    }

    public static void inputtedLetter2(String grade3){       
        System.out.println("What is the letter grade for this course? ");
    }

    public static void Course3(){
        System.out.print("Please input the course name: ");
    }

    private static void Course3(String Course3Name){ 
        System.out.println("The course name you have entered is: " + Course3Name);
    }
}
