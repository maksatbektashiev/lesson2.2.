public class Main {
    public static void main(String[] args) {
        int student = 10;
        int tempirature = 15;
        boolean reini = true;

        if (tempirature > 5 && tempirature < 40) {
            System.out.println("go to work");
        }
        if (tempirature > 25 && student > 10) {
            System.out.println("go to work");
        }
        if (reini || tempirature < 13) {
            System.out.println("go to home ");

        }
        //HI SENSEI
         if (student > 20 || tempirature>5 &&tempirature<40)
    {
             System.out.println("go to park");
        }
    }
}