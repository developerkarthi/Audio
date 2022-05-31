import javax.sound.sampled.*;
import java.io.*;
import java.util.*;

public class Audio {
	public static void main(String args[]) throws Exception
	{
	Scanner in = new Scanner(System.in);
	File f = new File("sa.wav");
	AudioInputStream ai = AudioSystem.getAudioInputStream(f);
	Clip c = AudioSystem.getClip();
	c.open(ai);
	while(true)
	{
		System.out.println("1.Start\n2.Stop\n3.Quit");
		System.out.print("Enter the key.... : ");
	int s = in.nextInt();
	if(s==1)
		c.start();
	else if(s==2)
		c.stop();
	else if(s==3)
		break;
	else
		System.out.print("your enter worng key....");
	}
	
		
//add your favorite song (.wav Extension)
		
		
		
		
		
		
		
	}

}
