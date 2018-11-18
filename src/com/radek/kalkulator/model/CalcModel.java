package com.radek.kalkulator.model;

import java.util.List;

import com.radek.kalkulator.AppendException;
import com.radek.kalkulator.CalculateException;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import jdk.jshell.JShell;
import jdk.jshell.SnippetEvent;

/**
 * Klasa implementujaca model we wzorcu MVC. Zarzadza danymi i odpowiada za
 * wykonywanie obliczen przez kalkulator.
 * 
 * @author Radoslaw Tuzimek
 * @version 1.0
 */

public class CalcModel {

	private StringProperty operation;
	private JShell jshell;
	private Boolean isSecoundOperator;
	private Boolean isDot;
	private Boolean isNumber;
	private Boolean wasResult;

	/**
	 * Konstruktor bezparametrowy. Ustawia wszystkie zmienne i zmienne pomocnicze na
	 * domyslne poczatkowe wartosci.
	 */
	public CalcModel() {
		operation = new SimpleStringProperty("");
		isSecoundOperator = false;
		isDot = false;
		isNumber = false;
		wasResult = false;
	}

	/**
	 * Metoda odpowiadajaca za operacje arytmetyczne przez jshell.
	 * 
	 * @param command parametr w ktorym zapisane jest dzialanie do wykonania.
	 * @return zwraca wartosc wykonanego dzialania lub ERROR jesli wykonanie
	 *         dzialania nie powiodlo siê.
	 */
	private String eval(String command) {
		String ret = "ERROR";
		try {
			List<SnippetEvent> events = jshell.eval(command);
			for (SnippetEvent e : events) {
				if (e.causeSnippet() == null) {
					switch (e.status()) {
					case VALID:
						if (e.value() != null) {
							ret = e.value();
						} else {
							ret = "NULL";
						}
					default:
						break;
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
		return ret;
	}

	/**
	 * Metoda ktora odpowiada za uruchomienie procesu obliczen. Najpierw metoda
	 * konwertuje dane wpisane przez uzytkownika na odpowiednie do wykonania
	 * obliczen, a nastepnie wywoluje metodê eval ktora wykonuje operacje
	 * arytmetyczne. Po wykonanych obliczeniach wynik wpisywany jest do pola
	 * operation.
	 * 
	 * @throws CalculateException w przypadku niepowodzenia obliczen metoda rzuca
	 *                            wyjatek blad w skladni operacji.
	 */
	public void calculate() throws CalculateException {
		wasResult = true;
		String pom = operation.getValue();
		String remake = "";
		isDot = false;
		isNumber = false;

		for (int i = 0; i < pom.length(); i++) {
			if (i == 0
					&& (pom.charAt(i) == '+' || pom.charAt(i) == '-' || pom.charAt(i) == '/' || pom.charAt(i) == '*')) {
				remake += "0.0";
				;
				remake += pom.charAt(i);
			} else {
				if (i == (pom.length() - 1)) {
					remake += pom.charAt(i);
					if (isNumber && !isDot && pom.charAt(0) != 'f') {
						remake += ".0";
					} else if (!isDot && (pom.charAt(i) == '0' || pom.charAt(i) == '1' || pom.charAt(i) == '2'
							|| pom.charAt(i) == '3' || pom.charAt(i) == '4' || pom.charAt(i) == '5'
							|| pom.charAt(i) == '6' || pom.charAt(i) == '7' || pom.charAt(i) == '8'
							|| pom.charAt(i) == '9')) {
						remake += ".0";
					}
				} else {
					if (pom.charAt(i) == '.') {
						isDot = true;
						remake += ".";
					} else {
						if (pom.charAt(i) == '+' || pom.charAt(i) == '-' || pom.charAt(i) == '/' || pom.charAt(i) == '*'
								|| pom.charAt(i) == '=') {
							if (isNumber && !isDot) {
								remake += ".0";
							}
							isDot = false;
							isNumber = false;
							remake += pom.charAt(i);
						} else {
							if (pom.charAt(i) == '0' || pom.charAt(i) == '1' || pom.charAt(i) == '2'
									|| pom.charAt(i) == '3' || pom.charAt(i) == '4' || pom.charAt(i) == '5'
									|| pom.charAt(i) == '6' || pom.charAt(i) == '7' || pom.charAt(i) == '8'
									|| pom.charAt(i) == '9') {
								isNumber = true;
								remake += pom.charAt(i);
							} else {
								remake += pom.charAt(i);
							}
						}
					}
				}
			}
		}

		isDot = true;
		isNumber = false;

		operation.setValue(remake);

		operation.setValue(eval(operation.getValue()));

		if (eval(operation.getValue()) == "ERROR") {
			throw new CalculateException("B³¹d w sk³adni operacji!");
		}

	}

	/**
	 * Metoda typu set pozwalajaca na ustawienie pola operation.
	 * 
	 * @param value pole operation zostanie ustawione na wartosc tego parametru.
	 */
	public void setOperation(String value) {
		this.operation.setValue(value);
	}

	/**
	 * Metoda czyszcz¹ca wartosc pola operation i pomocniczych zmiennych.
	 */
	public void clearOperation() {
		operation = new SimpleStringProperty("");
		isSecoundOperator = false;
		isDot = false;
		wasResult = false;
		this.operation.setValue("");
	}

	/**
	 * Metoda dodajaca symbole do pola operation. Pozwala na tworzenie dzialania
	 * poprzez pojedyncze dodawanie symboli (cyfr, operatorow arytmetycznych).
	 * Sprawdza poprawnosc ich wprowadzania, jesli symbol jest poprawny to dodaje
	 * go, a jesli nie to zg³asza wyj¹tek.
	 * 
	 * @param symbol symbol, ktory uzytkownik chce dodac do dzialania.
	 * @throws AppendException metoda zglasza wyjatek kiedy dodawany symbol jest nie
	 *                         poprawny np. kiedy uzytkownik probuje dodac wiecej
	 *                         niz jedna kropke w liczbie.
	 */
	public void appendSymbol(String symbol) throws AppendException {
		if (!isSecoundOperator && wasResult
				&& (symbol == "0" || symbol == "1" || symbol == "2" || symbol == "3" || symbol == "4" || symbol == "5"
						|| symbol == "6" || symbol == "7" || symbol == "8" || symbol == "9")) {
			clearOperation();
		}
		wasResult = false;
		if (symbol == ".") {
			if (!isDot) {
				isDot = true;
			} else {
				symbol = "";
				throw new AppendException("Niedopuszczalne powtórzenie kropki w liczbie");
			}
		}

		if (symbol == "=") {
			symbol = "";
			isSecoundOperator = false;
		}

		if (symbol == "+" || symbol == "-" || symbol == "/" || symbol == "*") {

			isDot = false;

			if (isSecoundOperator) {
				try {
					calculate();
				} catch (CalculateException e) {
					operation.setValue("");
					javafx.scene.control.Alert alert = new Alert(AlertType.ERROR);
					alert.setTitle("Alert");
					alert.setContentText("B³¹d w sk³adni operacji!");
					alert.showAndWait();
				}
			} else {
				isSecoundOperator = true;
			}
		}
		operation.setValue(operation.getValue() + symbol);
	}

	/**
	 * Metoda umozliwiajaca odczytanie pola operation (np. w celu odczytaniu wyniku
	 * dzialania).
	 * 
	 * @return zwraca stringa bed¹cego odczytaniem pola operation.
	 */
	public String readOperation() {
		return operation.getValue();
	}

	/**
	 * Metoda przypisujaca obiekt JShell. Dodaje mu mozliwosc liczenia silni.
	 * 
	 * @param jshell stworzony wczesniej jshell
	 */
	public void setJShell(JShell jshell) {
		this.jshell = jshell;
		eval("double factorial(double num) {\r\n" + "if (num==1)\r\n" + "return 1;\r\n" + "else\r\n"
				+ "return num * factorial(num - 1);\r\n" + "}\r\n");
	}
}