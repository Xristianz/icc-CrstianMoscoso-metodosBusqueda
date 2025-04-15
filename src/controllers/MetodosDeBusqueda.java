package controllers;
import controllers.models.Persona;
import views.ShowConsole;

public class MetodosDeBusqueda {
    private Persona[] people;
    private ShowConsole ShowConsole;
    
    public MetodosDeBusqueda() {
    }

    public MetodosDeBusqueda(Persona [] persons){
        ShowConsole=new ShowConsole();
        this.people=persons;
        showPersoByCode();
    }

    public int busquedaLineal(int[] arreglo, int objetivo) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == objetivo) {
                return i;
            }
        }
        return -1; 
    }
    public int findPersonByCode(int code){
        for(int i=0 ; i<people.length;i++){
            if(people[i].getCode()==code){
                return i;
            }
            
        }
        return -1;
    }
    public void showPersoByCode(){
        int codeToFine=ShowConsole.getCode();
        int indexPerson=findPersonByCode(codeToFine);
        if (indexPerson>=0){
            ShowConsole.showMessage("Persona Enconctrada");
            ShowConsole.showMessage(people[indexPerson].toString());

        }
        else{
            ShowConsole.showMessage("Persona con codigo"+codeToFine+"No encontrado");
        }

        
    }
    
}
