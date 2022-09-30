package com.tutelary.example.wrapper;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SquarePegAdapter extends RoundPeg {

    private SquarePeg peg;

    @Override
    public double getRadius() {
        return (Math.sqrt(Math.pow(peg.getWidth() / 2, 2) * 2));
    }
}
