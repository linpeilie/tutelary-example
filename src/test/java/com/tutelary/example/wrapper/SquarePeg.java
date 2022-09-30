package com.tutelary.example.wrapper;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 方钉
 */
@AllArgsConstructor
@Getter
public class SquarePeg {

    private double width;

    public double getSquare() {
        return Math.pow(this.width, 2);
    }

}
