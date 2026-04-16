let botonHTML = document.querySelector("#html");
botonHTML.addEventListener("click", cargarHtml);

function cargarHtml() {
    let imagen = document.querySelector("#imagenCentral");
    imagen.setAttribute("src", "img/html_logo.png");
}

let botonBootstrap = document.querySelector("#bootstrap");
botonBootstrap.addEventListener("click", cargarBootstrap);

function cargarBootstrap() {
    let imagen = document.querySelector("#imagenCentral");
    imagen.setAttribute("src", "img/bootstrap-logo.jpg");
}

let botonJs = document.querySelector("#js");
botonJs.addEventListener("click", cargarJs);

function cargarJs() {
    let imagen = document.querySelector("#imagenCentral");
    imagen.setAttribute("src", "img/js.png");
}

let botonMas = document.querySelector("#inzoom");
botonMas.addEventListener("click", zoomMas);

function zoomMas() {
    let imagen = document.querySelector("#imagenCentral");
    let ancho = parseInt(imagen.getAttribute("width"));
    let alto = parseInt(imagen.getAttribute("height"));

    if (ancho + 30 <= 350 && alto + 30 <= 350) {
        imagen.setAttribute("width", ancho + 30);
        imagen.setAttribute("height", alto + 30);
    }
}

let botonMenos = document.querySelector("#outzoom");
botonMenos.addEventListener("click", zoomMenos);

function zoomMenos() {
    let imagen = document.querySelector("#imagenCentral");
    let ancho = parseInt(imagen.getAttribute("width"));
    let alto = parseInt(imagen.getAttribute("height"));

    if (ancho - 30 >= 5 && alto - 30 >= 5) {
        imagen.setAttribute("width", ancho - 30);
        imagen.setAttribute("height", alto - 30);
    }
}

let botonNegro = document.querySelector("#negro");
botonNegro.addEventListener("click", ponerNegro);

function ponerNegro() {
    let cuadro = document.querySelector("#cuadro");
    cuadro.classList.remove("marcoRojo", "marcoAzul", "marcoAmarillo", "marcoVerde", "marcoRosa");
    cuadro.classList.add("marcoNegro");
}

let botonRojo = document.querySelector("#rojo");
botonRojo.addEventListener("click", ponerRojo);

function ponerRojo() {
    let cuadro = document.querySelector("#cuadro");
    cuadro.classList.remove("marcoNegro", "marcoAzul", "marcoAmarillo", "marcoVerde", "marcoRosa");
    cuadro.classList.add("marcoRojo");
}

let botonAzul = document.querySelector("#azul");
botonAzul.addEventListener("click", ponerAzul);

function ponerAzul() {
    let cuadro = document.querySelector("#cuadro");
    cuadro.classList.remove("marcoNegro", "marcoRojo", "marcoAmarillo", "marcoVerde", "marcoRosa");
    cuadro.classList.add("marcoAzul");
}

let botonAmarillo = document.querySelector("#amarillo");
botonAmarillo.addEventListener("click", ponerAmarillo);

function ponerAmarillo() {
    let cuadro = document.querySelector("#cuadro");
    cuadro.classList.remove("marcoNegro", "marcoRojo", "marcoAzul", "marcoVerde", "marcoRosa");
    cuadro.classList.add("marcoAmarillo");
}

let botonVerde = document.querySelector("#verde");
botonVerde.addEventListener("click", ponerVerde);

function ponerVerde() {
    let cuadro = document.querySelector("#cuadro");
    cuadro.classList.remove("marcoNegro", "marcoRojo", "marcoAzul", "marcoAmarillo", "marcoRosa");
    cuadro.classList.add("marcoVerde");
}

let botonRosa = document.querySelector("#rosa");
botonRosa.addEventListener("click", ponerRosa);

function ponerRosa() {
    let cuadro = document.querySelector("#cuadro");
    cuadro.classList.remove("marcoNegro", "marcoRojo", "marcoAzul", "marcoAmarillo", "marcoVerde");
    cuadro.classList.add("marcoRosa");
}