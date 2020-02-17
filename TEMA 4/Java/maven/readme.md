Parte del MAVEN

Primero hemos tenido que instalar la herramienta maven, con el comando:
```
sudo apt install maven
```

A continuacion hemos pegado esta linea de codigo que nos ha creado la ruta de carpetas y un archivo xml:

```
Id=com.ieseljust.edd -DartifactId=myHelloMVN -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

Utilizamos la orden tree maven para ver la ruta de carpetas.
 Una vez hecho eso vamos a modificar el archivo pom.xml porque maven no soporta la compilacion para java 1.5, le añadimos al archivo estas lineas:

```
<properties>
    <maven.compiler.source>1.6</maven.compiler.source>
    <maven.compiler.target>1.6</maven.compiler.target>
  </properties>
```

Una vez hemos modificado el archivo xml pegamos los archivos que teniamos creados calculadora.java y calcula.java en la carpeta edd que contiene app.java.

Ya podemos compilar con maven, vamos hasta la carpeta que contiene dicho archivo y usamos el comando:

```
mvn compile
```

Ya estaria compilado.

Ahora limpiamos con un 

```
mvn clean
```
Empaquetamos y luego limpiamos y ya lo tenemos

```
mvn package
mvn clean package
```

