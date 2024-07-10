import java.util.*;
public class FoodMenu {
    static Scanner sc = new Scanner(System.in); //รับค่าคียบอร์ด
    static ArrayList<String> NameFood = new ArrayList<>();  //อาเรย์ลิสอันนี้ไว้เก็บชื่ออาหาร
    static ArrayList<Double> PriceFood = new ArrayList<>(); //อาเรย์ลิสอันนี้ไว้เก็บราคาอาหาร
    static ArrayList<String> selectedFoods = new ArrayList<>(); //อาเรย์ลิสอันนี้ไว้เก็บเมนูอาารที่ผู้ใช้โปรแกรมเลือกไว้
    static ArrayList<Integer> selectedQuantities = new ArrayList<>(); //อาเรย์ลิสอันนี้ไว้เก็บว่าสั่งไปกี่จาน
    static ArrayList<Double> alltotalcost = new ArrayList<>(); // โชว์ยอดรวมของราคาทั้งหมด
    static String selectedFood; //เพื่อให้โปรแกรมรู้ว่าผู้ใช้เลือกเมนูอะไร
    static double selectedPrice,totalCost; //ให้โปรแกรมรู้ว่าต้องราคาอาหารคือเท่าไหร่ , ราคารวมทั้งหมดของอาหารที่สั่ง
    static int quantity; //จำนวนจานที่สั่ง
    public static void main(String[] args) {
        menu(); //หยิบเมนธอด menu() ขึ้นมาเปิดใช้งาน
    }
    public static void menu(){
        //หัวเรื่องเป็นเมนูว่าให้เลือกอะไรได้บ้าง
        System.out.println("- - - | Menu Food | - - -");
        System.out.println("1.เมนูอาหาร"); //กด หนึ่ง เพื่อดูว่ามีเมนูอาหารอะไรบ้าง
        System.out.println("2.เช็ครายการอาหาร"); // เช็ครายการอาหารที่สั่งไป
        System.out.println("3.ออกจากโปรแกรม"); // ออกโปรแกรม
        System.out.print("Enter Choice : "); // กรอกตัวเลือกที่ขึ้นมาให้
        int choice = sc.nextInt();

        switch (choice) {
            case 1 : FoodAndPrice(); break; //กด 1 จะวิ่งไปที่ เมดธอด FoodAndPrice
            case 2 : CheckList(); break; // กด 2 จะวิ่งไปที่ CheckList
            case 3 : System.out.println("ขอบคุณที่ใช้เรา"); System.exit(0); //กด 3 จะขึ้นข้อความว่า ขอบคุณ และออกโปรแกรมโดย System.exit
            default : System.out.println("กรุณาเลือกให้ถูกต้อง"); break; //กรอกผิด จะบอกว่า ผิด ลองใหม่
        }
    }
    public static void FoodAndPrice(){
        //ใช้ Array List ด้านบน 2 อันคือ NameFood and PriceFood || static ArrayList<String> NameFood = new ArrayList<>(); || static ArrayList<Double> PriceFood = new ArrayList<>();
        NameFood.add("ก๋วยเตี๋ยว");
        PriceFood.add(30.0);
        NameFood.add("ข้าวผัด");
        PriceFood.add(35.0);
        NameFood.add("ส้มตำ");
        PriceFood.add(40.0);
        NameFood.add("ข้าวกระเพราหมู/ไก่/เนื้อ");
        PriceFood.add(50.0);
        NameFood.add("ผัดไทย");
        PriceFood.add(50.0);
        NameFood.add("ข้าวมันไก่");
        PriceFood.add(60.0);
        NameFood.add("ข้าวหมูแดง");
        PriceFood.add(60.0);
        NameFood.add("ข้าวแกงกะหรี่");
        PriceFood.add(80.0);

         System.out.println("เมนูอาหาร");
        for (int i = 0; i < NameFood.size(); i++)  //ให้แสดงเลขข้างหน้าเมนู
        {
            System.out.println((i + 1) + ". " + NameFood.get(i) + "\nราคา : " + PriceFood.get(i) + " บาท");
        }
        Order(); // พอกรอกเสร็จจะวิ่งไปที่ เมดธอด Order
    }
    public static void Order(){
        System.out.print("กรุณาเลือกเมนู : ");
        int selectedMenu = sc.nextInt();
        if (selectedMenu >= 1 && selectedMenu <= NameFood.size()) //ให้โค้ดรู้ว่า เมนูที่เลือกจะมากกว่า 1 แต่จะไม่เกิน Size ของ ArrayList ที่มีชื่อเมนูอยู่กับราคา ตรง FoodAndPrice
        {
            System.out.print("กรุณาป้อนจำนวนจานที่ต้องการ: ");
            quantity = sc.nextInt();

            selectedFood = NameFood.get(selectedMenu - 1); //ให้รู้ว่าเลือกเมนูไหน
            selectedPrice = PriceFood.get(selectedMenu - 1); //ราคาคือเท่าไหร่
            totalCost = selectedPrice * quantity; //เอา ราคากับจำนวนที่สั่งมา คูณกันให้ได้ยอดรวม

            selectedFoods.add(selectedFood); //ให้อาร์เรย์แอดข้อมูลว่าผู้ใช้เลือกเมนูไหนไปบ้าง
            selectedQuantities.add(quantity); // อาร์เรย์แอดข้อมูลเข้าไปว่าเลือกไปกี่จาน
            alltotalcost.add(totalCost); // อาร์เรย์แอดข้อมูลเข้าไปว่ายอดรวมทั้งหมดเท่าไหร่

            System.out.println("คุณเลือก: " + selectedFood); //โชว์ เมนูที่เลือก
            System.out.println("จำนวนจาน: " + quantity + " จาน"); // โชว์ จำนวนที่สั่ง
            System.out.println("ราคา: " + selectedPrice + " บาท ต่อจาน"); //โชว์ ราคาต่อจาน
            System.out.println("รวมทั้งสิ้น: " + totalCost + " บาท"); // โชว์ ยอดรวมทั้งหมด

            System.out.print("ต้องการสั่งเมนูอื่นหรือไม่? (1: ใช่, 0: ไม่): "); //ถามว่าจะสั่งเมนูอื่นต่อหรือไม่
            int continueOrder = sc.nextInt();

                if (continueOrder == 1)  // กด 1 วนไปเมดธอด  Order เพื่อให้แสดงเมนูอีกรอบว่ามีอะไรบ้าง?
                {
                    Order();
                } 
                else //ถ้า 0 คือจะออกจากหน้าเมนูแล้วกลับไปหน้าแรกที่มีให้เลือก 1-3
                {
                    System.out.println("ขอบคุณที่มาใช้บริการของเรา กรุณารออาหารสักครู่!");
                    menu();
                }
        }

        else //กรอกผิดเลข ลองใหม่
        {
            System.out.println("กรุณาเลือกเมนูที่ถูกต้อง"); 
        }
}
    public static void CheckList()
    {
        System.out.println("เช็ครายการอาหาร");

        if (selectedFood != null)  //อาหารที่เลือกจะไม่มีค่า = ช่องว่างหรือ Null
        {
            System.out.println("รายการที่เลือก:");
            for (int i = 0; i < selectedFoods.size(); i++)  //แสดงว่ามีเมนูที่เลือกอะไรบ้าง
            {
                System.out.println((i+1) + ". " +selectedFoods.get(i)); //เมนูที่เลือก
                System.out.println("   จำนวนจาน : " +selectedQuantities.get(i)); //จำนวนจานที่สั่ง
                System.out.println("   ราคาต่อจาน : " +selectedPrice+ " บาท"); // ราคาไม่รวมทั้งหมด ต่อจาน
                System.out.println("ยอดรวมทั้งหมด : "+ alltotalcost.get(i)+" บาท"); //ราคาทั้งหมดของแต่ละเมนู
            }
        }

        else 
        {
            System.out.println("ยังไม่มีรายการที่ถูกเลือก"); //ถ้ายังไม่มีรายการที่เลือกจะขึ้นว่ายังไม่มีรายการที่ถูกเลือก
        }
    }
}

