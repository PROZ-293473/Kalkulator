package com.radek.kalkulator;

import java.io.IOException;

/**
 * Klasa wyjatkow, odpowiada za wyjatki zwiazane z obliczeniami kalkulatora.
 * Wyjatki tej klasy wystepuj¹ gdy obliczenia wprowadzone do kalkulatora sa
 * arytmetycznie niepoprawne (np. dzielenie przez 0) lub w innych przypadkach
 * powoduj¹cych problemy z wykonaniem dzialania.
 * 
 * @author Radoslaw Tuzimek
 * @version 1.0
 */

public class CalculateException extends IOException {

	/**
	 * domyslny identyfikator wersji
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Konstruktor bezparametrowy.
	 */
	public CalculateException() {
	}

	/**
	 * Konstruktor z parametrem.
	 * 
	 * @param gripe opis wyj¹tku.
	 */
	public CalculateException(String gripe) {
		super(gripe);
	}

}