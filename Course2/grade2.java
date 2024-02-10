public class grade2 implements CreditTotal {
    protected static String Grade2;

    grade2(){
        Grade2="F";
    }

    grade2(String courseGrade){
        String Grade2=courseGrade;
    }

    public static void inputtedLetter1(String courseGrade){
        System.out.println("The letter you have inputted is: "+ courseGrade );
    }
    

        private static boolean inputtedLetter1(){
            System.out.println("Is it a letter grade? ");
            if (Grade2 != " "){
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
