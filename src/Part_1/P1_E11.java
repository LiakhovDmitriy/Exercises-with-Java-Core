package Part_1;

public class P1_E11 {
    public static void main(String args[]) {
        double num, sroot, rerr;
        for (num = 1.0; num < 100.0; num++) {
            sroot = Math.sqrt(num);
            System.out.println("Корень квадратный из " + num +
                    " равен " + sroot);
// Вычисление ошибки округления
            rerr = num - (sroot * sroot);
            System.out.println("Ошибка округления: " + rerr);
            System.out.println();
        }
    }}