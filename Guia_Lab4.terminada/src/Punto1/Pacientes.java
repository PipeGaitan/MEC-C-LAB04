
package Punto1;


public class Pacientes {
     private String nombre_apellido; 
    private int edad;
    private String afiliacion;
    private String cond_esp;
            
    Pacientes(String nom,int edad,String afil, String condiEsp){
    this.nombre_apellido=nom;
    this.edad=edad;
    this.afiliacion=afil;
    this.cond_esp=condiEsp;   
    }
    
      public void setnombre_apellido(String nom){
        this.nombre_apellido=nom;
        
      }
      public void setedad(int edad){
        this.edad=edad;
      
      }
      public void setafiliacion(String afil){
          this.afiliacion=afil;
      
      }
      public void setcond_esp(String condiEsp){
          this.cond_esp=condiEsp;
          
      }
      
      public String getnombre_apellido(){
          return nombre_apellido;
      
      }
      public int getedad(){
          return edad;
      
      }
      public String getafiliacion(){
          return afiliacion;
      
      }
      public String getcond_esp(){
          return cond_esp;
      
      }
}
