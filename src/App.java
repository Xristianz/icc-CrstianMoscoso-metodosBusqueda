import controllers.MetodosDeBusqueda;
import controllers.models.Persona;
import views.ShowConsole;
import controllers.MetodoBusquedaBinaria;
public class App {
    public static void main(String[] args) throws Exception {
       Persona[] personas= new Persona[7];
       personas[0]=new Persona(101,"Juan");
       personas[1]=new Persona(102, "Maria");
       personas[2]=new Persona(103, "Carlos");
       personas[3]=new Persona(104, "Ana");
       personas[4]=new Persona(105, "Luis");
       personas[5]=new Persona(106, "Sofia");
       personas[6]=new Persona(107, "Pedro");
       //MetodosDeBusqueda m10b = new MetodosDeBusqueda(personas) ;
       MetodoBusquedaBinaria mBB = new MetodoBusquedaBinaria(personas);
    }
}
