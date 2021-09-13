# :thinking: Graficas-Cuadricula
## Descripcion.
Generar la siguiente grafica cumpliendo las siguientes condiciones:
- Cuadricula. Pantalla completa
- Cada cuadro deberá medir 30 unidades por lado
- Deberá realizar la cuadricula UTILIZANDO SOLAMENTE PUNTOS, NO LINEAS, NO POLIGONOS, NO FIGURAS.
- El color de fondo y color de los puntos es libre.
> Este ejercicio se hizo con el lenguaje JAVA, se utilizo NetBeans para dicha realizacion del ejercicio.

**Importamos las librerias**
![Captura de pantalla (1279) png](https://user-images.githubusercontent.com/71051834/133091083-c7d19f27-0684-4755-bbf0-3a7b22abbdcf.jpg)

**Tenemos la clase SILVA y implemtamamos  GLEventListener**

- GLEventListener es una Interfaz que provee acceso para realizar funciones de dibujado, consta de 4 métodos: init(GLAutoDrawable g),display(GLAutoDrawable g) entre otros. 
- Tambien tenemos GLCanvas que permiten realizar las funciones de dibujado, puede realizar el dibujado a través de la interface GLEventListener, todo esto viene en la libreria JOGL (OpenGL).
- Esta parte es para la ventana principal 
![Captura de pantalla (1289) png](https://user-images.githubusercontent.com/71051834/133153242-c8180245-8aa1-4803-86b9-6f561f9398cc.jpg)

**en esta parte public void init(GLAutoDrawable drawable) podemos cambiar el color de fondo**

**public void display(GLAutoDrawable drawable) es para las caracteristcas de las lineas, como el groso de las lineas, el color, y el tamañp del cuadro**
![Captura de pantalla (1290) png](https://user-images.githubusercontent.com/71051834/133164399-f09572f1-cf58-4566-a228-57aea42ae486.jpg)

**Este es el resultado**
![Captura de pantalla (1285)](https://user-images.githubusercontent.com/71051834/133093470-6a8b48c2-fb2b-46cf-ae3a-d36b24ef6ada.png)
