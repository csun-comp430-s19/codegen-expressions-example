package codegen_expressions_example.syntax;

public class BreakStmt implements Stmt {
    public int hashCode() { return 0; }
    public boolean equals(final Object other) {
        return other instanceof BreakStmt;
    }
    public String toString() { return "break"; }
}
