package Singleton;

public class Singleton {
	/** Constructeur priv� */
	private Singleton(){
		
	}
	/** Instance unique pr�-initialis�e */
	private static Singleton INSTANCE = new Singleton();
 
	/** Point d'acc�s pour l'instance unique du singleton */
	public static Singleton getInstance()
	{	return INSTANCE;
	}
}
