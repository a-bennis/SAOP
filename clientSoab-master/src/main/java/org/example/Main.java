package org.example;

import stub.EtudiantWService;

import stub.ServiceWeb;
import stub.Student;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EtudiantWService wsdl= new ServiceWeb().getEtudiantWServicePort();
        List<Student> liste=wsdl.listStudents();
        liste.forEach(elm->{System.out.println(elm.getNom()
                +"----"+elm.getPrenom());});
    }
}