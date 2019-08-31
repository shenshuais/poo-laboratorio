package ejercicio3_b;
import java.util.ArrayList;
public class Ejercicio3_b {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        ListaPintores list = new ListaPintores();
        list.inicializarPintores(lista);
        System.out.println(lista);
        list.pedirPintores(lista);
        System.out.println(lista);
        
    }
    
}
