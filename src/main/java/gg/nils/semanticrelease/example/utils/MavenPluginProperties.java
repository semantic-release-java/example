package gg.nils.semanticrelease.example.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class MavenPluginProperties {

    static Properties properties = new Properties();

    static {
        try {
            InputStream is = MavenPluginProperties.class.getResourceAsStream("/META-INF/maven/gg.nils/semantic-release-example/pom.properties");

            if (is != null) {
                properties.load(is);
            }
        } catch (IOException ignored) {
        }
    }

    public static String getVersion() {
        return properties.getProperty("version", "Unknown");
    }
}
