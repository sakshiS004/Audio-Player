import javax.sound.sampled.*;
import java.util.*;
import  java.io.*;

/**
 * Audio
 */
public class Audio {

    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        
        Scanner sc = new Scanner(System.in);

        File file = new File("C:\\Users\\Sakshi\\OneDrive\\Desktop\\java\\Exception Handling\\HEU.wav");
        AudioInputStream audio = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audio);

        String response = "";

        while(! response.equals("Q")){

            System.out.println("Enter P = play, S = stop, R = reset, Q = quit");
            System.out.print("Enter your response: ");

             response = sc.nextLine();
             response = response.toUpperCase();

             switch (response) {
                case "P": clip.start();
                    break;
                
                case "S": clip.stop();
                    break;

                case "R": clip.setMicrosecondPosition(0);
                    break;

                case "Q": clip.close();
                    break;

                default:
                System.out.println("The response is invalid!");
                    break;

             }
        }
        System.out.println("Byeee!");


    }
}
