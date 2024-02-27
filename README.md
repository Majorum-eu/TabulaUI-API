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
        <version>1.0.0</version>
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
    implementation 'com.github.Majorum-eu:TabulaUI-API:1.0.0'
}
```


## Implementing 
Implementing TabulaUI API is easy!

**Form List menu**
```java
FormList.Builder builder = TabulaAPI.INSTANCE.createList()
        .title("§6Example")
        .content("§7This is an example of a list");
builder.button("§7This is a button", floodgatePlayer -> {
    // Response: Do something
});
builder.button("§7This is another button", floodgatePlayer -> {
    // Response: Do something
}, floodgatePlayer -> {
    // Condition to view the button
    return floodgatePlayer.getDeviceOs() == DeviceOs.GOOGLE
});
```
**Form Custom menu**
```java
FormCustom.Builder builder = TabulaAPI.INSTANCE.createCustom()
        .title("§6Example")
        .icon(TabulaAPI.INSTANCE.getFormImage("https://example.com/image.png"))
        .label("§7This is an example of a custom form");
builder.dropDown("§7This is a drop down", 0, Arrays.asList("§7Option 1", "§7Option 2", "§7Option 3"), floodgatePlayer -> {
    // Condition to view the button
    return floodgatePlayer.getDeviceOs() == DeviceOs.GOOGLE;
}, (floodgatePlayer, value) -> {
    // Response: Do something
});
builder.input("Demand", null, null, null, (floodgatePlayer, value) -> {
    // Response: Do something
});
```
**Form Info menu**
```java
FormInfo.Builder builder = TabulaAPI.INSTANCE.createInfo()
        .title("§6Example")
        .content("§7This is an example of an info form");
builder.trueButton("§7This is a button", floodgatePlayer -> {
    // Response: Do something
});
builder.falseButton("§7This is another button", floodgatePlayer -> {
    // Response: Do something
});
```
