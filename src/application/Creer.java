package application;
	
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;


public class Creer extends Application {
	@Override
	public void start(Stage primaryStage) {
		
			
			BorderPane root = new BorderPane();
			
			//entete
			
			// titre 
			Label label = new Label(" Creer un nouveau Kahoot!");

			//vbox sur la droite
			
			TextField nom  = new TextField(" Nom du kahoot "); 
			Label label1 = new Label(" Type de question ");
			
			//liste déroulante avec bouton :
			MenuButton m = new MenuButton("Option");
			m.getItems().addAll(
					new MenuItem("Quiz"),
					new MenuItem(" Vrai ou Faux "), 
					new MenuItem(" Diapo "));
			
			
			Label label2 = new Label(" Temps imparti ");
			
			MenuButton m1 = new MenuButton("Option");
			m1.getItems().addAll(
					new MenuItem(" 5 secondes "),
					new MenuItem(" 10 secondes "),
					new MenuItem(" 20 secondes "));
			
			Label label3 = new Label(" Points ");
			
			MenuButton m2 = new MenuButton("Option");
			m2.getItems().addAll(
					new MenuItem(" Standard "),
					new MenuItem(" Points doubles "),
					new MenuItem(" Aucun point "));
			
			Label label4 = new Label(" Themes ");
			
			MenuButton m3 = new MenuButton("Option");
			m3.getItems().addAll(
					new MenuItem(" Standard "),
					new MenuItem(" Summer "),
					new MenuItem(" Winter "));

			Button btnSupprimer = new Button(" Supprimer ");
			Button btnDupliquer = new Button(" Enregistrer ");
			
			// on le met à la verticale 
			VBox vbox = new VBox(10  , nom ,  label1 , m , label2 , m1 , label3 ,  m2 , label4 , m3, btnSupprimer , btnDupliquer);
			root.setRight(vbox);
			
			// au milieu 
			TextField txt = new TextField(" Ecrit ta question ");
			root.setLeft(txt);
			
			GridPane grid = new GridPane();
			
			TextField txt1 = new TextField("Ajouter reponse 1");
			TextField txt2 = new TextField("Ajouter reponse 2");
			TextField txt3 = new TextField("Ajouter reponse 3");
			TextField txt4 = new TextField("Ajouter reponse 4");
			
			grid.setAlignment(Pos.TOP_CENTER);
			
			grid.add(txt1, 0, 0);
			grid.add(txt2, 0, 1);
			grid.add(txt3, 1, 0);
			grid.add(txt4, 1, 1);
			
			root.setCenter(grid);
			
			root.setTop(label);
			
			Scene scene = new Scene(root,400,400);
			
			primaryStage.setTitle("Page creer ");
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} 
	
	public static void main(String[] args) {
		launch(args);
	}
}
