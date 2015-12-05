package com.starterkit.javafx;

import java.util.Locale;
import java.util.ResourceBundle;

import com.starterkit.javafx.controller.ImageViewerController;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Startup extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		String langCode = getParameters().getNamed().get("lang");
		if (langCode != null && !langCode.isEmpty()) {
			Locale.setDefault(Locale.forLanguageTag(langCode));
		}
		primaryStage.setTitle("Image Viewer");
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/starterkit/javafx/view/image-viewer.fxml"),
				ResourceBundle.getBundle("com/starterkit/javafx/bundle/base"));
		Parent root = loader.load();
		ImageViewerController controller = loader.getController();
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("/com/starterkit/javafx/css/standard.css").toExternalForm());
		controller.setStage(scene);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
