public class Team {
    String nameOfTeam;
    String[] arrayOfPlayers = new String[4];
    boolean[]arrayOfRun      = new boolean[4];
    boolean[]arrayOfJump     = new boolean[4];
    boolean[]arrayOfSwim     = new boolean[4];


    public Team (String nameOfPlayer1, String nameOfPlayer2,
                  String nameOfPlayer3, String nameOfPlayer4, String nameOfTeam) {

        arrayOfPlayers[0]=nameOfPlayer1;
        arrayOfPlayers[1]=nameOfPlayer2;
        arrayOfPlayers[2]=nameOfPlayer3;
        arrayOfPlayers[3]=nameOfPlayer4;
        this.nameOfTeam = nameOfTeam;
    }
    public void showPlayers (){

        System.out.printf(" Команда : "+ nameOfTeam + ". \n" );
        for (int loop=0; loop <4;loop ++) {
            System.out.printf(" Игрок   : " + loop + " " + arrayOfPlayers[loop]+ "; \n" );
        }

    }

    public void showResults (){
        for ( int loop = 0; loop < arrayOfPlayers.length; loop ++) {

            if ( arrayOfRun[loop]==true){

                System.out.printf(" Игрок : " + arrayOfPlayers[loop]+ " пробежал дистанцию. \n" );
            }
            else {
                System.out.printf(" Игрок : " + arrayOfPlayers[loop]+ " не пробежал дистанцию. \n" );
            }

            if ( arrayOfJump[loop]==true){

                System.out.printf(" Игрок : " + arrayOfPlayers[loop]+ " пропрыгал дистанцию. \n" );
            }
            else {
                System.out.printf(" Игрок : " + arrayOfPlayers[loop]+ " не пропрыгал дистанцию. \n" );
            }

            if ( arrayOfSwim[loop]==true){

                System.out.printf(" Игрок : " + arrayOfPlayers[loop]+ " проплыл дистанцию. \n" );
            }
            else {
                System.out.printf(" Игрок : " + arrayOfPlayers[loop]+ " не проплым дистанцию. \n" );
            }
        }
    }

}
