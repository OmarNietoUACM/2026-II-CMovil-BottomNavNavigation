# Ejercicio.  Uso de BottomNavigation 

En el ejericio se creó una barra de navegación inferior (BottomNavigationView) en donde se 
agregaron tres menú: home, notificaciones y Configuración. Cuando el usuario selecciona una de esas
opciones, en la Activity principal se muestra un Fragmento correspondiente a la opción seleccionada.

El ejercicio emplea el control BottomNavigationView vinculado un archivo de recurso menú. En el menú
(bottom_nav_menu.xml) se especifican los items con su correspondiente ícono y la leyenda mostrada.
En la Activity principal se encuentra la lógica que maneja los eventos de la barra de navegación, además 
se incluye el manejo de agregar y quitar Badges en la opción de menú notificaciones.

La aplicación utiliza los controles: **BottomNavigationView**, **BadgeDrawable**, **menu**, **Fragments**.
Se utilizaron los objetos **supportFragmentManager**, **Badges**



<!--
![Captura de pantalla de la Activity1](images/Activity1.png 
"Captura de pantalla de la Activity1")
-->

<div>
    <img src="./images/HomeFragment.png"  alt="Captura de pantalla de la activity principal con la opción Home" width="350" >
</div>
<p>
<b>Figura 1.</b> Captura de pantalla de la Activity principal con la opción Home
</p>



<!--
![Captura de pantalla de la Activity2](images/Activity2.png 
"Captura de pantalla de la Activity2")
-->

<div>
    <img src="./images/NotifyFragment.png.png"  alt="Captura de pantalla con la opción Notificaciones (quita el badge)" width="200" >
</div>
<p>
<b>Figura 2.</b> Captura de pantalla con la opción Notificaciones (se quita el badge)
</p>


<!--
![Captura de pantalla de Android ShareSheet](images/AndroidShareSheet.png 
"Captura de pantalla de Android ShareSheet")
-->

<div>
    <img src="./images/SettingFragmetn.png.png"  alt="Captura de pantalla con la opción Configuración" width="200" >
</div>
<p>
<b>Figura 3.</b> Captura de pantalla con la opción Configuración
</p>

