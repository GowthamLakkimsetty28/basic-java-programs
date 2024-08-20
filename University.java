class University
{
 public static void main(String[] args)
 {
  int marksA = 60;
  int marksB = 40;
  String result;
    if (marksA >= 55 && marksB >= 45) 
    {
     result = "Passed";
    }
    else if (marksA >= 45 && marksA < 55 && marksB >= 55) 
    {
    result = "Passed";
    } 
    else if (marksA >= 65 && marksB < 45) 
    {
    result = "Allowed to reappear in B";
    } 
    else{
            result = "Failed";
        }
        System.out.println("The student has " + result);
 }
}
