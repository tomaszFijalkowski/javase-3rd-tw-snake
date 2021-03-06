package com.codecool.snake;

import com.codecool.snake.entities.GameEntity;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.layout.Pane;

class Score extends GameEntity {

    private Text scoreText = new Text();

    Score(Pane pane, boolean isFinalScore) {
        super(pane);
        scoreText.setX(Globals.SCORE_TEXT_X);
        scoreText.setY(Globals.SCORE_TEXT_Y);
        scoreText.setFont(Font.font("courier", FontWeight.BOLD, FontPosture.REGULAR, 40));
        if (isFinalScore) {
            scoreText.setFill(Color.WHITE);
        } else {
            scoreText.setFill(Color.BLACK);
        }
        upgradeText();
        pane.getChildren().add(scoreText);
    }

    void upgradeText(){
        scoreText.setText("SCORE: " + Globals.score);
    }
}
