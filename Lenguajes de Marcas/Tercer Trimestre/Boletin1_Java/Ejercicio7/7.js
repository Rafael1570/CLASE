        function calcular(){
            let nota1 = parseFloat(prompt("introduce la primera nota:"));
            let nota2 = parseFloat(prompt("introduce la segunda nota:"));
            let nota3 = parseFloat(prompt("introduce la tercera nota:"));

            let media = (nota1 + nota2 + nota3) / 3;

            if(media >= 5){
                alert("media: " + media + " → aprobado");
            }else{
                alert("media: " + media + " → suspenso");
            }
        }