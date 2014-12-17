import java.util.ArrayList;

public class Rechnung
{
	private static	ArrayList<Artikel> artikelListe = new ArrayList<Artikel>();
	private static boolean html=true;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Artikel artikel1 = new Artikel("Festplatte", 89.99);
		Artikel artikel2 = new Artikel("USB-Stick", 19.99);
		add(artikel1);
		add(artikel2);
		drucken();
	}
	
	public static void add(Artikel artikel)
	{
		artikelListe.add(artikel);
	}

	public static void drucken()
	{
		if (html)
		{
		System.out.print("<table> <tr> <td>Artikel</td> <td>Preis</td></tr> <tr>");
		for(int i = 0; i < artikelListe.size(); i++)
		{		
			System.out.print("<td>" + artikelListe.get(i).getArtikelBezeichnung() + "</td>");
			System.out.print("<td> " + artikelListe.get(i).getPreis() + "</td></tr>");
		}
		System.out.print("</table>");
		}
		else
		{
			for(int i = 0; i < artikelListe.size(); i++)
			{
				System.out.print(artikelListe.get(i).getArtikelBezeichnung());
				System.out.println(" " + artikelListe.get(i).getPreis());
			}		
		}
	}
}