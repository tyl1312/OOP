import java.util.Arrays;
import java.util.Scanner;

public class Day{
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        
        String[] Month = {
            "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December",
            "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec",
            "Jan.", "Feb.", "Mar.", "Apr.", "May", "June", "July", "Aug.", "Sep.", "Oct.", "Nov.", "Dec.",
            "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"
        };
        String strMonth = "";
        int year = 0;

        while(!Arrays.asList(Month).contains(strMonth)){
            System.out.print("Nhap thang: ");
            strMonth = cin.nextLine();
        }

        while(year <= 0){
            System.out.print("Nhap nam: ");
            year = cin.nextInt();
        }

        int monthNum = (Arrays.asList(Month).indexOf(strMonth)) % 12 + 1;

        cin.close(); 
        
        System.out.println(getDay(year, monthNum));
    }

    private static int getDay(int year, int month){
        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12: return 31;
            case 4: case 6: case 9: case 11: return 30;
        }
        if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) return 29;
        else return 28;
    }
}