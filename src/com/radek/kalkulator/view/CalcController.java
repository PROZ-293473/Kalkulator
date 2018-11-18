package com.radek.kalkulator.view;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

import com.radek.kalkulator.AppendException;
import com.radek.kalkulator.CalculateException;
import com.radek.kalkulator.model.CalcModel;

//import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
//import javafx.scene.Scene;
import javafx.scene.control.TextField;
import jdk.jshell.JShell;

/**
 * Klasa implementujaca kontroler we wzorcu MVC. Implementuje interfejs
 * uzytkownika, odbiera polecenia, konwertuje i przekazuje do modelu lub widoku.
 * 
 * @author Radoslaw Tuzimek
 * @version 1.0
 */

public class CalcController implements Initializable {

	private CalcModel model;

	@FXML
	public TextField tfWys;

	/**
	 * Metoda reagujaca na wcisniecie przycisku "0" na klawiaturze kalkulatora przez
	 * uzytkownika. Przekazuje wcisniety symbol do modelu, aby ten dodal go do pola
	 * operation. Jesli wystapi blad podczas jego dodawania uzytkownik zostanie o
	 * tym poinformowany odpowiednim komunikatem. Nastepnie wyswietla dotychczasowo
	 * wprowdzony ciag symboli na wyswietlaczu.
	 */
	@FXML
	public void click_button0() {
		try {

			model.appendSymbol("0");

		} catch (AppendException e) {
			javafx.scene.control.Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Alert");
			alert.setContentText("Niepowodzenie we wprowadzaniu znaku!");
			alert.showAndWait();
		}

		tfWys.setText(model.readOperation());
	}

	/**
	 * Metoda reagujaca na wcisniecie przycisku "1" na klawiaturze kalkulatora przez
	 * uzytkownika. Przekazuje wcisniety symbol do modelu, aby ten dodal go do pola
	 * operation. Jesli wystapi blad podczas jego dodawania uzytkownik zostanie o
	 * tym poinformowany odpowiednim komunikatem. Nastepnie wyswietla dotychczasowo
	 * wprowdzony ciag symboli na wyswietlaczu.
	 */
	@FXML
	public void click_button1() {
		try {

			model.appendSymbol("1");

		} catch (AppendException e) {
			javafx.scene.control.Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Alert");
			alert.setContentText("Niepowodzenie we wprowadzaniu znaku!");
			alert.showAndWait();
		}

		tfWys.setText(model.readOperation());
	}

	/**
	 * Metoda reagujaca na wcisniecie przycisku "2" na klawiaturze kalkulatora przez
	 * uzytkownika. Przekazuje wcisniety symbol do modelu, aby ten dodal go do pola
	 * operation. Jesli wystapi blad podczas jego dodawania uzytkownik zostanie o
	 * tym poinformowany odpowiednim komunikatem. Nastepnie wyswietla dotychczasowo
	 * wprowdzony ciag symboli na wyswietlaczu.
	 */
	@FXML
	public void click_button2() {
		try {

			model.appendSymbol("2");

		} catch (AppendException e) {
			javafx.scene.control.Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Alert");
			alert.setContentText("Niepowodzenie we wprowadzaniu znaku!");
			alert.showAndWait();
		}

		tfWys.setText(model.readOperation());
	}

	/**
	 * Metoda reagujaca na wcisniecie przycisku "3" na klawiaturze kalkulatora przez
	 * uzytkownika. Przekazuje wcisniety symbol do modelu, aby ten dodal go do pola
	 * operation. Jesli wystapi blad podczas jego dodawania uzytkownik zostanie o
	 * tym poinformowany odpowiednim komunikatem. Nastepnie wyswietla dotychczasowo
	 * wprowdzony ciag symboli na wyswietlaczu.
	 */
	@FXML
	public void click_button3() {
		try {

			model.appendSymbol("3");

		} catch (AppendException e) {
			javafx.scene.control.Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Alert");
			alert.setContentText("Niepowodzenie we wprowadzaniu znaku!");
			alert.showAndWait();
		}

		tfWys.setText(model.readOperation());
	}

	/**
	 * Metoda reagujaca na wcisniecie przycisku "4" na klawiaturze kalkulatora przez
	 * uzytkownika. Przekazuje wcisniety symbol do modelu, aby ten dodal go do pola
	 * operation. Jesli wystapi blad podczas jego dodawania uzytkownik zostanie o
	 * tym poinformowany odpowiednim komunikatem. Nastepnie wyswietla dotychczasowo
	 * wprowdzony ciag symboli na wyswietlaczu.
	 */
	@FXML
	public void click_button4() {
		try {

			model.appendSymbol("4");

		} catch (AppendException e) {
			javafx.scene.control.Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Alert");
			alert.setContentText("Niepowodzenie we wprowadzaniu znaku!");
			alert.showAndWait();
		}

		tfWys.setText(model.readOperation());
	}

	/**
	 * Metoda reagujaca na wcisniecie przycisku "5" na klawiaturze kalkulatora przez
	 * uzytkownika. Przekazuje wcisniety symbol do modelu, aby ten dodal go do pola
	 * operation. Jesli wystapi blad podczas jego dodawania uzytkownik zostanie o
	 * tym poinformowany odpowiednim komunikatem. Nastepnie wyswietla dotychczasowo
	 * wprowdzony ciag symboli na wyswietlaczu.
	 */
	@FXML
	public void click_button5() {
		try {
			model.appendSymbol("5");

		} catch (AppendException e) {
			javafx.scene.control.Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Alert");
			alert.setContentText("Niepowodzenie we wprowadzaniu znaku!");
			alert.showAndWait();
		}

		tfWys.setText(model.readOperation());
	}

	/**
	 * Metoda reagujaca na wcisniecie przycisku "6" na klawiaturze kalkulatora przez
	 * uzytkownika. Przekazuje wcisniety symbol do modelu, aby ten dodal go do pola
	 * operation. Jesli wystapi blad podczas jego dodawania uzytkownik zostanie o
	 * tym poinformowany odpowiednim komunikatem. Nastepnie wyswietla dotychczasowo
	 * wprowdzony ciag symboli na wyswietlaczu.
	 */
	@FXML
	public void click_button6() {
		try {

			model.appendSymbol("6");

		} catch (AppendException e) {
			javafx.scene.control.Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Alert");
			alert.setContentText("Niepowodzenie we wprowadzaniu znaku!");
			alert.showAndWait();
		}

		tfWys.setText(model.readOperation());
	}

	/**
	 * Metoda reagujaca na wcisniecie przycisku "7" na klawiaturze kalkulatora przez
	 * uzytkownika. Przekazuje wcisniety symbol do modelu, aby ten dodal go do pola
	 * operation. Jesli wystapi blad podczas jego dodawania uzytkownik zostanie o
	 * tym poinformowany odpowiednim komunikatem. Nastepnie wyswietla dotychczasowo
	 * wprowdzony ciag symboli na wyswietlaczu.
	 */
	@FXML
	public void click_button7() {
		try {

			model.appendSymbol("7");

		} catch (AppendException e) {
			javafx.scene.control.Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Alert");
			alert.setContentText("Niepowodzenie we wprowadzaniu znaku!");
			alert.showAndWait();
		}

		tfWys.setText(model.readOperation());
	}

	/**
	 * Metoda reagujaca na wcisniecie przycisku "8" na klawiaturze kalkulatora przez
	 * uzytkownika. Przekazuje wcisniety symbol do modelu, aby ten dodal go do pola
	 * operation. Jesli wystapi blad podczas jego dodawania uzytkownik zostanie o
	 * tym poinformowany odpowiednim komunikatem. Nastepnie wyswietla dotychczasowo
	 * wprowdzony ciag symboli na wyswietlaczu.
	 */
	@FXML
	public void click_button8() {
		try {

			model.appendSymbol("8");

		} catch (AppendException e) {
			javafx.scene.control.Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Alert");
			alert.setContentText("Niepowodzenie we wprowadzaniu znaku!");
			alert.showAndWait();
		}

		tfWys.setText(model.readOperation());
	}

	/**
	 * Metoda reagujaca na wcisniecie przycisku "9" na klawiaturze kalkulatora przez
	 * uzytkownika. Przekazuje wcisniety symbol do modelu, aby ten dodal go do pola
	 * operation. Jesli wystapi blad podczas jego dodawania uzytkownik zostanie o
	 * tym poinformowany odpowiednim komunikatem. Nastepnie wyswietla dotychczasowo
	 * wprowdzony ciag symboli na wyswietlaczu.
	 */
	@FXML
	public void click_button9() {
		try {

			model.appendSymbol("9");

		} catch (AppendException e) {
			javafx.scene.control.Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Alert");
			alert.setContentText("Niepowodzenie we wprowadzaniu znaku!");
			alert.showAndWait();
		}

		tfWys.setText(model.readOperation());
	}

	/**
	 * Metoda reagujaca na wcisniecie przycisku "." na klawiaturze kalkulatora przez
	 * uzytkownika. Przekazuje wcisniety symbol do modelu, aby ten dodal go do pola
	 * operation. Jesli wystapi blad podczas jego dodawania uzytkownik zostanie o
	 * tym poinformowany odpowiednim komunikatem. Nastepnie wyswietla dotychczasowo
	 * wprowdzony ciag symboli na wyswietlaczu.
	 */
	@FXML
	public void click_button_dot() {
		try {
			model.appendSymbol(".");
		} catch (AppendException e) {
			javafx.scene.control.Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Alert");
			alert.setContentText("Niedopuszczalne powtórzenie kropki w liczbie");
			alert.showAndWait();
		}
		tfWys.setText(model.readOperation());
	}

	/**
	 * Metoda reagujaca na wcisniecie przycisku "=" na klawiaturze kalkulatora przez
	 * uzytkownika. Przekazuje wcisniety symbol do modelu, aby ten dodal go do pola
	 * operation. Jesli wystapi blad podczas jego dodawania uzytkownik zostanie o
	 * tym poinformowany odpowiednim komunikatem. Nastepnie metoda nakazuje
	 * wykonanie obliczeń zapisanych w operation, jesli przy ich wykonywaniu
	 * wystapil blad urzytkownik zostanie o tym poinformowany odpowiednim
	 * komunikatem. w przeciwnym wypadku metoda wyswietli wynik na wyswietlaczu.
	 */
	@FXML
	public void click_button_result() {
		try {

			model.appendSymbol("=");

		} catch (AppendException e) {
			javafx.scene.control.Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Alert");
			alert.setContentText("Niepowodzenie we wprowadzaniu znaku!");
			alert.showAndWait();
		}
		try {

			model.calculate();

		} catch (CalculateException e) {
			model.setOperation("");
			javafx.scene.control.Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Alert");
			alert.setContentText("Blad w skladni operacji!");
			alert.showAndWait();
		}
		tfWys.setText(model.readOperation());
	}

	/**
	 * Metoda reagujaca na wcisniecie przycisku "+" na klawiaturze kalkulatora przez
	 * uzytkownika. Przekazuje wcisniety symbol do modelu, aby ten dodal go do pola
	 * operation. Jesli wystapi blad podczas jego dodawania uzytkownik zostanie o
	 * tym poinformowany odpowiednim komunikatem. Nastepnie wyswietla dotychczasowo
	 * wprowdzony ciag symboli na wyswietlaczu.
	 */
	@FXML
	public void click_button_plus() {
		try {

			model.appendSymbol("+");

		} catch (AppendException e) {
			javafx.scene.control.Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Alert");
			alert.setContentText("Niepowodzenie we wprowadzaniu znaku!");
			alert.showAndWait();
		}

		tfWys.setText(model.readOperation());
	}

	/**
	 * Metoda reagujaca na wcisniecie przycisku "-" na klawiaturze kalkulatora przez
	 * uzytkownika. Przekazuje wcisniety symbol do modelu, aby ten dodal go do pola
	 * operation. Jesli wystapi blad podczas jego dodawania uzytkownik zostanie o
	 * tym poinformowany odpowiednim komunikatem. Nastepnie wyswietla dotychczasowo
	 * wprowdzony ciag symboli na wyswietlaczu.
	 */
	@FXML
	public void click_button_minus() {
		try {

			model.appendSymbol("-");

		} catch (AppendException e) {
			javafx.scene.control.Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Alert");
			alert.setContentText("Niepowodzenie we wprowadzaniu znaku!");
			alert.showAndWait();
		}

		tfWys.setText(model.readOperation());
		;
	}

	/**
	 * Metoda reagujaca na wcisniecie przycisku "/" na klawiaturze kalkulatora przez
	 * uzytkownika. Przekazuje wcisniety symbol do modelu, aby ten dodal go do pola
	 * operation. Jesli wystapi blad podczas jego dodawania uzytkownik zostanie o
	 * tym poinformowany odpowiednim komunikatem. Nastepnie wyswietla dotychczasowo
	 * wprowdzony ciag symboli na wyswietlaczu.
	 */
	@FXML
	public void click_button_division() {
		try {

			model.appendSymbol("/");

		} catch (AppendException e) {
			javafx.scene.control.Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Alert");
			alert.setContentText("Niepowodzenie we wprowadzaniu znaku!");
			alert.showAndWait();
		}

		tfWys.setText(model.readOperation());
	}

	/**
	 * Metoda reagujaca na wcisniecie przycisku "*" na klawiaturze kalkulatora przez
	 * uzytkownika. Przekazuje wcisniety symbol do modelu, aby ten dodal go do pola
	 * operation. Jesli wystapi blad podczas jego dodawania uzytkownik zostanie o
	 * tym poinformowany odpowiednim komunikatem. Nastepnie wyswietla dotychczasowo
	 * wprowdzony ciag symboli na wyswietlaczu.
	 */
	@FXML
	public void click_button_multiplication() {
		try {

			model.appendSymbol("*");

		} catch (AppendException e) {
			javafx.scene.control.Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Alert");
			alert.setContentText("Niepowodzenie we wprowadzaniu znaku!");
			alert.showAndWait();
		}

		tfWys.setText(model.readOperation());
	}

	/**
	 * Metoda reagujaca na wcisniecie przycisku pierwiastka na klawiaturze
	 * kalkulatora przez uzytkownika. Konwertuje wyrazenie do odpowiedniej komendy
	 * do obliczenia pierwiastka przez jshell, a nastepnie nakazuje jego obliczenie.
	 * Jesli wystapi blad podczas jego obliczenia uzytkownik zostanie o tym
	 * poinformowany odpowiednim komunikatem. Nastepnie wyswietla wynik operacji.
	 */
	@FXML
	public void click_button_sqrt() {
		model.setOperation("Math.sqrt(" + model.readOperation() + ")");

		try {

			model.calculate();

		} catch (CalculateException e) {
			model.setOperation("");
			javafx.scene.control.Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Alert");
			alert.setContentText("Blad w argumencie pierwiastka!");
			alert.showAndWait();
		}

		tfWys.setText(model.readOperation());
	}

	/**
	 * Metoda reagujaca na wcisniecie przycisku "^2" na klawiaturze kalkulatora
	 * przez uzytkownika. Konwertuje wyrazenie do odpowiedniej komendy do obliczenia
	 * kwadratu przez jshell, a nastepnie nakazuje jego obliczenie. Jesli wystapi
	 * blad podczas jego obliczenia uzytkownik zostanie o tym poinformowany
	 * odpowiednim komunikatem. Nastepnie wyswietla wynik operacji.
	 */
	@FXML
	public void click_button_power() {
		model.setOperation("Math.pow(" + model.readOperation() + ",2)");
		try {

			model.calculate();

		} catch (CalculateException e) {
			model.setOperation("");
			javafx.scene.control.Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Alert");
			alert.setContentText("Blad w skladni operacji!");
			alert.showAndWait();
		}
		tfWys.setText(model.readOperation());
	}

	/**
	 * Metoda reagujaca na wcisniecie przycisku "!" na klawiaturze kalkulatora przez
	 * uzytkownika. Konwertuje wyrazenie do odpowiedniej komendy do obliczenia silni
	 * przez jshell, a nastepnie nakazuje jego obliczenie. Jesli wystapi blad
	 * podczas jego obliczenia uzytkownik zostanie o tym poinformowany odpowiednim
	 * komunikatem. Nastepnie wyswietla wynik operacji.
	 */
	@FXML
	public void click_button_factorial() {
		model.setOperation("factorial(" + model.readOperation() + ")");
		try {

			model.calculate();

		} catch (CalculateException e) {
			model.setOperation("");
			javafx.scene.control.Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Alert");
			alert.setContentText("Bledny lub za duzy argument silni!");
			alert.showAndWait();
		}
		tfWys.setText(model.readOperation());
	}

	/**
	 * Metoda reagujaca na wcisniecie przycisku "c" na klawiaturze kalkulatora przez
	 * uzytkownika. Usuwa wpisywane dzialania.
	 */
	@FXML
	public void click_button_delete() {
		model.clearOperation();
		tfWys.setText(model.readOperation());
	}

	/**
	 * Metoda zamykajaca program po nacisnieciu czerwonego guzika x
	 */
	@FXML
	public void exitCalculator() {
		System.exit(1);
	}

	/**
	 * Metoda tworzaca JShell przy wlaczaniu programu
	 */
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		this.model = new CalcModel();

		try {
			model.setJShell(JShell.create());
		} catch (Exception e) {
			javafx.scene.control.Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Alert");
			alert.setContentText(e.getMessage());
			alert.showAndWait();
			System.exit(1);
		}

	}

}
