package Chapter6;

public class PhoneBillCalc {
        public static void main(String[] args){
            PhoneBill bill = new PhoneBill(1);
            bill.setMinutesUsed(1000);
            bill.printItemizedBill();
            PhoneBill bill2 = new PhoneBill(2, 50,5, 10);
            bill2.printItemizedBill();
        }
}
