import java.util.Scanner;
public class MainGestionProductos {
public static void main(String[] args) {
SistemaGestionProductos sistema = new SistemaGestionProductos();
Scanner scanner = new Scanner(System.in);
//Inicio Inserción datos de prueba...

// Alimentación
Producto p1 = new Producto("Leche");
Producto p2 = new Producto("Pan");
Producto p3 = new Producto("Huevos");
p2.setAgotado(true); // Pan agotado
sistema.getHistoricoAgotados().add(p2);
sistema.getProductosPorTipo().get("Alimentacion").add(p1);
sistema.getProductosPorTipo().get("Alimentacion").add(p2);
sistema.getProductosPorTipo().get("Alimentacion").add(p3);
// Tecnología
Producto p4 = new Producto("Ratón");
Producto p5 = new Producto("Teclado");
Producto p6 = new Producto("Monitor");
p5.setAgotado(true); // Teclado agotado
sistema.getHistoricoAgotados().add(p5);
sistema.getProductosPorTipo().get("Tecnologia").add(p4);
sistema.getProductosPorTipo().get("Tecnologia").add(p5);
sistema.getProductosPorTipo().get("Tecnologia").add(p6);
//Fin Inserción de datos de prueba   
while (true) {
System.out.println("\n=== Sistema de Gestión de Productos ===");
System.out.println("1. Agregar producto");
System.out.println("2. Mostrar productos");
System.out.println("3. Eliminar producto");
System.out.println("4. Marcar producto como agotado");
System.out.println("5. Mostrar histórico de agotados");
System.out.println("6. Limpiar stock (eliminar productos agotados)");
System.out.println("7. Salir");
System.out.print("Seleccione una opción: ");
int opcion = scanner.nextInt();
scanner.nextLine(); // Limpiar el buffer de entrada
switch (opcion) {
case 1:
System.out.println("Introduce el tipo del producto:");
String tipo = scanner.nextLine();
System.out.println("Introduce el nombre del producto:");
String nombre = scanner.nextLine();
sistema.agregarProducto(tipo, nombre);
break;
case 2:
sistema.mostrarProductos();
break;
case 3:
System.out.println("Introduce el ID del producto a eliminar:");
int idEliminar = scanner.nextInt();
scanner.nextLine();
sistema.eliminarProducto(idEliminar);
break;
case 4:
System.out.println("Introduce el ID del producto a marcar como agotado:");
int idAgotar = scanner.nextInt();
scanner.nextLine();
sistema.marcarProductoComoAgotado(idAgotar);
break;
case 5:
sistema.mostrarHistorico();
break;
case 6:
sistema.limpiarStock();
break;
case 7:
System.out.println("Saliendo del sistema...");
scanner.close();
return;
default:
System.out.println("Opción no válida.");
            }
        }
    }
}