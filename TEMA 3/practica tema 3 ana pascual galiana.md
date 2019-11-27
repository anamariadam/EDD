#Unitat 3. Sistemes de control de versions
Exercici.

En primer lugar instalamos los paquetes necesarios.

```
sudo apt-get install rcs
sudo apt-get install rcs-blame

Creamos el fichero 

anomenatexercici.md

Le añadimos contenido en formato md.

Gurdamos salimos veremos que disponemos de los permisos habituales, lo primero que debemos hacer para llevaro a un control de versiones es registrarlo:

```
ci-u anomenatexercici.md
anomenatexercici.md,v <-- anomenatexercici.md
enter description terminated with single '.' or end of file: 
NOTE: This is NOT the log message!
>>v1
>> .7initialrevision: 1.18done
```

Como vemos hacemos el uso de la orden ci que significa check-in
```
-r-xr-xr-x 1 alumne alumne 18 nov 19 09:23 anomenatexercici.md
-r-xr-xr-x 1 alumne alumne 200 nov 19 09:29 anomenatexercici.md,v
```

El fichero original ya no tiene permiso de lectura y se ha creado un nuevo fichero con los mismos permisos que el original.

Para poder modificarlo tenemos que hacerle un check out:

```
co -l ./anomenatexercici.md
./anomenatexercici.md,v -->  ./anomenatexercici.md
revision 1.1 (locked)
done
```
Ahora si se puede modificar porque el original ahora tiene permiso. Abrimos el archivo lo modificamos y le volvemos hacer un check in el programa nos avisa que es la versión 1.2

Para revisar los cambios del fichero lo podemos ver con la orden rlog.

Nos muestra las versiones, quien a sido el autor de cada version creada, la fecha y hora.

