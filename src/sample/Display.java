package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;



public class Display{
    Controller controller;

    public Scene model(){
        controller = new Controller();
        Label label = new Label(" ");
        label.setStyle("-fx-background-color:IVORY");
        GridPane gridPane = new GridPane();
        BorderPane borderPane = new BorderPane();
        label.setAlignment(Pos.CENTER);
        label.setPrefSize(200,30);
        HBox hBoxLabel = new HBox();
        hBoxLabel.getChildren().add(label);
        HBox hBox0 = new HBox(10);
        Button clear = new Button("A/C");
        clear.setPrefSize(40, 40);
        clear.setStyle("-fx-background-color:KHAKI");
        Button negative = new Button("+/-");
        negative.setStyle("-fx-background-color:KHAKI");
        negative.setPrefSize(40, 40);
        Button exponent = new Button("^");
        exponent.setPrefSize(40, 40);
        exponent.setStyle("-fx-background-color:GOLD");
        Button division = new Button("/");
        division.setStyle("-fx-background-color:GOLD");
        division.setPrefSize(40, 40);
        hBox0.getChildren().addAll(clear, negative, exponent, division);
        HBox hBox1 = new HBox(10);
        Button seven = new Button("7");
        seven.setPrefSize(40, 40);
        Button eight = new Button("8");
        eight.setPrefSize(40, 40);
        Button nine = new Button("9");
        nine.setPrefSize(40, 40);
        Button multiply = new Button("*");
        multiply.setStyle("-fx-background-color:GOLD");
        multiply.setPrefSize(40, 40);
        hBox1.getChildren().addAll(seven, eight, nine, multiply);
        HBox hBox2 = new HBox(10);
        Button four = new Button("4");
        four.setPrefSize(40, 40);
        Button five = new Button("5");
        five.setPrefSize(40, 40);
        Button six = new Button("6");
        six.setPrefSize(40, 40);
        Button minus = new Button("-");
        minus.setStyle("-fx-background-color:GOLD");
        minus.setPrefSize(40, 40);
        hBox2.getChildren().addAll(four, five, six, minus);
        HBox hBox3 = new HBox(10);
        Button one = new Button("1");
        one.setPrefSize(40, 40);
        Button two = new Button("2");
        two.setPrefSize(40, 40);
        Button three = new Button("3");
        three.setPrefSize(40, 40);
        Button plus = new Button("+");
        plus.setStyle("-fx-background-color:GOLD");
        plus.setPrefSize(40, 40);
        hBox3.getChildren().addAll(one, two, three, plus);
        HBox hBox4 = new HBox(10);
        Button zero = new Button("0");
        zero.setPrefSize(90, 40);
        Button decimal = new Button(".");
        decimal.setStyle("-fx-background-color:GOLD");
        decimal.setPrefSize(40, 40);
        Button equals = new Button("=");
        equals.setStyle("-fx-background-color:GOLD");
        equals.setPrefSize(40, 40);
        hBox4.getChildren().addAll(zero, decimal, equals);
        gridPane.add(hBox0, 0, 0);
        gridPane.add(hBox1, 0, 1);
        gridPane.add(hBox2, 0, 2);
        gridPane.add(hBox3, 0, 3);
        gridPane.add(hBox4, 0, 4);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets (10, 55, 10, 55));
        gridPane.setStyle("-fx-background-color:TRANSPARENT");
        borderPane.setCenter(gridPane);
        borderPane.setTop(hBoxLabel);
        Insets insets= new Insets(20, 50, 10, 50);
        BorderPane.setMargin(hBoxLabel, insets);
        borderPane.setStyle("-fx-background-color:BLACK");
        StackPane root = new StackPane();
        root.getChildren().add(borderPane);
        Scene scene = new Scene(root, 300, 330);
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String number = ((Button) event.getSource()).getText();
                label.setText(label.getText()+number);
            }
        };
        zero.setOnAction(event);
        one.setOnAction(event);
        two.setOnAction(event);
        three.setOnAction(event);
        four.setOnAction(event);
        five.setOnAction(event);
        six.setOnAction(event);
        seven.setOnAction(event);
        eight.setOnAction(event);
        nine.setOnAction(event);
        decimal.setOnAction(event);
        clear.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent e){
                label.setText("");
            }
        });
        negative.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                double tempNum = Double.parseDouble(label.getText());
                double number = 0 - tempNum;
                label.setText(Double.toString(number));

            }
        });
        exponent.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                double number1 = Double.parseDouble(label.getText());
                controller.setNum1(number1);
                label.setText("");
                controller.setOp("^");
            }
        });
        equals.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                double number2= Double.parseDouble(label.getText());
                controller.setNum2(number2);
                controller.math();
                label.setText(Double.toString(controller.getResult()));

            }
        });
        division.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                double number1 = Double.parseDouble(label.getText());
                controller.setNum1(number1);
                label.setText("");
                controller.setOp("/");
            }
        });
        multiply.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                double number1 = Double.parseDouble(label.getText());
                controller.setNum1(number1);
                label.setText("");
                controller.setOp("*");
            }
        });
        minus.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                double number1 = Double.parseDouble(label.getText());
                controller.setNum1(number1);
                label.setText("");
                controller.setOp("-");
            }
        });
        plus.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                double number1 = Double.parseDouble(label.getText());
                controller.setNum1(number1);
                label.setText("");
                controller.setOp("+");

            }
        });

        return scene;


    }


    }




