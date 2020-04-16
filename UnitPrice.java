
/**
 * Write a description of class UnitPrice here.
 * 
 * @author (Andrew Wood) 
 * Team name: 1337-2.0    Phillip Coker, Weston Harmon, Timothy Chacko
 * @version (1/26/17)
 */
public class UnitPrice
{
 private double price;
 private double pound;
 private double ounce;
 private double pricePerPound;
 private double pricePerOunce;
 private final int OUNCE_PER_POUND = 16;
 
 public UnitPrice()
 {
    pound = ounce = price = pricePerPound = pricePerOunce = 0;
 }
 public UnitPrice( double inPrice, double inWeight, char scale)
 {
     price = inPrice;
     if (scale == 'p')
     {
         pound = inWeight;
         ounce = inWeight * OUNCE_PER_POUND;
     }
        else
        {
            ounce = inWeight;
            pound =  inWeight/ OUNCE_PER_POUND;
        }
        pricePerPound = price/pound;
        pricePerOunce = price/ounce;
 }
    
    
}
