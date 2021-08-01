package CalcLast;
import java.util.Scanner;

public class Pusk {
    public static void main(String[] args) {
        System.out.println("Введите пример");
        Scanner vvod = new Scanner(System.in);
        String primer = vvod.nextLine();
        String[] trioper = primer.split(" ");
        int dlinnaMassiva = trioper.length;
        if (dlinnaMassiva!=3)
            System.out.println("Ошибка ввода");
        ArabPrint test=new ArabPrint();
        Rim test2=new Rim();
        char f = trioper[0].charAt(0);
        int af = (int) f;
        char s= trioper[2].charAt(0);
        int as=(int) s;
        if ((af>=49&&af<=57)&&(as>=49&&af<=57))
            test.arabprimer(primer);
        else if (((af==73)||(af==86)||(af==88))&&((as==73)||(as==86)||(as==88)))
            test2.rimprimer(primer);
        else System.out.println("проверьте входные данные");
        }
            }

class Arab {
    int z;
    public void arabprimer(String primer) {
        String[] trioper = primer.split(" ");
        int a = Integer.parseInt(trioper[0]);
        int b = Integer.parseInt(trioper[2]);
        int dlinnaMassiva = trioper.length;
        if (dlinnaMassiva == 3) {
            if (((a <= 10) && (a > 0)) && ((b <= 10) && (b > 0))) {
                switch (trioper[1]) {
                    case ("+"):
                        z=a+b;
                        break;
                    case ("-"):
                        z=a-b;
                        break;
                    case ("/"):
                        z=a / b;
                        break;
                    case ("*"):
                        z=a * b;
                        break;
                    default:
                        System.out.println("Ошибка-проверьте оператор");
                        break;
                }
            } else System.out.println("Некорректный ввод чисел");
        } else System.out.println("Некорректный ввод");
    }
}

class ArabPrint {
    int z;
    public void arabprimer(String primer) {
        String[] trioper = primer.split(" ");
        int a = Integer.parseInt(trioper[0]);
        int b = Integer.parseInt(trioper[2]);
        int dlinnaMassiva = trioper.length;
        if (dlinnaMassiva == 3) {
            if (((a <= 10) && (a > 0)) && ((b <= 10) && (b > 0))) {
                switch (trioper[1]) {
                    case ("+"):
                        System.out.println(z=a+b);
                        break;
                    case ("-"):
                        System.out.println(z=a-b);
                        break;
                    case ("/"):
                        System.out.println(z=a / b);
                        break;
                    case ("*"):
                        System.out.println(z=a * b);
                        break;
                    default:
                        System.out.println("Ошибка-проверьте оператор");
                        break;
                }
            } else System.out.println("Некорректный ввод чисел");
        } else System.out.println("Некорректный ввод");
    }
}

class Rim {
    void rimprimer(String primer) {
        String[] RimAr = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String[] ArabAr = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String[] tririm = primer.split(" ");
        for (int i = 0; i < 10; i++)
            if ((RimAr[i] == tririm[0].intern())) {
                int x1 = Integer.parseInt(ArabAr[i]);
                for (int j = 0; j < 10; j++) {
                    if ((RimAr[j] == tririm[2].intern())) {
                        int x2 = Integer.parseInt(ArabAr[j]);
                        String rimReverce = x1 + " " + tririm[1] + " " + x2;
                        Arab conv = new Arab();
                        conv.arabprimer(rimReverce);
                        Convert itog = new Convert();
                        itog.RimConvert(conv.z);
                        if (conv.z <= 0) {
                            System.out.println("Проверьте введённые данные");
                        }
                    }
                }
            }
    }
}

class Convert {
    void RimConvert(int number) {
        int[] roman_value_list = new int[]{100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman_char_list = new String[]{"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < roman_value_list.length; i += 1) {
            while (number >= roman_value_list[i]) {
                number -= roman_value_list[i];
                res.append(roman_char_list[i]);
            }
        }
        System.out.println(res);
    }
}