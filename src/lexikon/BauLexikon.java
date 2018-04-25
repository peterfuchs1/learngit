package lexikon;

import java.util.HashMap;

public class BauLexikon extends HashMap<String, String> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2842818991284787695L;

	public BauLexikon() {
		super();
		put("Türdrücker","Türschnalle");
		put("Zarge","Türstock");
		put("Fensterbank","Fensterbrett");
		put("Armierung","Bewehrung");
		put("Pfette","Balken im Dachstuhl");
		put("Sparren","Balken im Dachstuhl");
		put("Mauerbank","Balken im Dachstuhl");
		put("Stütze","Pfeiler");
		put("Überlager","Sturz");
		put("Halbolive","Fenster- oder Türbeschlag");
	}
}
