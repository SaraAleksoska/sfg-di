package guru.springframework.sfgdi.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties("guru")
@Configuration
public class SfgConfiguration {
    private String username;
    private String password;
    private String jbdcurl;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJbdcurl() {
        return jbdcurl;
    }

    public void setJbdcurl(String jbdcurl) {
        this.jbdcurl = jbdcurl;
    }
}
