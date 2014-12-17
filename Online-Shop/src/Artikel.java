public class Artikel
{

	public Artikel(String ab, double d){
		preis = d;
		artikelBezeichnung = ab;
	}
	
private double preis;
private String artikelBezeichnung;


public double getPreis()
{
	return preis;
}

public String getArtikelBezeichnung()
{
	return artikelBezeichnung;
}

}