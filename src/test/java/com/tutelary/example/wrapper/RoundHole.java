package com.tutelary.example.wrapper;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 圆孔
 */
@AllArgsConstructor
@Getter
public class RoundHole {

    private double radius;

    public boolean fits(RoundPeg peg) {
        return this.getRadius() >= peg.getRadius();
    }

}
