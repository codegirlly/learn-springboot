package test.practice;

public class Qiuzhi {

    public int max( int x,int y,int z){

       if(x<y){
           x=y;
       }
        if(x<z){
           x=z;
        }

        return x;
    }

    public int jiaFa(){

        int sum = 0;
        for(int i=1;i<=100;i++){
            sum +=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Qiuzhi qz = new Qiuzhi();
        System.out.println( qz.max(1,5,3));
        System.out.println(qz.jiaFa());
    }
}
