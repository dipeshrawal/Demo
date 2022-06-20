public class Calculation{
    public Calculation(){
        int o= add(1, 2);
        int p= sub(3, 2);
        int q= multiply(3, 4);
        int r= division(12, 3);
        System.out.println(o +" "+p+" "+q+" "+r);
    }
    public int add (int a, int b){
        return a+b;

    }
    public int sub (int a, int b){
        return a-b;
    }
    public int multiply (int a, int b){
    return a*b;
    }
    public int division (int a, int b){
        return a/b;
    }
    public static void main(String[]str){
        System.out.println("Calculation");
        Calculation me= new Calculation();
        

    }
}
