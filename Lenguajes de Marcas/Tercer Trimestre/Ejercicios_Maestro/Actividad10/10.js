let titulos = document.querySelectorAll('h1');
let botones = document.querySelectorAll('button');
let botonRojo = document.getElementById('cambiarrojo');
let botonAmarillo = document.getElementById('cambiaramarillo');
let botonVerde = document.getElementById('cambiarverde');


botones.forEach(function(boton) {
    boton.addEventListener('click', function() {
        if (boton.id === 'cambiarrojo') {
            titulos.forEach(function(titulo) {
                titulo.style.color = 'red';
            });
        } else if(boton.id === 'cambiaramarillo') {
            titulos.forEach(function(titulo) {
                titulo.style.color = 'yellow';
            });
        } else if(boton.id === 'cambiarverde') {
            titulos.forEach(function(titulo) {
                titulo.style.color = 'green';
            });

        }
    });
});
