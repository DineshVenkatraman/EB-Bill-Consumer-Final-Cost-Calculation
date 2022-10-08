package EBTariffBill;//Low Tension Supply Category  #I-A- Tariff ==>Consumer FinalCost Calculation:
import java.util.*;
import java.io.*;
class EBTariff
{
    public double calculateTariff(double Units)
    {
        double FixedCharge=0;  // upto 100 Units 0.0Rs charge --100 units free scheme
        double TotalCost=0;   // upto 100 Units 0.0Rs cost --100 units free scheme

        double UnitchargeC2101to200=1.50;
        double UnitchargeC3101to200=2.00;
        double UnitchargeC4101to200=3.50;

        double UnitchargeC3201to500=3.00;
        double UnitchargeC4201to500=4.60;

        double UnitchargeC4upto500=6.60;


        if(Units>=0 && Units <=100)
        {
            TotalCost=0;
        }
        else if(Units>100 && Units<=200)
        {
            FixedCharge=20;
            //--- EB calcuation manual
            //(100*unitcharge)+((unitconsumed-100)*unitchargec2)+fixedcharge

            TotalCost=(100*0)+((Units-100)*UnitchargeC2101to200)+FixedCharge;
        }
        else if(Units>200 && Units<=500)
        {
            FixedCharge=30;
            // --- EB calcuation manual
            //(100*unitcharge)+(100*unitchargec3)+((unitconsumed-200)*unitcharge3)+fixedcharge

            TotalCost=(100*0)+(100*UnitchargeC3101to200)+((Units-200)*UnitchargeC3201to500)+FixedCharge;

        }
        else if(Units>500)
        {
            FixedCharge=50;
            //--- EB calcuation manual
            //(100*unitcharge)+(100*unitchargec4)+(300*unitchargec4)+((unitconsumed-500)*unitcharge4)+fixedcharge

            TotalCost=(100*0)+(100*UnitchargeC4101to200)+(300*UnitchargeC4201to500)+((Units-200)*UnitchargeC4upto500)+FixedCharge;

        }
        return TotalCost;
    }

}
