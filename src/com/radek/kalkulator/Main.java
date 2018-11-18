package com.radek.kalkulator;

import javafx.application.Application;
//import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.*;

/**
 * Klasa main implementuj¹ca glowny program aplikacji.
 * 
 * @author Radoslaw Tuzimek
 * @version 1.0
 */

public class Main extends Application {
	/**
	 * Metoda start otwiera glowne okno aplikacji.
	 */
	@Override
	public void start(Stage stage) {
		try {
			ViewLoader<Parent, Object> viewLoader = new ViewLoader<Parent, Object>("view/Calc.fxml");
			Parent root = viewLoader.getElement();

			stage.initStyle(StageStyle.TRANSPARENT);

			if (root != null) {
				Scene scene = new Scene(root);
				scene.setFill(Color.TRANSPARENT);
				stage.setScene(scene);
			}

			stage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Metoda main, rozpoczyna program.
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
