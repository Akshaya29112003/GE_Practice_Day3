package Snake_And_Ladder_Problem;

import java.util.Random;

public class SNL_Player2 {
    public static void sample_SNL_Player2(){
        int player_ahead = 1;
        int player_behind = 2;

        int player1_pos = 0;
        int player2_pos = 0;

        int player1_moves = 0;
        int player2_moves = 0;

        Random rand = new Random();

        while(player1_pos<100 && player2_pos<100){

            int die_value = (int)(Math.random()*6)+1;
            int checks = rand.nextInt(3);

            if(checks == player_ahead) {
                player1_pos += die_value;
                player1_moves++;
                System.out.println("Player 1 rolls " + player1_moves + " Ladder " + player1_pos);
                if (player1_pos>100)
                    player1_pos-=die_value;
            }
            else if (checks == player_behind) {
                player1_pos -= die_value;
                player1_moves++;
                System.out.println("Player 1 rolls " + player1_moves + " Snake " + player1_pos);
                if(player1_pos<0)
                    player1_pos = 0;
            }
            else
                continue;

            if(player1_pos == 100){
                System.out.println("Player 1 wins game in "+ player1_moves +" moves");
                break;
            }

            die_value = (int)(Math.random()*6)+1;
            checks = rand.nextInt(3);

            if(checks == player_ahead) {
                player2_pos += die_value;
                player2_moves++;
                System.out.println("Player 2 rolls " + player2_moves + " Ladder " + player2_pos);
                if (player2_pos>100)
                    player2_pos-=die_value;
            }
            else if (checks == player_behind) {
                player2_pos -= die_value;
                player2_moves++;
                System.out.println("Player 2 rolls " + player2_moves + " Snake " + player2_pos);
                if(player2_pos<0)
                    player2_pos = 0;
            }
            else
                continue;

            if(player2_pos == 100){
                System.out.println("Player 2 wins game in "+ player2_moves +" moves");
                break;
            }
        }
    }

    public static void main(String[] args){
        System.out.println("Snake and Ladder Game Starts!");
        sample_SNL_Player2();
    }
}
