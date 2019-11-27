#Unitat 2. eines per al desenvolupament de programari

##Como no tenia el paquete 'curl' instalado lo tuve que instalar con la instrucción:
```
sudo apt-get install curl
```
##Despues debemos obtener la clave GPG con los que estan firmados los paquetes de MS que incorporamos al sistema:
```
 curl https://packages.microsoft.com/keys/microsoft.asc | gpg --dearmor > packages.microsoft.gpg
```
```
sudo install -o root -g root -m 644 packages.microsoft.gpg /usr/share/keyrings/
```

##Creamos el fichero vscode.list dentro de la carpeta de fuentes de programario del sistema.

```
sudo sh -c 'echo "deb [arch=amd64] https://packages.microsoft.com/repos/vscode stable main" > /etc/apt/sources.list.d/vscode.list'
```
```
 sudo sh -c 'echo "deb [arch=amd64 signed-by=/usr/share/keyrings/packages.microsoft.gpg] https://packages.microsoft.com/repos/vscode stable main" > /etc/apt/sources.list.d/vscode.list'
```

Despues solo nos quedaba actualizar la memoria caché de paquetes y instalar VSCODE

```
sudo apt-get install apt-transport-https

sudo apt-get update

sudo apt-get install code
```

Una vez tuve el programa instalado accedi a la pestaña extensiones ubicada en el lateral izquierdo del programa e instalé las necesarias.

Fue algo simple porque simplemente tenias que buscar la extension que quisieras y pulsarle a instalar. Estos son los que instalé:

```
markdownlint: Nos ayuda a comprbar la correcta sintaxis del codigo Markdown y nos ofrece la posibilidad de previsualizar al tiempo que escribimos.

```

Tambien habia que poner la extensión de java pero antes hice una comprovacion del entorno. Empezando por averiguar que versión tengo de java.

```
javac -version
```

Al no tener ninguno nos avisa de que paquetes nos ofrecebn en linea es decir los que hay disponibles.

```
sudo apt install default-jdk
sudo apt install openjdk-11-jdk-headless
sudo apt install ecj
sudo apt install openjdk-8-jdk-headless
sudo apt install openjdk-9-jdk-headless
```

Instalación  de las extensiones de Java para VSCODE.

Buscamos: java extension pack e instalamos un conjunto de extensiones para java, en ese pack se incluye:

Languaje Support for Java(TM) -> nos ofrece soporte en proyectos Maven y Gradle, comprovación de sintaxis y errores de compilación, autocompletar el codigo, refactorizacion, soporte JavaDoc, resaltado de sintaxis, etc.
Debugger for Java -> Un depurador ligero que nos permite lanzar las aplicaciones, añadir breakpoints, pausar y continuar la ejecucion, segimiento de variables etc.
Java Test Runner -> Para ejecutar diferentes pruevas de funcionamiento.
Maven for Java -> Para gestionar proyectos Maven. Ofrece explorador de proyectos, ejecución de ordenes, generación de proyectos, validación, compilación, realización de tests etc.
