package ru.mirea.students;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
      //  Parent content = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Group group = new Group();



        Scene scene=new Scene(group,1000,500);

        primaryStage.setScene(scene);
        primaryStage.show();



        TextField txt=new TextField();
        BorderPane mainPane=new BorderPane();
        VBox stolb =new VBox();
        stolb.setSpacing(5);
        mainPane.setMinHeight(300);
        mainPane.setMinWidth(300);
        stolb.setMinHeight(50);
        stolb.setMinWidth(50);
        stolb.setMaxHeight(100);
        stolb.setMaxWidth(100);
        mainPane.setCenter(stolb);



        Button btn=new Button("Нажми меня");
        Text searchResult=new Text("-");
        Text who=new Text("Введите фамилию:");

        stolb.getChildren().addAll(who,txt,btn,searchResult);
        stolb.setSpacing(5);

        Student [] students=new Student[]{
                new Student("Butur",-1),
                new Student("Sheva",4.5),
                new Student("Zurich",3),
                new Student("Shotich",4.5),
                new Student("Michalich",5)
        };

        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String t=txt.getText();
                for (int i = 0; i <students.length; i++) {
                    if(t.equals(students[i].name)) {
                        searchResult.setText("Найден: "+ students[i].name);
                        return;
                    }
                }

                searchResult.setText("Не найден");
            }
        });




        group.getChildren().addAll(mainPane);




    }



    public static void main(String[] args) {
        launch(args);
    }
}
