import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class InterfaceExample extends Application {

    @Override
    public void start(Stage stage) {
        VBox leftSide = new VBox();
        leftSide.setSpacing(10); // Ajustar el espaciado entre los elementos

        for (int i = 0; i < 8; i++) {
            HBox hbox = new HBox();
            hbox.setSpacing(5); // Espaciado entre la imagen y el TextField

            // Crear y configurar la imagen
            ImageView imageView = new ImageView(new Image("usuario.png"));
            // Cambia "file:image.png" por la ruta de tu imagen
            imageView.setFitWidth(30); // Ancho de la imagen (ajustado a 30)
            imageView.setFitHeight(30); // Altura de la imagen (ajustado a 30)

            // Crear y configurar el TextField
            TextField textField = new TextField();
            textField.setPromptText("Nombre y apellido");

            // Agregar la imagen y el TextField al HBox
            hbox.getChildren().addAll(imageView, textField);

            // Agregar el HBox al VBox
            leftSide.getChildren().add(hbox);
        }

        ListView<String> listView = new ListView<>();
        listView.setPrefHeight(300); // Establecer la altura preferida del ListView
        listView.setPrefWidth(200);
        VBox rightSide = new VBox(listView);

        TextField bottomTextField = new TextField();
        bottomTextField.setPrefWidth(420); // Establecer el ancho preferido del último TextField

        AnchorPane root = new AnchorPane(leftSide, rightSide, bottomTextField);

        // Establecer las restricciones de anclaje para cada nodo
        AnchorPane.setLeftAnchor(leftSide, 10.0);
        AnchorPane.setTopAnchor(leftSide, 10.0);

        AnchorPane.setRightAnchor(rightSide, 10.0);
        AnchorPane.setTopAnchor(rightSide, 10.0);

        AnchorPane.setLeftAnchor(bottomTextField, 10.0);
        AnchorPane.setBottomAnchor(bottomTextField, 10.0);

        // Establecer el color de fondo de la escena a gris
        root.setStyle("-fx-background-color: #f0f1f0;");

        Scene scene = new Scene(root, 600, 400);

        stage.setTitle("Interface Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
