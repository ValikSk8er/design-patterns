package visitor.pattern.core;

public interface Visitor {
    void visit(XmlElement xe);
    void visit(JsonElement je);
}
