package test.practice;

public class Shuixian {

    public void panDuan() {
        for (int i = 1; i <= 10000; i++) {

            if (i < 10) {
                if (i == i * i * i) {
                    System.out.println(i);
                }
            }
            if (i < 100 && i >= 10) {
                int j = i % 10;
                int a = i / 10;
                if (i == j * j * j + a * a * a) {
                    System.out.println(i);
                }
            }
            if (i < 1000 && i >= 100) {
                int j = i % 10;
                int a = i / 10;
                int b = a % 10;
                int c = a / 10;
                if (i == j * j * j + b * b * b + c * c * c) {
                    System.out.println(i);
                }
            }
            if (i < 10000 && i >= 1000) {
                int a = i % 10;
                int b = i / 10;
                int c = b % 10;
                int d = b / 10;
                int e = d % 10;
                int f = d / 10;
                if (i == a * a * a + c * c * c + e * e * e + f * f * f) {
                    System.out.println(i);
                }
            }
        }


    }

    public static void main(String[] args) {
          Shuixian sx = new Shuixian();
//        sx.panDuan();
            sx.xunHuan(153);
    }

    public void xunHuan(int i){
        int temp = i;
        int sum = 0;
        int x = 0;
        while(temp!=0){

             x = temp%10;
            temp = temp/10;
            sum += x*x*x;
        }

        System.out.println(sum);
    }


}
