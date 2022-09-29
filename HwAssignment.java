import java.util.Scanner;
//rafa 
public class HwAssignment {
    
    public static float metricConverter(String sourceMetric, String targetMetric, float sourceNum){
        float targetNum = 0;
        switch (sourceMetric){
            case "km":
                switch (targetMetric) {
                    case "m":
                    targetNum = sourceNum * 1000;
                    break;
                    case "mi":
                    targetNum = sourceNum / (float) 1.6;
                    break;
                    
                }
            break;

            case "mm":
                switch (targetMetric) {
                    case "in":
                    targetNum = sourceNum * (float) 0.04;
                    break;
                    case "m":
                    targetNum = sourceNum / 1000;
                    break;
                    
                }
            break;

            case "kg":
                switch (targetMetric) {
                    case "lb":
                    targetNum = sourceNum * (float) 2.2;
                    break;
                    
                }
            break;

            case "g":
                switch (targetMetric) {
                    case "oz":
                    targetNum = sourceNum * (float) 0.35;
                    break;
                    
                }
            break;

            default:
                System.out.println("Your input is not currently handled by this app, please input another query, for example, 1 kg = lb");
            break;

        }
        System.out.printf("%.1f %s = %.2f %s%n", sourceNum, sourceMetric, targetNum, targetMetric);
        return targetNum;
    }
    public static void main(String[] args) {

        String str;
        String[] strArray;
        float sourceNum;
        String sourceMetric;
        String targetMetric;

        Scanner scanner = new Scanner(System.in);
        
        while (true) {

            System.out.println("Welcome to metric converter! \n");


            System.out.println("Please input your metric to be converted, for example, 1 kg = lb\n");

            

            System.out.println("Type exit if you want to leave the page.");
            str = scanner.nextLine();

            if (str.equals("exit")) {
                System.out.println("Thank you. Goodbye!");
                break;
            }

            strArray = str.split(" ");

            if (strArray.length != 4) {
                System.out.println("Your input is not currently handled by this app, please input another query, for example, 1 kg = lb");
                continue;
            }else {
                sourceNum = Float.parseFloat(strArray[0]);
                sourceMetric = strArray[1];
                targetMetric = strArray[3];
                metricConverter(sourceMetric, targetMetric, sourceNum);
                
            }

            break;
        }
        scanner.close();
    }
}
