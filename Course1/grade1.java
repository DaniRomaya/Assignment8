public class grade1 implements GPATotal {
    protected static String Grade1;

    grade1(){
        Grade1="F";
    }

    grade1(String grade1){
        String Grade1=grade1;
    }

    public static void inputtedLetter(String courseGrade){
        System.out.println("The letter you have inputted is: "+ courseGrade );
    }
    

    private static boolean inputtedLetter(){
        System.out.println("Is it a letter grade? ");
        if (Grade1 != " "){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void GPA() {
        
    }

}
