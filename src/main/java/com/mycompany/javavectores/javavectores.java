import java.util.ArrayList;
import java.util.Collections;

public class JavaVectores {
    public static void main(String[] args) {
        // 1. Declarar una lista vacía
        ArrayList<String> listaVacia = new ArrayList<>();

        // 2. Declarar una lista con más de 5 elementos
        ArrayList<String> listaConMasDe5 = new ArrayList<>();
        listaConMasDe5.add("Elemento1");
        listaConMasDe5.add("Elemento2");
        listaConMasDe5.add("Elemento3");
        listaConMasDe5.add("Elemento4");
        listaConMasDe5.add("Elemento5");
        listaConMasDe5.add("Elemento6");

        // 3. Encuentre la longitud de las dos listas creadas anteriormente
        System.out.println("Longitud de listaVacia: " + listaVacia.size());
        System.out.println("Longitud de listaConMasDe5: " + listaConMasDe5.size());

        // 4. Obtener el primer elemento, el elemento central y el último elemento de la lista
        System.out.println("Primer elemento de listaConMasDe5: " + listaConMasDe5.get(0));
        System.out.println("Elemento central de listaConMasDe5: " + listaConMasDe5.get(listaConMasDe5.size() / 2));
        System.out.println("Último elemento de listaConMasDe5: " + listaConMasDe5.get(listaConMasDe5.size() - 1));

        // 5. Crear una lista llamada Datos_personales que contenga (nombre, edad, altura, estado civil, dirección), y agrega datos utilizando la funcion append()
        ArrayList<String> datosPersonales = new ArrayList<>();
        datosPersonales.add("Juan"); // Nombre
        datosPersonales.add("30"); // Edad
        datosPersonales.add("1.75"); // Altura
        datosPersonales.add("Soltero"); // Estado civil
        datosPersonales.add("Calle Falsa 123"); // Dirección

        // 6. Crea una lista llamada it_companies y asígnele los valores iniciales Facebook, Google, Microsoft, Apple, IBM, Oracle y Amazon
        ArrayList<String> itCompanies = new ArrayList<>();
        itCompanies.add("Facebook");
        itCompanies.add("Google");
        itCompanies.add("Microsoft");
        itCompanies.add("Apple");
        itCompanies.add("IBM");
        itCompanies.add("Oracle");
        itCompanies.add("Amazon");

        // 7. Añadir una empresa a la lista it_companies utilizando la funcion insert()
        itCompanies.add(1, "Twitter");

        // 8. Comprobar si una determinada empresa existe en la lista it_companies
        String empresaBuscada = "Microsoft";
        if (itCompanies.contains(empresaBuscada)) {
            System.out.println(empresaBuscada + " existe en la lista.");
        } else {
            System.out.println(empresaBuscada + " no existe en la lista.");
        }

        // 9. Ordena la lista con el método sort()
        Collections.sort(itCompanies);

        // 10. Invierte la lista en orden descendente utilizando el método reverse()
        Collections.reverse(itCompanies);

        // 11. Elimine la primera empresa informática de la lista utilizando el método pop y delete
        String primeraEmpresa = itCompanies.remove(0);
        System.out.println("Se eliminó la primera empresa: " + primeraEmpresa);

        // 12. Eliminar todas las empresas de la lista it_companies
        itCompanies.clear();
    }
}
