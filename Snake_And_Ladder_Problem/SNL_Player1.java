package Snake_And_Ladder_Problem;

import java.util.Random;

public class SNL_Player1 {
    public static void sample_SNL_Player1(){
        int pos = 0;
        int c = 0;
        int player_ahead = 1;
        int player_behind = 2;
        Random rand = new Random();
        while(pos<=100){
            int die_value = (int)(Math.random()*6)+1;
            int checks = rand.nextInt(3);
            if(checks == player_ahead) {
                pos += die_value;
                c++;
                System.out.println("Times the die was played " + c + " Position ahead " + pos);
            }
            else if (checks == player_behind) {
                pos -= die_value;
                System.out.println("Times the die was played " + c + " Position behind " + pos);
            }
            else
                continue;

            if(pos<0)
                pos = 0;
            else if (pos>100)
                pos-=die_value;
            else if(pos == 100)
                break;
        }
        System.out.println("Total No:of Times the die was played to reach position : " + pos + " is : " + c);

    }

    public static void main(String[] args){
        sample_SNL_Player1();
    }
}
