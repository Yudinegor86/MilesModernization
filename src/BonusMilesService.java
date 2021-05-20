public class BonusMilesService {
    public int calculate(int cost) {
        int cashBonus = 20;
        int miles;
        miles = (cost / cashBonus);
        return miles;
    }
}
