public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        int accumulate = 12_000_000;
        int bank = 15_000;
        int mounth = 1;
        double percent = 0.07;
        int saving = 0;
        for (; bank < accumulate; mounth++) {
            bank += bank * percent;
            System.out.println("Месяц " + mounth + " сумма накоплений равна " + bank + " рублей");
        }
        // Задание 2
        System.out.println("Задание 2");
        int accumulate_ = 12_000_000;
        int bank_ = 15_000;
        int mounth_ = 1;
        double percent_ = 0.07;
        int saving_ = 0;
        for (; bank_ < accumulate_; mounth_++) {
            bank_ += bank_ * percent_;
            if (mounth_ % 6 == 0) {
                System.out.println("Месяц " + mounth_ + " сумма накоплений равна " + bank_ + " рублей");
            }
        }
        // Задание 3
        System.out.println("Задание 3");
        int accumulate1 = 12_000_000;
        int bank1 = 15_000;
        int mounth1 = 1;
        double percent1 = 0.07;
        int saving1 = 0;
        for (; mounth1 <= 9 * 12; mounth1++) {
            bank1 += bank1 * percent1;
            if (mounth1 % 6 == 0) {
                System.out.println("Месяц " + mounth1 + " сумма накоплений равна " + bank1 + " рублей");
            }
        }
        // Задание 4
        System.out.println("Задание 4");
        int friday = 3;
        for (int day = friday; day <= 31; day += 7) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");
        }
    }
}