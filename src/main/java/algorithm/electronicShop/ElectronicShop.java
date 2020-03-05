package algorithm.electronicShop;

public class ElectronicShop {
    public static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int maxPrice = 0;
        int beforeMaxPrice = keyboards[0] + drives[0];

        for(int keyboardPrice=0; keyboardPrice<keyboards.length; keyboardPrice++) {
            for(int usbPrice =0;  usbPrice<drives.length; usbPrice++) {
                if(usbPrice < drives.length-1){
                    maxPrice = keyboards[keyboardPrice] + drives[usbPrice+1];
                }
                maxPrice = (keyboards[keyboardPrice] + drives[usbPrice] <= b) ? (beforeMaxPrice <= maxPrice ? maxPrice : beforeMaxPrice) : -1;
                beforeMaxPrice = maxPrice;
            }
        }
        return beforeMaxPrice;
    }
}
