package visitor.pattern;

import visitor.pattern.core.*;

import java.util.UUID;

public class Demo {

    public static void main(String[] args) {
        Visitor elementVisitor = new ElementVisitor();
        Document document = new Document(generateUuid());

        document.addElement(new JsonElement(generateUuid()));
        document.addElement(new JsonElement(generateUuid()));
        document.addElement(new XmlElement(generateUuid()));

        document.accept(elementVisitor);
    }

    private static String generateUuid() {
        return UUID.randomUUID().toString();
    }
}