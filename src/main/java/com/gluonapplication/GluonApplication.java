package com.gluonapplication;
	
import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Rectangle2D;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class GluonApplication extends Application {
	calculator cal;
	@Override
	public void start(Stage primaryStage) {
		
		
	    cal=new calculator();
		cal.draw();
		//Application.setUserAgentStylesheet(getClass().getResource("app.css").toExternalForm());
		/*new Thread(() -> { // lambda expression
			try{
			while(true) {
		
			  Platform.runLater(() ->cal.run_cal()); // lambda exp
			Thread.sleep(200);
			}
			}
			catch(InterruptedException ex) {
			}
			}).start();
		*/
		cal.run_cal();
		try {
/*
	        Rectangle2D visualBounds = Screen.getPrimary().getVisualBounds();
	        Scene scene = new Scene(cal.c.calUI, visualBounds.getWidth(), visualBounds.getHeight());
			Scene scene = new Scene(cal.c.calUI,300,300);
	        scene.setUserAgentStylesheet("app3.css");*/
			
			cal.c.scene.setUserAgentStylesheet("app5.css");
			primaryStage.setScene(cal.c.scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
