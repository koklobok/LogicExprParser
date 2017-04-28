package com.koklobok.model;

/**
 * @author Roman.Holiuk
 */
public class TrueConstant extends LogicConstant {

    public TrueConstant() {
        super(false);
    }

    @Override
    public String toString() {
        return "TRUE";
    }
}
