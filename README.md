# Tabula API - Library API for menu creator

## Include the API

**Note:** You must have TabulaUI plugin to use this API: https://builtbybit.com/resources/tabulaui-bedrock-forms-menu-creator.39499

How to include the API with Maven: 
```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
<dependencies>
    <dependency>
        <groupId>com.github.Majorum-eu</groupId>
        <artifactId>TabulaUI-API</artifactId>
        <version>1.0</version>
        <scope>provided</scope>
    </dependency>
</dependencies>
```

How to include the API with Gradle:
```groovy
repositories {
    maven { url 'https://jitpack.io' }
}
dependencies {
    implementation 'com.github.Majorum-eu:TabulaUI-API:1.0'
}
```


## Implementing 
Implementing TabulaUI API is easy!

```java
package com.example.plugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

public class ExamplePlugin extends JavaPlugin {

    @Override
    public void onDisable() {
    }

    @Override
    public void onEnable() {
    }
    
}
```
