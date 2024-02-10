public class course4 extends grade4{
    protected String course4Name;

    course4(){
        course4Name="No name";
    }

    course4(String Course4Name){
        course4Name=Course4Name;
    }

    public static void inputtedLetter2(String Course4Name){
        System.out.println("What is the letter grade for this course? ");
    }

    public static void Course4(){
        System.out.print("Please input the course name: ");
    }

    private static void Course4(String Course4Name){ 
        System.out.println("The course name you have entered is: " + Course4Name);
    }
}