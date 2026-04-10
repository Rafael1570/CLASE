let contador = 4;

function anadir() {
    const nombre = document.getElementById("nombre").value;
    const nota = document.getElementById("nota").value;

    if (nombre === "" || nota === "") {
        alert("Por favor, complete ambos campos.");
        return;
    }
    contador++;

    const tabla = document.getElementById("tabla");
    const fila = document.createElement("tr");
    fila.id = "fila" + contador;
    tabla.appendChild(fila);
    fila.innerHTML = `
        <td>${nombre}</td>
        <td>${nota}</td>
        <td>
            <button onclick="eliminar(${contador})">Eliminar</button>
        </td>
    `;
}
function eliminar(id) {
    const fila = document.getElementById("fila" + id);
    if (fila) {
        fila.remove();
    }
}