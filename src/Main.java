public class Main {
    public static void main(String[] args) {

        //task 1

        byte a = 67;
        System.out.println("Значение переменной a с типом byte равно" + a);
        short b = 27897;
        System.out.println("Значение переменной b с типом short равно" + b);
        int c = 569;
        System.out.println("Значение переменной c с типом int равно" +c);
        float e = 27.12f;
        System.out.println("Значение переменной e с типом float равно " +e);
        double i = 2.786;
        System.out.println("Значение переменной i с типом double равно" + i);
        long bb = 987678965549L;
        System.out.println("Значение переменной bb с типом long равно" +bb);

        //task 2
        float Number1 = 27.12f;
        long Nubmer2 = 987678965549L;
        double Nubmer3 = 2.786;
        short Nubmer4 = 27897;
        byte Number5 = 67;
        int Number6 = 569;
        int Nubmer7 = -159;

        //task 3

        int aClass = 23;
        int bClass = 27;
        int cClass = 30;
        int Total = 480;
        int totalPeople = aClass + bClass + cClass;
        int papers = Total / totalPeople;
        System.out.println("На каждого ученика расчитано" + papers + "листов бумаги");

        //task 4

        int bottles = 16;
        int minutes = 2;
        int bottlesoneminutes = bottles / minutes;
        int bottle20min = bottlesoneminutes * 20;
        int bottleHour = bottle20min * 24;
        int bottle3days =bottleHour * 3;
        int bottle30days =bottle3days * 30;

        System.out.println("За 20 минут машина произвела" +bottle20min+ "штук бутылок" );
        System.out.println("За сутки минут машина произвела" +bottleHour+ "штук бутылок" );
        System.out.println("За 3 дня машина произвела" +bottle3days+ "штук бутылок" );
        System.out.println("За месяц  машина произвела" +bottle30days+ "штук бутылок" );

        //task 5

        int totalPaint = 120;
        int whitePaint = 2;
        int brownPaint = 4;
        int totalClasses = totalPaint / (whitePaint + brownPaint);
        int totalWhitePaint = whitePaint * totalClasses;
        int totalBrownPaint = brownPaint * totalClasses;
        System.out.println("В школе, где" + totalClasses +  "классов,нужно " +  totalWhitePaint  +"банок белой краски и "+ totalBrownPaint +  "коричневой краски" );


        //task 6

        int bananasCount = 5;
        int Milk = 2;
        int iceCream =2;
        int eggs = 4;
        int weightBananas = 80;
        int weighMilk = 105;
        int weightIceCream = 100;
        int weightEggs = 70;
        int totalWeightGramm =  bananasCount * weightBananas + Milk * weighMilk + iceCream * weightIceCream + eggs * weightEggs;
        double totalWeightInKg = totalWeightGramm / 1_000;
        System.out.println("Общий вес в граммах" +totalWeightGramm+ "в кг" + totalWeightInKg);

        //task 7

        int weightInGrams = 7_000;
        int weightForDayMin = 250;
        int weightForDayMax = 500;
        double MaxDay = weightInGrams / weightForDayMin;
        double MinDay = weightInGrams / weightForDayMax;
        double averageWeightDays = (weightForDayMin + weightForDayMax) /2D;
        double averageDays = weightInGrams /  averageWeightDays ;
        System.out.println("Минимально время для похудание" +MinDay);
        System.out.println("Максимально время для похудание" +MaxDay);
        System.out.println("Среднее время для похудание" +averageDays);

        //task 8

        int Masha = 67760;
        int Denis =83690;
        int Cris =  76230;
        double indexPers = 1.1;

        double newMasha = Masha * indexPers;
        double newDenis = Denis * indexPers;
        double  newCris = Cris * indexPers ;

        double MashaSalary = 12 * Masha;
        double newMashaSalary = 12 * newMasha;

        double DenisSalary = 12 * Denis;
        double newDenisSalary = 12 * newDenis;

        double CrisSalary = 12 * Cris;
        double newCrisSalary = 12 * newCris;
        System.out.println("Маша теперь получает" + newMasha + "рублей Годовой доход вырос на" +(newMashaSalary - MashaSalary) );
        System.out.println("Денис теперь получает" + newDenis + "рублей Годовой доход вырос на" +(newDenisSalary - DenisSalary) );
        System.out.println(" Кристина теперь получает" + newCris + "рублей Годовой доход вырос на" + (newCrisSalary - CrisSalary) );






















    }
}