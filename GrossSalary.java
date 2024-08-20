class GrossSalary 
{
  public static void main(String[] args) 
  {
    double basicSalary = 25000;
    double hraPercentage= 20;
    double daPercentage = 40;  
    double hra = (hraPercentage / 100) *25000;
    double da = (daPercentage / 100) *25000;
    double grossSalary = basicSalary + hra + da;
    System.out.println("Basic Salary: " + basicSalary);
    System.out.println("HRA: " + hra);
    System.out.println("DA: " + da);
    System.out.println("Gross Salary: " + grossSalary);
  }
}
