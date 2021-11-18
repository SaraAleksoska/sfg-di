package guru.springframework.sfgdi.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(ConstructorConfig.class)
@ConstructorBinding
@ConfigurationProperties("guru")
public class ConstructorConfig {
    private final String username;
    private final String password;
    private final String jbdcurl;

    public ConstructorConfig(String username, String password, String jbdcurl) {
        this.username = username;
        this.password = password;
        this.jbdcurl = jbdcurl;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getJbdcurl() {
        return jbdcurl;
    }
}
