Parte del gradle

Primero he instalado la herramienta gradle usando el comando:

´´´
sudo apt install gradle
´´´

Una vez instalado me situado en la carpeta de gradle proyecto desde la terminal i e lanzado 

´´´
gradle init
´´´

Al ver que no me lanzaba el menu que me aparece en la practica he decidido borrar todo lo que me habia
creado y he optado por hacerlo paso a paso comando por comando.
Una vez decidido eso de los 5 comandos que aparecen solo me han funcionado 2.

´´´
gradle init --type java-application 
gradle init  --test-framework junit 
´´´

Ya que los tres siguientes no me funcionaban he decidido seguir con la practica.

Despues he hecho la construcción del proyecto:

´´´
gradle build
´´´

Luego lo he limpiado con un :

´´´
gradle clean
´´´

Luego le lanzado un :

´´´
gradle run
´´´

Una vez hecho eso me ha lanzado un hola mundo. Viendo que todo ha funcionado correctamente y me lo ha 
lanzado, he añadido dentro de src main los archivos de calculadora y calcula .java, una vez pegados los dos 
archivos ahi  he ido ha añadir la linea necesaria en el archivo: build.gradle

´´´
mainClassName = 'Calcula'
mainClassName = 'Caluladora'
´´´

Al añadir esas lineas daba todo error. Por lo tanto he decidido borrarlas.
No he terminado de entender esta parte.

No he llegado ha saber si habia algo mal o al no funcionarme todos los comandos iniciales algo ha fallado.

