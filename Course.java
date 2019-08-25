public class Course {
    String doIt;
    String[] course = new String[3];

    public Course(String cours1,String cours2, String cours3 ) {
        course[0]=cours1;
        course[1]=cours2;
        course[2]=cours3;

    }

    public void  doIt (Team team) {
        for (int loop =0 ; loop <team.arrayOfPlayers.length; loop ++){
            team.arrayOfRun[loop] = true;
            team.arrayOfJump [loop] = true;
            team.arrayOfSwim [loop] = true;
        }
        System.out.println(" Игроки команды " + team.nameOfTeam + " прошли полосу препядствий " );
    }

}
