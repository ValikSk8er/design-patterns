package visitor.pattern.core;

import java.util.ArrayList;
import java.util.List;

public class Document extends Element {
    private List<Element> elements;

    public void addElement(Element elements) {
        this.elements.add(elements);
    }

    public Document(String uuid) {
        super(uuid);
        elements = new ArrayList<>();
    }

    @Override
    public void accept(Visitor v) {
        for (Element element : this.elements) {
            element.accept(v);
        }
    }
}
