/**
 * Created by Yury Berzin 14.01.2018
 */
public class Visokos_8 {
    public static void main(String[] args){
        int year = 2000;

        if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) {
            System.out.println("It`s a leap year."); //И еще инглиша.
        } else {
            System.out.println("It`s not a leap year.");
        }
    }
}
