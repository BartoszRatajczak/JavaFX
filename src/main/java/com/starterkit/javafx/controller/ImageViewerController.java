package com.starterkit.javafx.controller;

import java.io.File;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.DirectoryChooser;

public class ImageViewerController {

	@FXML
	private ResourceBundle resources;

	@FXML
	private TextField pathField;

	@FXML
	private Button browseButton;

	@FXML
	private Button leftButton;

	@FXML
	private Button rightButton;

	@FXML
	private Button slideshowButton;

	@FXML
	private Button minButton;

	@FXML
	private Button maxButton;

	private Scene scene;

	public ImageViewerController() {

	}

	@FXML
	private void initialize() {

	}

	@FXML
	private void browseButtonAction(ActionEvent event) {
		DirectoryChooser directoryChooser = new DirectoryChooser();
		File selectedDirectory = directoryChooser.showDialog(scene.getWindow());
		pathField.setText(selectedDirectory.getAbsolutePath());
	}

	public void setStage(Scene scene) {
		this.scene = scene;
	}
}
