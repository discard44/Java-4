/*
    Max Perrigo
    James chen 1410
    version 1.0
    Bouncing Balls HW3
*/
package bouncingballs;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

  class Ball extends Circle {
    public double dx = Math.random(), dy = Math.random();//creates the directions the balls are traveling

    Ball(double x, double y, double radius, Color color) {
      super(x, y, radius);
      setFill(color); // Sets ball color
    }
  }