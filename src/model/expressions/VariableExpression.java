package model.expressions;

import model.utils.Dictionary;
import model.utils.IHeap;

public class VariableExpression implements Expression {
    private String variable;

    public VariableExpression (String variable) {
        this.variable = variable;
    }

    @Override
    public int evaluate (Dictionary<String, Integer> symbolTable, IHeap<Integer> heap) {
        return symbolTable.get(variable);
    }

    @Override
    public String toString() {
        return variable;
    }
}
