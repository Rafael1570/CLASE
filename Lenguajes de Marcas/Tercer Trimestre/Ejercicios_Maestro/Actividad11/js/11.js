function cambia_imagen() {
    let img = document.querySelector("img");
    let src_img = img.getAttribute("src");
    if (src_img === "img/encendida.png") {
        img.setAttribute("src", "img/apagada.png");
        boton.textContent = "Apagar";
    } else {
        img.setAttribute("src", "img/encendida.png");
        boton.textContent = "Encender";
    }
}

