package com.radek.kalkulator;

import java.io.IOException;

/**
 * Klasa wyjatkow, odpowiada za wyjatki zwiazane z wpisywaniem operacji do
 * kalkulatora. Wyjatki tej klasy wystepuj¹ przy skladniowo blednym wpisywaniu
 * dzialan do kalkulatora, np. jesli uzytkownik wpisuje liczbe ktora zawiera
 * dwie kropki (np. 1.23.45).
 * 
 * @author Radoslaw Tuzimek
 * @version 1.0
 */

public class AppendException extends IOException {

	/**
	 * domyœlny identyfikator wersji
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Konstruktor bezparametrowy.
	 */
	public AppendException() {
	}

	/**
	 * Konstruktor z parametrem.
	 * 
	 * @param gripe opis wyj¹tku.
	 */
	public AppendException(String gripe) {
		super(gripe);
	}

}
