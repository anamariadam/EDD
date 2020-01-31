Creamos la ruta de carpetas necesaria antes de empezar.


Creamos los ficheros calculadora.java y calcula.java que tenemos en la practica y copiamos
el codigo fuente.
```
FICHERO CALCULADORA 

package com.ieseljust.edd.calc;

public class Calculadora {

    private float lastResult;
    private String lastOp;

    public float getLastResult(){
        return this.lastResult;
    }

    public String getLastOp(){
        return this.lastOp;
    }

    public float suma(float op1, float op2){
        float result=op1+op2;
        this.lastResult=result;
        this.lastOp="Suma";

        return result;
    }

    public float resta(float op1, float op2){
        float result=op1-op2;
        this.lastResult=result;
        this.lastOp="Resta";

        return result;
    }

    public float multiplica(float op1, float op2){
        // Fem els càlculs
        float result=op1*op2;

        // Actualitzem els atributs de la classe
        this.lastResult=result;
        this.lastOp="Multiplica";

        // I finalment retornem els resultats
        return result;
    }

    public float divideix(float op1, float op2){
        // Fem els càlculs
        float result=op1/op2;

        // Actualitzem els atributs de la classe
        this.lastResult=result;
        this.lastOp="Divideix";

        // I finalment retornem els resultats
        return result;
    }
    public float mitja(float op1, float op2){
        //Fem el calcul
        float result=o(op1+op2)/2;

         // Actualitzem els atributs de la classe
         this.lastResult=result;
         this.lastOp="Mitja";
    }
}
```

```
FICHERO CALCULA

package com.ieseljust.edd.calc;

import com.ieseljust.edd.calc.Calculadora;

public class Calcula {
    private static float operand1;
    private static float operand2;

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("\nSintaxi incorrecta. Necessite dos números.");
            System.exit(-1);
        }

        operand1=Float.parseFloat(args[0]);
        operand2=Float.parseFloat(args[1]);

        Calculadora myCalc=new Calculadora();

        System.out.println("La suma entre "+operand1+" i "+operand2+" és "+myCalc.suma(operand1, operand2));
        System.out.println("La resta entre "+operand1+" i "+operand2+" és "+myCalc.resta(operand1, operand2));
        System.out.println("La multiplicació entre "+operand1+" i "+operand2+" és "+myCalc.multiplica(operand1, operand2));
        System.out.println("La divisió entre "+operand1+" i "+operand2+" és "+myCalc.divideix(operand1, operand2));
        System.out.println("Última operació realitzada: "+myCalc.getLastOp()+"; Últim resultat: "+myCalc.getLastResult());
        System.out.println("La mitja entre "+operand1+" i "+operand2+" es"+myCalc.mitja(operand1+operand2/2));
        System.out.println("El menor entre "+operand1+" i "+operand2+" es"+myCalc.menor(operand1<operand2);
        
    }
}
```


Tambien creamos el archivo build.xml.
```
<project>
    <target name="clean">
        <delete dir="classes" />
    </target>

    <target name="compile" depends="clean">
        <mkdir dir="classes" />
    <javac includeantruntime="false" srcdir="com/ieseljust/edd/calc" destdir="classes" />
    </target>

    <target name="run" depends="compile">
        <java classpath="classes" classname="com.ieseljust.edd.calc.Calcula">
            <arg value="${arg0}"/>
            <arg value="${arg1}"/>
        </java>

    </target>
</project>
```

Primero instalamos la herramienta ant:
```
sudo apt install ant
```
Desde la carpeta calculadora ejecutamos los comandos de ant.

```
ant compile
```
Una vez compilado hacemos un Java tree y vemos como se ha quedado la estructura de carpetas y si se han creado
la carpeta de clases por ejemplo. 

```
ant run
```
```
 ant run -Darg0=1 -Darg1=2
```

Para terminar de ejecutar y ya lo tendriamos.