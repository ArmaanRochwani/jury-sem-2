


import java.util.Random;
import java.util.Scanner;
class Pharmacy { // class
    String[] addMed = new String[50];
    int count = 0;
    public void addMedicine() {
        for (int i = 0; i < 50; i++) {
            System.out.println("enter medicine's name which you want to add");
            Scanner sc = new Scanner(System.in);
            String medName = sc.nextLine();
            addMed[i] = medName;
            i++;
            count++;
            System.out.println("do you want to add again if yes then type 1 and if no then type 0");
            int choice = sc.nextInt();
            if (choice == 1) {
                continue;
            } else {
                System.out.println("Okay we understood that you don't want to add medicine ... Terminated");
                break;
            }
        }
        System.out.println();
        System.out.println("medicines added in an array are = ");
        for (String element : addMed) {
            if (element != null) {
                System.out.println(element);
            }
        }
    }
    public void removeMedicine() {
        System.out.println();
        System.out.println("Do you want to remove medicine if yes then enter 1 or if no then enter 0");
        Scanner sc = new Scanner(System.in);
        int rem = sc.nextInt();
        if (rem == 1) {
            System.out.println("Recently added medicine has been removed");
            System.out.println();
            for (int j = count; j > 0; j--) {
                break;
            }
            System.out.println("medicines in stock after removing recent one are = ");
            for (int y = 0; y < count; y++) {
                System.out.println(addMed[y]);
            }
        }
        else
            return;
    }
    public void updateStockLevel() {
        System.out.println("Stock has now been updated!!!");
    }
}
class Admin extends Pharmacy { // class
    Random rnd = new Random();
    String[] details = new String[50];
    public void addPatientRecord() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Name of the patient");
        details[0] = scanner.nextLine();
        System.out.println("Enter the Blood group of a patient in words");
        details[1] = scanner.nextLine();
        System.out.println("Enter the Age of a patient in words");
        details[2] = scanner.nextLine();
        System.out.println("<----Your details has been recorded---->");
        System.out.println("If you want to update your information press 1 or if you don't want to so press 0");
        int upInf = scanner.nextInt();
        if (upInf == 1){
            updatePatientInformation();
        }
        else
            return;
    }
    public void updatePatientInformation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("fill again the details to update the information");
        System.out.println("Enter the Name of the patient");
        details[0] = scanner.nextLine();
        System.out.println("Enter the Blood group of a patient in words");
        details[1] = scanner.nextLine();
        System.out.println("Enter the Age of a patient in words");
        details[2] = scanner.nextLine();
        System.out.println("your information has been updated");
        System.out.println("wanna schedule your appointment? If yes press 1 if No then press 0");
        int scApp = scanner.nextInt();
        if (scApp == 1){
            scheduleAppointment();
        }
        else
            return;
    }
    public void scheduleAppointment() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter appointment's time and date");
        System.out.println("enter appointment's date");
        String date = sc.nextLine();
        System.out.println("enter appointment's time");
        char time = sc.next().charAt(1);
        System.out.println("Appointment scheduled on : " + date + ":" + time);
        System.out.println();
        allocateWard();
    }
    public void allocateWard() {
        int A = 10, B = 5, C = 7, D = 11, E = 12, F = 3, G = 10, H = 2, I = 3, J =
                2;
        System.out.println("Total wards available : 10");
        System.out.println("Ward no. 1 : A");
        System.out.println("Ward no. 2 : B");
        System.out.println("Ward no. 3 : C");
        System.out.println("Ward no. 4 : D");
        System.out.println("Ward no. 5 : E");
        System.out.println("Ward no. 6 : F");
        System.out.println("Ward no. 7 : G");
        System.out.println("Ward no. 8 : H");
        System.out.println("Ward no. 9 : I");
        System.out.println("Ward no. 10 : J");
        char wardAllocated = (char) ('A' + rnd.nextInt(10));
        System.out.println("your allocated ward is : " + wardAllocated);
        if (wardAllocated == 'A'){
            System.out.println("Total capacity in " + wardAllocated + " is : " +
                    A );
            System.out.print("Capacity of this ward is updated to : " );
            A--;
            System.out.println(A);
        } else if (wardAllocated == 'B'){
            System.out.println("Total capacity in " + wardAllocated + " is : " +
                    B );
            System.out.print("Capacity of this ward is updated to : ");
            B--;
            System.out.println(B);
        } else if (wardAllocated == 'C'){
            System.out.println("Total capacity in " + wardAllocated + " is : " +
                    C );
            System.out.print("Capacity of this ward is updated to : " );
            C--;
            System.out.println(C);
        } else if (wardAllocated == 'D'){
            System.out.println("Total capacity in " + wardAllocated + " is : " +
                    D );
            System.out.print("Capacity of this ward is updated to : ");
            D--;
            System.out.println(D);
        } else if (wardAllocated == 'E'){
            System.out.println("Total capacity in " + wardAllocated + " is : " +
                    E );
            System.out.print("Capacity of this ward is updated to : ");
            E--;
            System.out.println(E);
        } else if (wardAllocated == 'F'){
            System.out.println("Total capacity in " + wardAllocated + " is : " +
                    F );
            System.out.print("Capacity of this ward is updated to : " );
            F--;
            System.out.println(F);
        } else if (wardAllocated == 'G'){
            System.out.println("Total capacity in " + wardAllocated + " is : " +
                    G );
            System.out.print("Capacity of this ward is updated to : ");
            G--;
            System.out.println(G);
        } else if (wardAllocated == 'H'){
            System.out.println("Total capacity in " + wardAllocated + " is : " +
                    H );
            System.out.print("Capacity of this ward is updated to : ");
            H--;
            System.out.println(H);
        } else if (wardAllocated == 'I'){
            System.out.println("Total capacity in " + wardAllocated + "is : " +
                    I );
            System.out.print("Capacity of this ward is updated to : ");
            I--;
            System.out.println(I);
        } else {
            System.out.println("Total capacity in " + wardAllocated + "is : " +
                    J );
            System.out.print("Capacity of this ward is updated to : ");
            J--;
            System.out.println(J);
        }
    }
}
class Billing extends Admin { // class
    int []recordAmount = new int[10];
    int rA = 0;
    int count1 = 0;
    String[] items = new String[15];
    Scanner sc = new Scanner(System.in);
    Random rnd = new Random();
    public void generateBill() {
        for (int i = 0; i < 15; i++) {
            System.out.println("Enter the item's name you want to add:");
            String itemName = sc.nextLine();
            items[count1] = itemName;
            count1++;
            System.out.println("Do you want to add another item? Type 1 for yes, 0 for no:");
            int choice1 = sc.nextInt();
            sc.nextLine();
            if (choice1 == 0) {
                break;
            }
        }
        System.out.println("Generating bill:");
        int sum = 0;
        for (String item : items) {
            if (item != null) {
                int rand_int1 = rnd.nextInt(100);
                System.out.println("Item's name: " + item + ", Item's price: " +
                        rand_int1);
                sum = sum + rand_int1;
            }
        }
        System.out.println("Total bill/price generated: " + sum);
        recordAmount[rA] = sum;
        rA++;
        System.out.println();
        recordPayment();
    }
    public void recordPayment() {
        System.out.println("Recorded payments:");
        for (int i = 0; i < rA; i++) {
            System.out.println("Payment " + (i + 1) + ": " + recordAmount[i]);
        }
    }
}
abstract class ResearchAndDevelopment { // class
    Scanner sc = new Scanner(System.in);
    Scanner scanner = new Scanner(System.in);
    abstract public void rapidTest(); // abstract method
    public void conductCovidTests() {
// Scanner sc = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        System.out.println("PCR test will be held ");
        System.out.println("Enter your Name.");
        String name1 = sc.nextLine();
        System.out.println("Enter your Mobile number.");
        String mobileNo = sc.nextLine();
        System.out.println("Enter your age.");
        String age = scanner.nextLine();
        System.out.println("Your Details : \n" + "Your name : " + name1 + "\n" +
                "Your mobile : " + mobileNo + "\n" + "Your Age : " + age);
        System.out.println("*");
        System.out.println("* Registration Successful *");
        System.out.println("*");
    }
    public void analyzeSymptoms() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Check for your symptoms : ");
        System.out.println("1: FEVER AND COLD COUGH");
        System.out.println("2: DIFFICULTY IN BREATH");
        System.out.println("3: BOTH 1 AND 2");
        System.out.println("4: HEADACHE");
        System.out.println("Enter the specific number on which your symptoms present");
        int symptoms = sc.nextInt();
        if (symptoms == 1 || symptoms == 2){
            rapidTest();
        } else if (symptoms == 3) {
            conductCovidTests();
        } else if (symptoms == 4) {
            System.out.println("Go and purchase PARACETAMOL");
        } else
            System.out.println("Invalid input");
    }
    public void calculateRiskProbability() {
        Random rnd = new Random();
        int risk = rnd.nextInt(100);
        System.out.println("According to the checks risk of spread of virus : " +
                risk + "%");
    }
}
class ThirdPartyInsurance extends ResearchAndDevelopment { // class
    public void rapidTest(){ // abstract method implemented here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please answer the following questions with 'yes' or 'no':");
        System.out.print("Do you have fever? ");
        String feverInput = scanner.nextLine();
        System.out.print("Do you have cough? ");
        String coughInput = scanner.nextLine();
        System.out.print("Do you have difficulty breathing? ");
        String breathingInput = scanner.nextLine();
        boolean hasFever = feverInput.equals("yes");
        boolean hasCough = coughInput.equals("yes");
        boolean hasBreathingDifficulty = breathingInput.equals("yes");
        if (hasFever || hasCough || hasBreathingDifficulty) {
            System.out.println("You are advised to get tested for COVID-19 as soon as possible.");
        } else {
            System.out.println("Your symptoms do not indicate COVID-19, but continue to check your health regularly");
        }
        System.out.println("Do you want to check the probability of the virus to spread");
        System.out.println("1 for YES || 0 for NO");
        int probability = sc.nextInt();
        if (probability==1){
            calculateRiskProbability();
        }
        else
            return;
    }
    public void processInsuranceClaims() {
        verifyInsurance();
        System.out.println("If your I'D gets approved then enter 1 or your I'D gets rejected then enter 0");
        int ver = sc.nextInt();
        try {
            if (ver == 1) {
                System.out.println("your insurance got claimed");
            } else if (ver == 0) {
                System.out.println("your insurance claiming process got terminated because of your I'd got rejected");
            } else
                System.out.println("Invalid input");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void verifyInsurance() {
        System.out.println("to check your insurance I'D, Enter your I'D");
        Scanner sc = new Scanner(System.in);
        String iD = sc.nextLine();
        Random random = new Random();
        boolean isIdApproved = random.nextBoolean();
        if (isIdApproved) {
            System.out.println("Your has been approved.");
            amountClaimed();
        } else {
            System.out.println("Your has been rejected.");
        }
    }
    public void amountClaimed() {
        Random rd = new Random();
        int amtClaimed = rd.nextInt(50000);
        System.out.println("amount as insurance : " + amtClaimed);
    }
}
public class projectOopsmain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;
        while (continueLoop) {
            System.out.println("Which class do you want to access? Enter it's sequential number");
            System.out.println("1. Pharmacy");
            System.out.println("2. Admin");
            System.out.println("3. Billing");
            System.out.println("4. ResearchAndDevelopment");
            System.out.println("5. ThirdPartyInsurance");
            System.out.println("6. Exit");
            System.out.println("<----Enter Here---->");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Pharmacy pharmacy = new Pharmacy();
                    pharmacy.addMedicine();
                    pharmacy.removeMedicine();
                    pharmacy.updateStockLevel();
                    break;
                case 2:
                    Admin admin = new Admin();
                    admin.addPatientRecord();
                    break;
                case 3:
                    Billing billing = new Billing();
                    billing.generateBill();
                    break;
                case 4:
                    ThirdPartyInsurance tpi = new ThirdPartyInsurance();
                    tpi.analyzeSymptoms();
                    break;
                case 5:
                    ThirdPartyInsurance tpi12 = new ThirdPartyInsurance();
                    tpi12.processInsuranceClaims();
                    break;
                case 6:
                    continueLoop = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
            if (continueLoop) {
                System.out.println();
                System.out.println("Do you want to access another class?");
                System.out.println("1. Yes");
                System.out.println("2. No, exit");
                int option = scanner.nextInt();
                if (option == 2) {
                    continueLoop = false;
                }
            }
        }
    }
}
