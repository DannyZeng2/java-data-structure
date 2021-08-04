package Recursion;

public class HanoiTower {

    public static void move(int n, char from, char middle,char to) {
        if(n == 1) {
            System.out.println("第1个盘从"+from+"移到"+to);
        }else{
            move(n-1,from,to,middle);
            System.out.println("第"+n+"个盘从"+from+"移到"+to);
            move(n-1,middle,from,to);
        }
    }
}
