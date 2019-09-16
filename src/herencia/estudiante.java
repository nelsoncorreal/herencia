/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import javax.swing.JOptionPane;


public class estudiante extends Persona {
private double nota=0;
private String carnet;
private double promedioNota;
private int numeronotas=0;
//Constructor de la clase
public estudiante(){
}
// TODO Auto-generated constructor stub9}
//Constructor de la subclase
public estudiante (String nombre, String apellido, int edad, int peso,double nota, String carnet,double promedioNota,int numeronotas){


//Usamos el operador super para establecer el constructor
//de la superclase
super(nombre, apellido, edad, peso);

//Definimos los atributos propios de este objeto que hereda
this.nota = nota;
this.carnet = carnet;
this.numeronotas=numeronotas;
this.promedioNota=promedioNota;

}
/************************************/
/************************************/
/************************************/
//Métodos de encapsulamiento
public double getnota() {
return nota;
}
public void setnota(double nota) {
this.nota = nota;
}
public String getcarnet() {
return carnet;
}
public void setcarnet(String carnet) {
this.carnet = carnet;
}
public double getpromedioNota() {
return promedioNota;
}
public void setpromedioNota(double promedioNota) {
this.promedioNota = promedioNota;
}
public int  getnumeronotas() {
return numeronotas;
}
public void setnumeronotas(int numeronotas) {
this.numeronotas = numeronotas;
}
//Métodos propios del empleado
/************************************/
/************************************/
//Método para calcular el nota del empleado
public double calcularpromedio(double nota,int numeronotas){
double promedio = 0;

promedio=nota/numeronotas;
return promedio;
}
public double leerNotaEstudiante(){
    double nota;
    nota=leerDatoTipoReal("Ingrese la nota");
    return nota;
}

//Método para ingresar los datos del empleado
public estudiante ingresarDatosEstudiante (){
estudiante  nuevoestudiante  = new estudiante ();
String nombre = "";
String apellido = "";
int edad = 0;
double peso = 0.0;
int numeronotas = 0;

double nota = 0.0;
String carnet = "";

carnet = leerDatoTipoCadena("Ingrese el código del estudiante: ");
nombre = leerDatoTipoCadena("Ingrese el nombre del estudiante: ");
apellido = leerDatoTipoCadena("Ingrese el apellido del estudiante: ");
edad = leerDatoTipoEntero("Ingrese la edad del estudiante: ");
peso = leerDatoTipoReal("Ingrese el peso del estudiante: ");

//Obtenemos los datos que no hacen parte de la clase
numeronotas = leerDatoTipoEntero("Ingrese el número de materias: ");


for(int i=0; i<numeronotas;i++){
    nota+=leerNotaEstudiante();
}
    
//Calculamos el nota

//Definimos los datos para el constructor
nuevoestudiante.setNombre(nombre);
nuevoestudiante.setApellido(apellido);
nuevoestudiante.setcarnet(carnet);
nuevoestudiante.setEdad(edad);
nuevoestudiante.setPeso(peso);
nuevoestudiante.setnota(nota);
nuevoestudiante.setnumeronotas(numeronotas);
nuevoestudiante.setpromedioNota(calcularpromedio(nota,numeronotas));

//Retornamos el objeto
return (nuevoestudiante);
}

//Método para imprimir el reporte de status del empleado
public void imprimir()
{
//Usamos nuevamente la herencia para llamar los métodos
//que imprimen los datos del empleado
imprimirDatosPersona();
//Ahora imprimimos los datos propios del estudiante
JOptionPane.showMessageDialog(null,"El carnet del estudiante es: " + carnet);
JOptionPane.showMessageDialog(null,"El numero de notas es " + numeronotas);
JOptionPane.showMessageDialog(null,"El promedio es " + promedioNota);

}
/************************************/
/************************************/
/************************************/
//Método sobreescrito para definir el estado del empleado

}

