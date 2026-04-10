function anadirNombre() {
    let nombre = document.getElementById("nuevoNombre").value;

    if (nombre != "") {
        let nuevoLi = document.createElement("li");
        nuevoLi.textContent = nombre;

        document.getElementById("listaClase").appendChild(nuevoLi);

        document.getElementById("nuevoNombre").value = "";
    }
}
function eliminarNombre() {
    let lista = document.getElementById("listaClase");
    lista.querySelector("li:lastchild").remove(); 
}
function eliminarTodo() {
    let lista = document.getElementById("listaClase");
    if (lista) {
        lista.remove(lista);
    }
}