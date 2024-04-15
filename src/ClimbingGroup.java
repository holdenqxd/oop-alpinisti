public class ClimbingGroup {
    private boolean isOpenForRecruitment;
    private Climber[] climbers;
    private Mountain mountain;
    private int numClimbers;
    private static final int INITIAL_CAPACITY = 10;
    private static final int GROWTH_FACTOR = 2;

    public ClimbingGroup(Mountain mountain) {
        this.isOpenForRecruitment = true;
        this.climbers = new Climber[INITIAL_CAPACITY];
        this.mountain = mountain;
        this.numClimbers = 0;
    }

    public void addClimber(Climber climber) {
        if (isOpenForRecruitment) {
            if (numClimbers == climbers.length) {
                expandCapacity();
            }
            climbers[numClimbers] = climber;
            numClimbers++;
            System.out.println(climber + " добавлен в группу для восхождения на " + mountain);
        } else {
            System.out.println("Набор в группу для " + mountain + " закрыт.");
        }
    }

    private void expandCapacity() {
        int newCapacity = climbers.length * GROWTH_FACTOR;
        Climber[] newClimbers = new Climber[newCapacity];
        System.arraycopy(climbers, 0, newClimbers, 0, climbers.length);
        climbers = newClimbers;
    }

    public void closeRecruitment() {
        isOpenForRecruitment = false;
        System.out.println("Набор в группу для " + mountain + " закрыт.");
    }
}