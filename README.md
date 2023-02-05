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

1. download `bin/PlantUmlPlugin-1.0.jar` into `${TOMCAT_HOME}/webapps/JSPWiki/WEB-INF/lib/`
```shell
wget "https://github.com/pmamico/jspwiki-plantuml/blob/master/bin/PlantUmlPlugin-1.0.jar?raw=true"
```
2. in `../JSPWiki/WEB-INF/jspwiki-custom.properties` file, edit the comma-delimited `jspwiki.plugin.searchPath` property to include the package designation of the plugin
```properties
jspwiki.plugin.searchPath = hu.pmamico.jspwiki.plugin
```
3. restart JSPWiki (or restart Tomcat)


## Build
```shell
mvn clean compile assembly:single antrun:run
```
