
package src;



import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Calc {

  @WebMethod(operationName="add")
  public String addTwo(String aStr, String bStr){
    double num1= Double.valueOf(aStr);
    double num2= Double.valueOf(bStr);
    return Double.toString(num1+num2);
  }
  
  @WebMethod(operationName="subtract")
  public String subtractTwo(String aStr, String bStr){
    double num1= Double.valueOf(aStr);
    double num2= Double.valueOf(bStr);
    return Double.toString(num1-num2);
  }
  
}