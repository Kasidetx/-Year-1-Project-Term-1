import java.util.*;
public class BTS {

    static Scanner input = new Scanner(System.in);
    static ArrayList<String> Yellow = new ArrayList<String>();
    static ArrayList<String> Red = new ArrayList<String>();
    static ArrayList<String> Purple = new ArrayList<String>();

    public static void main(String[] args) {
        mainmenu();
    }
    public static void mainmenu(){
        while (true) {
        Yellow.clear();
        Red.clear();
        Purple.clear();
        System.out.println("Main Menu");
        System.out.println("1.สายสีเหลือง");
        System.out.println("2.สายสีแดง");
        System.out.println("3.สายสีม่วง");
        System.out.println("4.ออกโปรแกรมจ้าา");
        System.out.println("5.Clear :D");
        System.out.print("Enter Choice : ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:YellowLine();break;
            case 2:RedLine();break;
            case 3:PurpleLine();break;
            case 4: System.out.println("ขอบคุณที่ใช้โปรแกรมครับ");System.exit(0);
            case 5:clearConsole();break;
            default: System.out.println(choice+"ไม่มีอยู่ในฟังก์ชั่น");
            }
         }
    }
    public static void YellowLine(){
        Yellow.add("YL01 ลาดพร้าว");
        Yellow.add("YL02 ภาวนา");
        Yellow.add("YL03 โชคชัย 4");
        Yellow.add("YL04 ลาดพร้าว 71");
        Yellow.add("YL05 ลาดพร้าว 83");
        Yellow.add("YL06 มหาดไทย");
        Yellow.add("YL07 ลาดพร้าว 101");
        Yellow.add("YL08 บางกะปิ");
        Yellow.add("YL09 แยกลำสาลี");
        Yellow.add("YL10 ศรีกรีฑา");
        Yellow.add("YL11 หัวหมาก");
        Yellow.add("YL12 กลันตัน");
        Yellow.add("YL13 ศรีนุช");
        Yellow.add("YL14 ศรีนครินทร์ 38");
        Yellow.add("YL15 สวนหลวง ร.9");
        Yellow.add("YL16 ศรีอุดม");
        Yellow.add("YL17 ศรีเอี่ยม");
        Yellow.add("YL18 ศรีลาซาล");
        Yellow.add("YL19 ศรีแบริ่ง");
        Yellow.add("YL20 ศรีด่าน");
        Yellow.add("YL21 ศรีเทพา");
        Yellow.add("YL22 ทิพวัล");
        Yellow.add("YL23 สำโรง");
        for (int i = 0; i < Yellow.size(); i++) 
        {
            String station = Yellow.get(i);
            System.out.println("สถานีที่ " + (i + 1) + " : " + station);
        }
        CalculatorYellow();
        
    }
    public static void RedLine(){
        Red.add("RW6 ตลิ่งชัน");
        Red.add("RW5 บางบำหรุ");
        Red.add("RW2 บางซ่อน");
        Red.add("RW1/RN1 กลางกรุงเทพอภิวัฒน์ (สถานีกลางบางซื่อ)");
        Red.add("RN2 จตุจักร");
        Red.add("RN3 วัดเสมียนนารี");
        Red.add("RN4 บางเขน");
        Red.add("RN5 ทุ่งสองห้อง");
        Red.add("RN6 หลักสี่");
        Red.add("RN7 การเคหะ");
        Red.add("RN8 ดอนเมือง");
        Red.add("RN9 หลักหก");
        Red.add("RN10 รังสิต");
        for (int i = 0; i < Red.size(); i++) 
        {
            String station = Red.get(i);
            System.out.println("สถานีที่ " + (i + 1) + " : " + station);
        }
        CalculatorRed();
    }
    public static void PurpleLine(){
        Purple.add("PP01 สถานีคลองบางไผ่");
        Purple.add("PP02 สถานีตลาดบางใหญ่");
        Purple.add("PP03 สถานีสามแยกบางใหญ่");
        Purple.add("PP04 สถานีบางพลู");
        Purple.add("PP05 สถานีบางรักใหญ่");
        Purple.add("PP06 สถานีบางรักน้อยท่าอิฐ");
        Purple.add("PP07 สถานีไทรม้า");
        Purple.add("PP08 สถานีสะพานพระนั่งเกล้า");
        Purple.add("PP09 สถานีแยกนนทบุรี");
        Purple.add("PP10 สถานีบางกระสอ");
        Purple.add("PP11 สถานีศูนย์ราชการนนทบุรี");
        Purple.add("PP12 สถานีกระทรวงสาธารณสุข");
        Purple.add("PP13 สถานีแยกติวานนท์");
        Purple.add("PP14 สถานีวงศ์สว่าง");
        Purple.add("PP15 สถานีบางซ่อน");
        Purple.add("PP16 สถานีเตาปูน");
        for (int i = 0; i < Purple.size(); i++) 
        {
            String station = Purple.get(i);
            System.out.println("สถานีที่ " + (i + 1) + " : " + station);
        }
        CalculatorPurple();
    }
    public static void CalculatorYellow(){
        System.out.print("โปรดเลือกสถานีเริ่มต้น : ");
        int StartStation = input.nextInt() - 1;
        System.out.print("โปรดเลือกสถานีปลายทาง : ");
        int EndStation = input.nextInt() - 1;

        int numOfStations = Math.abs(EndStation - StartStation) + 1;
        int fare = 15;

            if (numOfStations > 3) {
                fare += Math.min((numOfStations) * 3, 30); // ไม่เกิน 30 บาทเพิ่ม
            } else if (numOfStations > 1) {
                fare += Math.min((numOfStations - 1) * 4, 30); // ไม่เกิน 30 บาทเพิ่ม
            }

            fare = Math.min(fare, 45); // ไม่เกิน 45 บาททั้งหมด

            System.out.println("ค่าโดยสารสุทธิ: " + fare + " บาท");
            mainmenu();
    }
    public static void CalculatorRed(){ // 20 บาทตลอดสาย
        int fare;
        System.out.print("โปรดเลือกสถานีเริ่มต้น : ");
        int StartStation = input.nextInt() - 1;
        System.out.print("โปรดเลือกสถานีปลายทาง : ");
        int EndStation = input.nextInt() - 1;
        if (StartStation > EndStation);
        {
        fare = 20;
        }
        System.out.println("ค่าโดยสารสุทธิ: " + fare + " บาท");
        mainmenu();
    }
    public static void CalculatorPurple(){
        System.out.print("โปรดเลือกสถานีเริ่มต้น : ");
        int StartStation = input.nextInt() - 1;
        System.out.print("โปรดเลือกสถานีปลายทาง : ");
        int EndStation = input.nextInt() - 1;

        int numOfStations = Math.abs(EndStation - StartStation) + 1;
        int fare = 0;
        if (numOfStations <= 2) {
             fare = 17;
        }
        else if(numOfStations > 2)
        {
             fare = 20;
        }
            System.out.println("ค่าโดยสารสุทธิ: " + fare + " บาท");
            mainmenu();
    }
    private static void clearConsole(){
        try {
            String os = System.getProperty("os.name").toLowerCase();

            if (os.contains("win")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("bash", "-c", "clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}