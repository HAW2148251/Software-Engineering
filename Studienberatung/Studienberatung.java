import java.util.*;

public class Studienberatung
{
	public static void main(String[] args)
	{
		System.out.println("Hast du Abitur? [ja] / [nein]");
		Scanner scannerAbi = new Scanner(System.in);
		String wahlAbi = scannerAbi.next();
		
		if (wahlAbi.equals("ja"))
		{
			System.out.println("Bist du wissbegierig? [ja] / [nein]");
			Scanner scannerWiss = new Scanner(System.in);
			String wahlWiss = scannerWiss.next();
			
			if (wahlWiss.equals("ja"))
			{
				System.out.println("Auf jeden Fall studieren");
			}
			else
			{
				System.out.println("Nicht studieren");
			}			
		}
		else
		{
			System.out.println("Hast du Fachabitur? [ja] / [nein]");
			Scanner scannerFachAbi = new Scanner(System.in);
			String wahlFachAbi = scannerFachAbi.next();
		
			if (wahlFachAbi.equals("ja"))
			{
				System.out.println("Hast du eine Berufsausbildung? [ja] / [nein]");
				Scanner scannerBeruf = new Scanner(System.in);
				String wahlBeruf = scannerBeruf.next();
				
				if (wahlBeruf.equals("ja"))
				{
					System.out.println("Willst du sofort Geld verdienen? [ja] / [nein]");
					Scanner scannerGeld = new Scanner(System.in);
					String wahlGeld = scannerGeld.next();
				
					if (wahlGeld.equals("ja"))
					{
						System.out.println("Du kannst ja spaeter noch studieren");
					}
					else
					{
						System.out.println("Dann studier doch!");
					}
				
				}
				else
				{
					System.out.println("Besser noch studieren");
				}
			}
			else
			{
				System.out.println("Nicht studieren");
			}
		}
	}
}