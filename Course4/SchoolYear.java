final class SchoolYear {
    protected int year;

    SchoolYear(){
        year=0;
    }

    SchoolYear(int year1){
        year=year1;
    }

    private static void yearInputted(){
        System.out.println("The year you have inputted is: ");
    }

    public static void yearInputted(int year1){
        System.out.println(year1);
    }
}
