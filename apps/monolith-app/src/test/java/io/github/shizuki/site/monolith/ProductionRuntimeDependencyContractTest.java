package io.github.shizuki.site.monolith;

import static org.assertj.core.api.Assertions.assertThat;

import java.nio.file.Files;
import java.nio.file.Path;
import javax.xml.parsers.DocumentBuilderFactory;
import org.junit.jupiter.api.Test;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

class ProductionRuntimeDependencyContractTest {

    @Test
    void postgresqlDriverIsPackagedForProductionRuntime() throws Exception {
        Path pom = Path.of("pom.xml");
        assertThat(Files.isRegularFile(pom)).isTrue();

        var document = DocumentBuilderFactory.newInstance()
            .newDocumentBuilder()
            .parse(pom.toFile());
        NodeList dependencies = document.getElementsByTagName("dependency");

        String postgresqlScope = null;
        for (int index = 0; index < dependencies.getLength(); index++) {
            Element dependency = (Element) dependencies.item(index);
            if ("org.postgresql".equals(text(dependency, "groupId"))
                && "postgresql".equals(text(dependency, "artifactId"))) {
                postgresqlScope = text(dependency, "scope");
                break;
            }
        }

        assertThat(postgresqlScope)
            .as("PostgreSQL JDBC driver scope in the production monolith")
            .isEqualTo("runtime");
    }

    private String text(Element parent, String tagName) {
        NodeList nodes = parent.getElementsByTagName(tagName);
        return nodes.getLength() == 0 ? null : nodes.item(0).getTextContent().trim();
    }
}
