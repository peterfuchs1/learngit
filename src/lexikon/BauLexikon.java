package lexikon;

import java.util.HashMap;

public class BauLexikon extends HashMap<String, String> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2842818991284787695L;

	public BauLexikon() {
		super();
		put("T�rdr�cker","T�rschnalle");
		put("Zarge","T�rstock");
		put("Fensterbank","Fensterbrett");
		put("Armierung","Bewehrung");
		put("Pfette","Balken im Dachstuhl");
		put("Sparren","Balken im Dachstuhl");
		put("Mauerbank","Balken im Dachstuhl");
		put("St�tze","Pfeiler");
		put("�berlager","Sturz");
		put("Halbolive","Fenster- oder T�rbeschlag");
	}
}
