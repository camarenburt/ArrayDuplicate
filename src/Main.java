import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] newArray = new int[10];
        for (int c = 0; c < newArray.length; c++) {
            int x = rand.nextInt(10) + 1;
            newArray[c] = x;
        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        int count6 = 0;
        int count7 = 0;
        int count8 = 0;
        int count9 = 0;
        int count10 = 0;
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] == 0) {
                count0++;
            } else if (newArray[i] == 1) {
                count1++;
            } else if (newArray[i] == 2) {
                count2++;
            } else if (newArray[i] == 3) {
                count3++;
            } else if (newArray[i] == 4) {
                count4++;
            } else if (newArray[i] == 5) {
                count5++;
            } else if (newArray[i] == 6) {
                count6++;
            } else if (newArray[i] == 7) {
                count7++;
            } else if (newArray[i] == 8) {
                count8++;
            } else if (newArray[i] == 9) {
                count9++;
            } else if (newArray[i] == 10) {
                count10++;

            }
        }
        if(count0>1){
            System.out.print("\nThe Number 0 occurs " + count0 + " times.");
        }
        if(count1>1){
            System.out.print("\nThe Number 1 occurs " + count1 + " times.");
        }if(count2>1){
            System.out.print("\nThe Number 2 occurs " + count2 + " times.");
        }if(count3>1){
            System.out.print("\nThe Number 3 occurs " + count3 + " times.");
        }if(count4>1){
            System.out.print("\nThe Number 4 occurs " + count4 + " times.");
        }if(count5>1){
            System.out.print("\nThe Number 5 occurs " + count5 + " times.");
        }if(count6>1){
            System.out.print("\nThe Number 6 occurs " + count6 + " times.");
        }if(count7>1){
            System.out.print("\nThe Number 7 occurs " + count7 + " times.");
        }if(count8>1){
            System.out.print("\nThe Number 8 occurs " + count8 + " times.");
        }if(count9>1){
            System.out.print("\nThe Number 9 occurs " + count9 + " times.");
        }if(count10>1){
            System.out.print("\nThe Number 10 occurs " + count10 + " times.");
        }
    }}