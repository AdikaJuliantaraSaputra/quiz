import java.util.Scanner;

public class Pecahan {
    public static void main(String[] args) {
        int pembilang1, penyebut1, pembilang2, penyebut2, oper, xpenyebut;
        int xpembilang1, xpembilang2, tambah, kurang, kali, bagi1, bagi2;

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Pembilang 1 : ");
        pembilang1 = input.nextInt();

        System.out.print("Masukkan Penyebut 1 : ");
        penyebut1 = input.nextInt();

        System.out.print("Masukkan Pembilang 2 : ");
        pembilang2 = input.nextInt();

        System.out.print("Masukkan Penyebut 2 : ");
        penyebut2 = input.nextInt();

        System.out.print("Masukkan Operasi | 1 = + | 2 = - | 3 = x | 4 = / | : ");
        oper = input.nextInt();
        
        xpenyebut = penyebut1 * penyebut2;
        xpembilang1 = (xpenyebut / penyebut1) * pembilang1;
        xpembilang2 = (xpenyebut / penyebut2) * pembilang2;
        tambah = xpembilang1 + xpembilang2;
        kurang = xpembilang1 - xpembilang2;
        kali = pembilang1 * pembilang2;
        bagi1 = pembilang1 * penyebut2;
        bagi2 = pembilang2 * penyebut1;
        if (oper == 1) {
            System.out.println(pembilang1 + "   " + pembilang2 + "   " + tambah);
            System.out.println("- + - = -");
            System.out.println(penyebut1 + "   " + penyebut2 + "   " + xpenyebut);
        }
        else if (oper == 2) {
            System.out.println(pembilang1 + "   " + pembilang2 + "   " + kurang);
            System.out.println("- - - = -");
            System.out.println(penyebut1 + "   " + penyebut2 + "   " + xpenyebut);
        }
        else if (oper == 3) {
            System.out.println(pembilang1 + "   " + pembilang2 + "   " + kali);
            System.out.println("- x - = -");
            System.out.println(penyebut1 + "   " + penyebut2 + "   " + xpenyebut);
        }
        else if (oper == 4) {
            System.out.println(pembilang1 + "   " + pembilang2 + "   " + bagi1);
            System.out.println("- / - = -");
            System.out.println(penyebut1 + "   " + penyebut2 + "   " + bagi2);
        }
        else {
            System.out.println("INPUT YANG ANDA MASUKKAN SALAH!");
        }


    }


}