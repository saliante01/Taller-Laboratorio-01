package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        while (!salir) {

            System.out.println("Agregar estudiante");
            System.out.println("Mostrar cantidad de estudiantes que aprueban la asginatura");
            System.out.println("Mostrar cantidad de estudiantes que reprueban la asignatura ");
            System.out.println("Mostrar la cantidad de estudiantes que van a examen");
            System.out.println("Mostrar el estado de todos los estudiantes de la asignatura(notas y promedio)");
            System.out.println("Salir");
            try {

                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:

                        System.out.println("Estudiante Agregado");
                        break;
                    case 2:

                        System.out.println("Cantidad de almunos que aprueban: ");
                        break;
                    case 3:

                        System.out.println("Cantidad de alumnos que reprueban: ");
                        break;
                    case 4:

                        System.out.println("Cantidad de alumnos que van a examen: ");
                    case 5:
                        System.out.println("Estado de todos los estudiantes de la asginatura: ");
                    case 6:
                        salir = true;
                        break;
                    default:
                        System.out.println("");
                }
            } catch (InputMismatchException e) {
                System.out.println("");
                sn.next();
            }
        }
    }
    public static double [][] generarMatrizStandar(){ //matriz 5 50 llena de 0
        double[][] matriz = new double[5][50];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = 0.0;
            }
        }

        return matriz;
    }

    public static void mostrarMatriz(double [][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");

            }
        }

    }
    public double sumarFilas(){


    }







































}
