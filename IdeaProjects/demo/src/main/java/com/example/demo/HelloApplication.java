package com.example.demo;

import javafx.application.Application;
//import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

//import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primarystage)  {
//        create a label and some button
        Label l6 =new Label();
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Label  label = new Label("This My Button  ");
        label.setStyle("-fx-color:blue;-fx-background-color:gray;-fx-font-size:10pt");
        Button button = new Button("Button ");
        button.setStyle("-fx-background-color:green;-fx-font-size:10pt");
        Button button1 = new Button("Button 1");
        button1.setStyle("-fx-color:red;-fx-font-size:10pt");
//        create RadioButton
        RadioButton radioButton = new RadioButton("choice option 1");
        RadioButton radioButton1 = new RadioButton("choice option 2");

        radioButton1.setSelected(true);
//        we use inline css
        radioButton.setStyle("-fx-background-color:red;-fx-font-size:10pt");
        radioButton1.setStyle("-fx-background-color:green;-fx-font-size:10pt");

//        create ToggleGroup
        ToggleGroup radiogroup = new ToggleGroup();
//        add the RadioButton to Toggle group
        radioButton.setToggleGroup(radiogroup);
        radioButton1.setToggleGroup(radiogroup);

//        create the checkbox
        CheckBox checkBox = new CheckBox("Dooro Mid Ama wixii Kabadan");
        CheckBox checkBox1 = new CheckBox("Dooro Mid Ama wixii Kabadan");
        checkBox.setSelected(true);
//................................................................................
//        create listview
        ListView <String> peopleList = new ListView<>();

//        adding size
        peopleList.setPrefSize(120,100);
//        add items to the listview
        peopleList.getItems().addAll(
            "Abdulkadir Ahmed ","Mushtaq","Nafi-so","Mohamed","Ali","Geedi"

        );
//        create the combBox
        ComboBox <String> comboBox = new ComboBox<>();
//        aad items to combBox
        comboBox.getItems().addAll(

                "Maymuun ","Abdi","Shafici","Abdishakuur","Mohiadin","Abdulkadir "

        );
        comboBox.setEditable(true);
        comboBox.getItems().addAll(
                "Daahir ","Muno"
        );







        comboBox.setOnAction(actionEvent ->{
//          write here what you want for you
            String selected = comboBox.getValue();
           l6.setText(selected);

        } );


//        String selected =comboBox.getValue();

//create slider control
        Slider slider = new Slider(.05,.8,50);
//create textArea
        TextArea textArea =new TextArea("Write here Want you want to write ");
        textArea.setPrefColumnCount(20);
        textArea.setPrefRowCount(30);
        textArea.setWrapText(true);
//       create filechooser
        FileChooser f = new FileChooser();




//        put the controls in Hbox
        HBox hBox = new HBox(10 ,label ,button,button1,radioButton,radioButton1,checkBox,checkBox1,l6, peopleList,comboBox,slider
        ,textArea);
        hBox.setAlignment(Pos.CENTER);
        hBox.setPadding(new Insets(10));
        File file = new File("src/main/java/com/example/demo/demo.css");

        Scene scene = new Scene(hBox);
        primarystage.setTitle("Practice Test!");
        primarystage.setScene(scene);
        primarystage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}