package bearsandhunters;

import soundmaker.*;
import sound.*;
import picture.*;

public class BearAndHunterTest
{
    public static void main(String[] args)
    {
	MakeSound ms = new MakeSound();
	ms.blast("/Users/vic/BearsAndHunters/src/bearsandhunters/fire.wav");
	
//	Picture pp = new Picture();
//	pp.showPicture("/Users/vwpro/BearsAndHunters/src/bearsandhunters/Omega.jpg",222, 333);
//	Sound ss = new Sound();
////	ss.playSound("/Users/vwpro/BearsAndHunters/src/bearsandhunters/fire.wav");
	
	
	System.out.println("");
	Bear joe = new Bear();
	joe.age = 12;
	joe.nickName = "Joey";
	joe.printNickName();
	joe.printAge();
	System.out.println("");
	
	Bear sam = new Bear();
	sam.age = 3;
	sam.nickName = "Sammy";
	sam.printNickName();
	sam.printAge();
	sam.run();
	System.out.println("");
	
	Hunter jack = new Hunter();
	jack.nickName = "JJ";
	jack.printNickName();
	for(int i = 0; i < 3; i++)
	{
	    jack.shoot();
	}
	jack.married = true;
	jack.checkMaritalStatus();
	System.out.println("");
    }
}
