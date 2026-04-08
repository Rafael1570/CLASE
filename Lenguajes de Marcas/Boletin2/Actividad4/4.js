function crear() {
    let titulo = document.getElementById("titulo").value;
    let sec1 = document.getElementById("sec1").value;
    let sec2 = document.getElementById("sec2").value;

    let contenedor = document.getElementById("contenedor");
    contenedor.innerHTML = ""; // limpia antes

    let h1 = document.createElement("h1");
    h1.textContent = titulo;

    let p1 = document.createElement("p");
    p1.textContent = sec1;

    let p2 = document.createElement("p");
    p2.textContent = sec2;

    contenedor.appendChild(h1);
    contenedor.appendChild(p1);
    contenedor.appendChild(p2);
}