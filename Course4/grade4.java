public class grade4 implements GPATotal{
    protected static String Grade4;

    grade4(){
       String Grade4="F";
    }

    grade4(String grade4){
        Grade4=grade4;
    }

    public static void inputtedLetter3(String grade4){
        System.out.println("The letter you have inputted is: "+ grade4 );
    }
    

    private static boolean inputtedLetter3(){
        System.out.println("Is it a letter grade? ");
        if (Grade4 != " "){
            return true;
        }
        else{
            return false;
        }
    }

    
    public void creditTotal() {
        
    }

   
    public void GPA() {
        
    }
}
