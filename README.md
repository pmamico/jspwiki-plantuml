# PlantUML Plugin for JSPWiki
for JSPWiki v2.10.1+  
PlantUml v1.2023.1

## Usage

```
[{plantuml 

Alice -> Bob: test
}]
```

## Installation

1. copy `bin/PlantUmlPlugin-0.2.jar` under `${TOMCAT_HOME}/webapps/JSPWiki/WEB-INF/lib/`
2. in `../JSPWiki/WEB-INF/jspwiki-custom.properties` file, edit the comma-delimited `jspwiki.plugin.searchPath` property to include the package designation of the plugin
```properties
jspwiki.plugin.searchPath = hu.pmamico.jspwiki.plugin
```
3. restart JSPWiki (or restart Tomcat)


## Build
```shell
mvn clean compile assembly:single antrun:run
```
