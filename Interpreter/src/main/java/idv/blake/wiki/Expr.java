package idv.blake.wiki;

import java.util.Map;

@FunctionalInterface
public interface Expr {
    int interpret(Map<String, Integer> context);

    static Interpreter.Expr number(int number) {
        return context -> number;
    }

    static Interpreter.Expr plus(Interpreter.Expr left, Interpreter.Expr right) {
        return context -> left.interpret(context) + right.interpret(context);
    }

    static Interpreter.Expr minus(Interpreter.Expr left, Interpreter.Expr right) {
        return context -> left.interpret(context) - right.interpret(context);
    }

    static Interpreter.Expr variable(String name) {
        return context -> context.getOrDefault(name, 0);
    }
}
