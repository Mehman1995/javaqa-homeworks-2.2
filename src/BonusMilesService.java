/**
 * Класс сервиса для расчёта миль
 */

public class BonusMilesService {
    // За каждые 20 рублей начисляется 1 миля
    public int calculate(int cost) {
        // Возвращаем целое количество миль
        return cost / 20;
    }
}
