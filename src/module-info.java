/**
 * @author Radoslaw Tuzimek
 * @version 1.0
 */
module com.radek.kalkulator {
	requires transitive javafx.controls;
	requires jdk.jshell;
	requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.base;

	exports com.radek.kalkulator;
	exports com.radek.kalkulator.view;
	exports com.radek.kalkulator.model;

}