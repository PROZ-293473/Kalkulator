package com.radek.kalkulator;

import java.io.IOException;

/**
 * Klasa wyjatkow, odpowiada za wyjatki zwiazane z obliczeniami kalkulatora.
 * Wyjatki tej klasy wystepują gdy obliczenia wprowadzone do kalkulatora sa
 * arytmetycznie niepoprawne (np. dzielenie przez 0) lub w innych przypadkach
 * powodujących problemy z wykonaniem dzialania.
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
	 * @param gripe opis wyjątku.
	 */
	public CalculateException(String gripe) {
		super(gripe);
	}

}