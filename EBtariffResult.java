package EBTariffBill;
import java.util.*;
import java.io.*;
class EBTariffResult
{
    public static void main(String args[])
    {
        String continu;
        do{
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter Consumer Units : ");
            double consumerunits=scan.nextDouble();
            EBTariff obj=new EBTariff();
            if(consumerunits>=0)
            {
                System.out.println("The Total cost : "+obj.calculateTariff(consumerunits));
            }
            else
            {
                System.out.println("Enter The valid Units");
            }
            System.out.println("Do you want to Calculate Again ? type (yes or no)");
            continu=scan.next().toUpperCase();
        }while(continu.equals("YES"));
    }
}