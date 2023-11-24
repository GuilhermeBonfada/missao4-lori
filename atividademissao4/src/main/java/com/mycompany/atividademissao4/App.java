package com.mycompany.atividademissao4;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws Exception {
        StackPane root = new StackPane();
        VBox container = new VBox(10); // Espaçamento vertical entre os elementos
        Button alertButton = new Button("Clique-me");
        Text paragraph1 = new Text("Bem-vindo ao site da unijui.");
        paragraph1.setFill(Color.BLUE);
        Text paragraph2 = new Text("Esse e o meu site.");
        paragraph2.setFill(Color.GREEN);
        Text paragraph3 = new Text("Essa parte não poderia faltar.");
        paragraph3.setFill(Color.PURPLE);

        Image image = new Image("https://www.unijui.edu.br/images/stories/manual_identidade/marcas/download.php?arquivo=marca.png");

        // Criar a ImageView com a imagem
        ImageView imageView = new ImageView(image);

        // Configurar o tamanho desejado para a ImageView
        double desiredWidth = 300; // Largura desejada
        double desiredHeight = 300; // Altura desejada
        imageView.setFitWidth(desiredWidth);
        imageView.setFitHeight(desiredHeight);

        alertButton.setOnAction(e -> showAlert());

        container.getChildren().addAll(paragraph1, paragraph2, alertButton, paragraph3, imageView);
        container.setAlignment(Pos.CENTER);
        StackPane.setAlignment(container, Pos.CENTER);

        root.getChildren().add(container);

        scene = new Scene(root, 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    private void showAlert() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Alerta");
        alert.setHeaderText(null);
        alert.setContentText("Você clicou no botão!");
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch();
    }
}
