public class MainTeam {

    public static void main(String[] args) {

        boolean[]arrayOfRun      = new boolean[4];
        boolean[]arrayOfJump     = new boolean[4];
        boolean[]arrayOfSwim     = new boolean[4];

        Course course = new Course ("Бег","Прыжки","Плаванье");

        Team team1 = new Team("Иванов" , "Петров",
                "Сидоров","Соколов","Зенит" );

        Team team2 = new Team( "Васечкин","Петечкин",
                "Леонов","Сурков", "Динамо");

        team1.showPlayers();
        team2.showPlayers();
        course.doIt(team1);
        course.doIt(team2);
        team1.showResults();
        team2.showResults();
    }

}
