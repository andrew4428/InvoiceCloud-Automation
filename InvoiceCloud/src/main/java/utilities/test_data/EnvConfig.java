package utilities.test_data;

import java.io.InputStream;
import java.util.Properties;

public class EnvConfig {

    private static final Properties props = new Properties();

    static {
        try (InputStream is = EnvConfig.class.getClassLoader().getResourceAsStream("env.properties")) {
            if (is == null) {
                throw new RuntimeException("env.properties not found in src/main/resources");
            }
            props.load(is);
        } catch (Exception e) {
            throw new RuntimeException("Failed to load env.properties", e);
        }
    }

    public static String getLoginUrl() {
        // Allow override: mvn test -Denv=Uat
        String env = System.getProperty("env");
        if (env == null || env.trim().isEmpty()) {
            env = System.getenv("env"); // optional pipeline variable
        }
        if (env == null || env.trim().isEmpty()) {
            env = props.getProperty("env"); // fallback to file
        }
        if (env == null || env.trim().isEmpty()) {
            throw new IllegalArgumentException("Missing 'env' value (file/env var/system prop).");
        }

        env = env.trim();
        String url = props.getProperty(env);

        if (url == null || url.trim().isEmpty()) {
            throw new IllegalArgumentException("No URL found for env '" + env + "' in env.properties");
        }

        return url.trim();
    }
}

