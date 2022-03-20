package effective.java.effectivejava.item42.code;

import lombok.Getter;

@Getter
public enum OperationImpl {
    PLUS("+", Double::sum),
    MINUS("-", (x, y) -> x - y);

    private String symbol;
    private Operation operation;

    OperationImpl(String symbol, Operation operation) {
        this.symbol = symbol;
        this.operation = operation;
    }

    public double apply(double x, double y) {
        return operation.apply(x, y);
    }
}
