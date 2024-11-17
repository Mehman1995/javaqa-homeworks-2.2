public class Main {
    public static void main(String[] args) {
        BonusMilesService bms = new BonusMilesService();
        // Стоимость билета
        int ticketCost = 13676;
        // Метод возвращающий расчёт миль
        int miles = bms.calculate(ticketCost);

        // Выводим результат на экран
        System.out.println("При стоимости билета в " + ticketCost + " рублей должно начислиться " + "миль." + miles);

    }
}