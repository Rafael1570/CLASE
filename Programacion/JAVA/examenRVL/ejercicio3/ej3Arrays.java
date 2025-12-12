public class ej3Arrays {
    public static void main(String[] args) {
        String[] nombresModulos = {
            "Programación",
            "lenguajes de Marcas",
            "Entornos de Desarrollo",
            "Base de Datos",
            "Sistemas Informaticos",
        };
        String[][] alumnos = {{"Ana", "7", "6", "4", "8", "5", ""},{"Luis", "5", "5", "5", "5", "5", ""},{"Maria", "3", "8", "2", "4", "1", ""}};
        System.out.println("----PROCESANDO NOTAS DE ALUMNOS----");
        for ( int i = 0; i<alumnos.length; i++){
            String nombre = alumnos[i][0];
            double sumaNotas = 0;
            boolean todoAprobado = true;

            for (int j=1; j<=5; j++) {
                double nota = Double.parseDouble(alumnos[i][j]);
                sumaNotas += nota;
                if (nota<5){
                    todoAprobado=false;
                }
            }
            double media = sumaNotas / 5;
            if(todoAprobado){
                alumnos[i][6] = "SI";
            }else{
                alumnos[i][6] = "NO";
            }
            System.out.println("Alumnos: "+nombre);
            for (int j =1;j<=5;j++){
                System.out.println(" "+nombresModulos[j-1]+": "+alumnos[i][j]);
            }
            System.out.println("Media: "+media);
            System.out.println("Aprobado: "+alumnos[i][6]);
        }
        
    }
}
