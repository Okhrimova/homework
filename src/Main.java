public class Main {
    public static void main(String[] args) {
        //Задание №1
        int apricot = 5;
        byte apple = 9;
        short  fig = 15;
        long potato = 203L;
        float meatWeight = 2.5f;
        double tomatoWeight = 3.6;
        boolean apricotIsDirty = apricot > 7;
        char bar = 43;

        //Задание №2.
        double boxerWeight1 = 78.2;
        double boxerWeight2 = 82.7;
        double weightOffAllBoxers = boxerWeight1 + boxerWeight2;
        double weightDifference = boxerWeight2 - boxerWeight1;
        System.out.println("Общий вес " + weightOffAllBoxers + " кг");
        System.out.println("Разница между весами " + weightDifference + " кг");

        //Задание №3
        int banana = 5;
        int milk100Ml = 105;
        int icecream = 2;
        int egg = 4;
        int bananaWeight = banana * 80;
        System.out.println("Общий вес бананов " + bananaWeight + " грамм");
        int milk200Ml = milk100Ml * 2;
        System.out.println("Общий вес молока " + milk200Ml + " грамм");
        int allIcecreamWeight = icecream * 100;
        System.out.println("Вес мороженого " + allIcecreamWeight + " грамм");
        int eggsWeight = egg * 70;
        System.out.println("Вес яиц " + eggsWeight + " грамм");
        int ingridientsWeight = bananaWeight + milk200Ml + allIcecreamWeight + eggsWeight;
        System.out.println("Общий вес спорт-завтрака " + ingridientsWeight + " грамм");

        float allWeightG = 1090;
        float allWeightKg = allWeightG / 1000;
        System.out.println("Общий вес в кг " + allWeightKg);

        //Задание №4
        int loseKg = 7;
        int loseGramm = loseKg * 1000;
        System.out.println("Сбросить " + loseGramm + " грамм");
        int howManyDays = loseGramm / 250;
        System.out.println(howManyDays + " дней уйдет на похудение, если скидывать по 250 грамм");
        int howManyDays2 = loseGramm / 500;
        System.out.println(howManyDays2 + " дней уйдет на похудение, если скидывать по 500 грамм");
        int onAverage = (howManyDays + howManyDays2) / 2;
        System.out.println(onAverage + " дней может потребоваться в среднем");

        //Задание №5
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        int mashaIncrease = (10 * masha) / 100;
        int mashaSalary = mashaIncrease + masha;
        System.out.println("Маша теперь получает  " + mashaSalary + " рублей.Годовой доход вырос на " + mashaIncrease + " рублей");
        int denisIncrease = (10 * denis) / 100;
        int denisSalary = denisIncrease + denis;
        System.out.println("Миша теперь получает " + denisSalary + " рублей.Годовой доход вырос на " + denisIncrease + " рублей");
        int kristinaIncrease = (10 * kristina) / 100;
        int kristinaSalary = kristinaIncrease + kristina;
        System.out.println("Кристина теперь получает " + kristinaSalary + " рублей.Годовой доход вырос на " + kristinaIncrease + " рублей");







    }
}