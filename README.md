# APP ANDROID + JAVA -  PASEANDO DATOS ENTRE ACTIVITYS

<br>
<h1 align="center">
  <p>
    <img src="https://github.com/IvBanzaga/TransfereciaDatosEntreActivitys/blob/master/img/captura.png" alt="Android Studio" width="45%"/>
    <img src="https://github.com/IvBanzaga/TransfereciaDatosEntreActivitys/blob/master/img/captura2.png" alt="Android Studio" width="45%"/>
  </p>
</h1>
<br>
<br>


<ol>
  <!--<li><a href="https://dbdocs.io/ivan.cpweb/urbanManager" target="_blank">Documentación Base de datos de UrbanManager</a></li>-->
</ol>

<br>
<p>
El método putExtra() es parte de la clase Intent de Android y se utiliza 
comúnmente  para  pasar  datos  entre  actividades  en  una  aplicación  de 
Android.

public void Siguiente(View view){
    Intent segundo = new Intent(this, SegundoActivity.class);
    segundo.putExtra("dato", et1.getText().toString());
    startActivity(segundo);
}

El método .getText().toString() se utiliza comúnmente en Android para 
obtener el texto de un elemento de la interfaz de usuario como un EditText 
o un TextView y convertirlo en una cadena (String)
Android Studio

El método getIntent().getStringExtra("dato") se utiliza en Android para 
recuperar un dato que se ha pasado de una actividad a otra
tv1 = (TextView) findViewById(R.id.tv1);
String dato_recibido = getIntent().getStringExtra("dato");
tv1.setText("Hola " + dato_recibido);

Por lo tanto, cuando llamas a getIntent().getStringExtra("dato"), estás 
obteniendo  el  Intent  que  inició  la  actividad  y  recuperando  el  valor  String 
que se pasó con la clave ("dato")
 </p>
<br>
