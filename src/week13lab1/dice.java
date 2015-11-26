package week13lab1;

import java.util.Random;

public class dice {

	
		int Throw()
		{
			Random rand = new Random();

			return rand.nextInt(6) + 1;
		}

	}


