/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kencode.projects.calendar.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Vidurajith
 */
public class Main extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        AnchorPane root=FXMLLoader.load(getClass().getResource("/com/kencode/projects/calendar/view/InitiateView.fxml"));
        Scene newScene=new Scene(root);
        newScene.setFill(Color.TRANSPARENT);
        root.setBackground(Background.EMPTY);
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        primaryStage.setScene(newScene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        
        launch(args);
    }
    
}
