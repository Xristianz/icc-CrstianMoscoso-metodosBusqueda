package controllers;
import controllers.models.Persona;
import views.ShowConsole;
public class MetodoBusquedaBinaria {
    private ShowConsole vista;
    private Persona[] people;
    
    public MetodoBusquedaBinaria(Persona[] personas){
        this.people=personas;
        this.vista = new ShowConsole();
        System.out.println("Clase Metodos de busqueda binaria");
        showPersoByCode();
    }
    public int findPersonByCode(int code){
        int bajo=0;
        int alto=people.length-1;
        while(bajo<= alto){
            int central= bajo +(alto-bajo)/2;
            //int central=(bajo+alto)/2;
            if(people[central].getCode()==code){
                return central;
            }
            if (people[central].getCode()<code){
                bajo=central+1;
            }else{
                alto=central-1;
            }
        }
        
        return -1;

    }
    public void showPersoByCode(){
        int codeToFine=vista.getCode();
        int indexPerson= findPersonByCode(codeToFine);
        if (indexPerson==-1){
            vista.showMessage("No hay persona con ese codigo");
        }else{
            vista.showMessage("Persona con codigo "+ codeToFine + "Encontrada");
            vista.showMessage(people[indexPerson].toString());
        }
    }
    public void showPersonbyName(){
        

    }
}
