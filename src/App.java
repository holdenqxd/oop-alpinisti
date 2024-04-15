public class App {
    public static void main(String[] args) {

        Mountain everest = new Mountain("Эверест", "Непал", 8848);
        Mountain k2 = new Mountain("К2", "Пакистан", 8611);
        Mountain kilimanjaro = new Mountain("Килиманджаро", "Танзания", 5895);

        ClimbingGroup group1 = new ClimbingGroup(everest);
        ClimbingGroup group2 = new ClimbingGroup(k2);
        ClimbingGroup group3 = new ClimbingGroup(kilimanjaro);

        Climber climber1 = new Climber("Пудж", 30, "Москва");
        Climber climber2 = new Climber("Чен", 35, "Санкт-Петербург");
        Climber climber3 = new Climber("ВладА4", 25, "Киев");
        group1.addClimber(climber1);
        group1.addClimber(climber2);
        group1.addClimber(climber3);
        group1.closeRecruitment();

        Climber climber4 = new Climber("Чел", 28, "Минск");
        group2.addClimber(climber4);

        Climber climber5 = new Climber("Дмитрий", 40, "Новосибирск");
        group3.addClimber(climber5);
    }
}
