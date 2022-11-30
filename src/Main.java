import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //zadacha1
        int lab = 11;
        byte home = 127;
        short fot = 32000;
        long did = 9040404;
        float rid = 3.40f;
        double kich = -1.7908;
        System.out.println(" Значение переменной lab = " + lab);
        System.out.println(" Значение переменной home = " + home);
        System.out.println(" Значение переменной fot= " + fot);
        System.out.println(" Значение переменной did = " + did);
        System.out.println(" Значение переменной rid = " + rid);
        System.out.println(" Значение переменной kich = " + kich);

        //zadacha2
        float a = 27.12f;
        long b = 987678965549L;
        double c = 2.786;
        short d = 569;
        short e = -159;
        short i = 27897;
        int r = 67;

        System.out.println(a);
        System.out.println(b);
        System.out.println (c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(i);
        System.out.println(r);

        //zadacha3
        int Luda = 23;
        int Ann = 27;
        int Ekat = 30;
        short paper = 480;
        int child = 0;
        child = paper/(Luda+Ann+Ekat);
        System.out.println("На каждого ученика рассчитано " + child + " листов бумаги.");

        //zadacha4
        short chek = 16;
        short time = 2;

        short time20 = 16 *20/2;
        int time1Day = 24*60/ time * chek;
        int time3Day = 3*24*60/ time * chek;
        int time1Month = 31*24*60 / time * chek;
        System.out.println("За 20 мин машина произвела " + time20 + " шт бутылок.");
        System.out.println("За сутки машина произвела " + time1Day + " шт бутылок.");
        System.out.println("За 3 дня машина произвела " + time3Day + " шт бутылок.");
        System.out.println("За 1 месяц машина произвела " + time1Month + " шт бутылок.");

        //zadacha5
        int Over = 120;
        int bel = 2;
        int brow = 4;
        int Class = 120/ (2*4);
        bel= bel * Class;
        brow = brow * Class;
        System.out.println("В школе, где " + Class + " классов, нужно " + bel + " банок белой краски и " + brow + " банок коричневой краски.");

        //zadacha6
        short banan = 80;
        short milk = 105;
        short iceCream = 100;
        short igl = 70;
        int blender = banan*5+milk*2+iceCream*2+igl;
        float kg = blender/1000f;
        System.out.println(blender + " граммов, а в кг " + kg);

        //zadacha7
        byte waiet = 7;
        float al = 0.25f;
        float bl = 0.5f;
        float day1 = waiet/al;
        float day2 = waiet/bl;
        float sday = waiet/((al+bl)/2);
        System.out.println(sday);

        //zadacha8
        int Maha = 67760;
        int Den = 83690;
        int Kris = 76230;
        double yearM = Maha * 12;
        double yearD = Den*12;
        double yearK = Kris*12;
        double newM = Maha*1.1;
        double newD = Den * 1.1;
        double newK = Kris*1.1;
        yearM = 12 * newM-yearM;
        yearD = 12 * newD-yearD;
        yearK= 12 * newK-yearK;
        System.out.println(newM);
        System.out.println("Маша теперь получает " + newM + " рублей. Годовой доход вырос на " + yearM + " рублей." );
        System.out.println("Денис теперь получает " + newD + " рублей. Годовой доход вырос на " + yearD + " рублей." );
        System.out.println("Кристина теперь получает " + newK + " рублей. Годовой доход вырос на " + yearK + " рублей." );




    }
}