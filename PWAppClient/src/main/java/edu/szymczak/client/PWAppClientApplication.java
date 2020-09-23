package edu.szymczak.client;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.IOException;

@SpringBootApplication
public class PWAppClientApplication extends Application {

    private ConfigurableApplicationContext springContext;

    @Override
    public void start(Stage stage) throws IOException {
        Parent root =  FXMLLoader.load(getClass().getResource("/ClientLoginView.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void init() {
        springContext = SpringApplication.run(PWAppClientApplication.class);
    }

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void stop() {
        springContext.stop();
    }
}