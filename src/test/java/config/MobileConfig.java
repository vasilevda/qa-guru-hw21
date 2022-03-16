package config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:config/MobileConfig.properties")
public interface MobileConfig extends Config {
    @Key("https.url")
    String url();

    @Key("https.curl")
    String curl();

    @Key("host.user")
    String user();

    @Key("host.key")
    String key();
}
