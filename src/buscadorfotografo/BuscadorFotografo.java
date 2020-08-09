
package buscadorfotografo;


public class BuscadorFotografo {

    
    public static void main(String[] args) {
       Usuarios miUsuario1;
       miUsuario1 = new Usuarios();
       miUsuario1.apellido ="Perez";
       miUsuario1.nombre ="Juan";
       miUsuario1.clave ="juan1234";
        System.out.println(miUsuario1.apellido+" "+miUsuario1.nombre+" "+miUsuario1.clave);
    
//SEGUNDO USUARIO INSTANCIADO
       Usuarios miUsuario2;
       miUsuario2 = new Usuarios();
       miUsuario2.apellido ="Saucedo";
       miUsuario2.nombre ="Julian";
       miUsuario2.clave ="julian1234";
        System.out.println(miUsuario2.apellido+" "+miUsuario2.nombre+" "+miUsuario2.clave);
    }
    
}
