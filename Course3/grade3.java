public class grade3 implements CreditTotal{
    protected static String Grade3;

    grade3(){
       String Grade3="F";
    }

    grade3(String grade3){
        Grade3=grade3;
    }

    public static void inputtedLetter2(String grade3){
        System.out.println("The letter you have inputted is: "+ grade3 );
    }
    

    private static boolean inputtedLetter2(){
        System.out.println("Is it a letter grade? ");
        if (Grade3 != " "){
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
