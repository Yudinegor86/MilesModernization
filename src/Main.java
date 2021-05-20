public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int ticketPrice = 24323;
        int miles = service.calculate(ticketPrice);
        System.out.println("Miles accrued " + miles);
    }
}
