import java.util.Scanner;

public class Earnings{
    public static void main(String[] args){
        int main_wage = 200;
        int gross_sales;
        int Earnings1;
        
        System.out.println("Input the gross sales for the week in $:");
        
        Scanner input = new Scanner (System.in);
        gross_sales = input.nextInt();

        if (gross_sales >= 5000 && gross_sales <= 9000)
        {
            Earnings1 = main_wage + 250;
            System.out.println("The total wage is $" + Earnings1);
        } else if (gross_sales >= 9000) {
            Earnings1 = main_wage + 810;
            System.out.println("The total wage is $" + Earnings1);

        } else if (gross_sales < 5000 ) {
            System.out.println("The total wage is $" + main_wage);   
        } 
        input.close();
    }
}
