package herencia;
import javax.swing.JOptionPane;
public class Estudiante extends Persona{
    private String carnet;
    private double promedioNotas;
    private int numeroMaterias;
    private double definitiva;
public Estudiante(){
}   
public Estudiante(String nombre,String apellido, int edad, int peso, String carnet,double promedioNotas, int numeroMaterias,double definitiva){
      super(nombre, apellido, edad, peso);
      this.carnet=carnet;
      this.promedioNotas=promedioNotas;
      this.numeroMaterias=numeroMaterias;
      this.definitiva=definitiva;
}
public String getCarnet(){
return carnet;}
public void setCarnet(String carnet){
    this.carnet= carnet;
}
public double getPromedioNotas(){
return promedioNotas;}
public void setPromedioNotas(double promedioNotas){
    this.promedioNotas= promedioNotas;
}
public double getDefinitiva(){
return promedioNotas;}
public void setDefinitiva(double definitiva){
    this.definitiva= definitiva;
}
public int getNumeroMaterias(){
return numeroMaterias;}
public void setNumeroMaterias(int numeroMaterias){
    this.numeroMaterias= numeroMaterias;
}
public double calcularPromedio(int numeroMaterias,double tot){
    double promedio=0;
    promedio =tot/numeroMaterias;
        return promedio;
}
double nota, tot= 0;
public double leerNotas(double numNota){        
       for(int i=0;i<numNota;i++){
           nota=Double.parseDouble(JOptionPane.showInputDialog("digite la nota"));
           setPromedioNotas(tot);
           tot=nota+getPromedioNotas(); 
} 
        return tot;
    
}
public Estudiante ingresarDatosEstudiante(){
        Estudiante estudi =new Estudiante();
   String nombre=leerDatoTipoCadena("Ingrese el nombre del estudiante ");
   String apellido=leerDatoTipoCadena("Ingrese el apellido del estudiante ");
   int edad =leerDatoTipoEntero("Ingrese la edad del estudiante ");
   double peso = leerDatoTipoReal("Ingrese el peso del estudiante ");
   String carn = leerDatoTipoCadena("Ingrese el código del narné: ");
   int numeroMaterias=leerDatoTipoEntero("Ingrese el numero de materias");
   double suma=leerNotas(numeroMaterias);
   double definitiva=calcularPromedio(numeroMaterias, suma);
   estudi.setNombre(nombre);
   estudi.setApellido(apellido);
   estudi.setEdad(edad);
   estudi.setPeso(peso);
   estudi.setCarnet(carn);
   estudi.setDefinitiva(definitiva);
   estudi.setNumeroMaterias(numeroMaterias);
   return estudi;
}
public void imprimirReporteEstudianteNotasEstudiante(){
    imprimirDatosPersona();
    JOptionPane.showMessageDialog(null,"Numero carné: " + carnet);
    JOptionPane.showConfirmDialog(null,"numero de materias: "+numeroMaterias+" promedio: "+ definitiva );
}
}


