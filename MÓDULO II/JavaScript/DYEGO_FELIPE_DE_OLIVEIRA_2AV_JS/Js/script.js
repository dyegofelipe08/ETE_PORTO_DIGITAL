let depart = document.getElementById("depart");
let quant = document.getElementById("quant");
let listaDepart = [];
let listaQuant = [];
let result = document.getElementById("result");

function salvar(){
    if(depart.value == ""){
        alert('O campo departamento é obrigatório!')
    }else if(quant.value == ""){
        alert('O campo quantidade de livros é obrigatório!')
    }else{
        listaDepart.push(depart.value);
        listaQuant.push(quant.value);
        alert(`O livro ${depart.value} foi cadastrado com ${quant.value} unidades de livros`);
        depart.value=""
        quant.value = ""
        depart.focus()
    }

}

function carregar(){
result.innerHTML ="<br>Resultados"
const ctx = document.getElementById('myChart').getContext('2d');
const myChart = new Chart(ctx, {
    type: 'bar',
    data: {
        labels: listaDepart,
        datasets: [{
            label: '# of Votes',
            data: listaQuant,
            backgroundColor: [
                'rgba(255, 99, 132, 0.2)',
                'rgba(54, 162, 235, 0.2)',
                'rgba(255, 206, 86, 0.2)',
                'rgba(75, 192, 192, 0.2)',
                'rgba(153, 102, 255, 0.2)',
                'rgba(255, 159, 64, 0.2)'
            ],
            borderColor: [
                'rgba(255, 99, 132, 1)',
                'rgba(54, 162, 235, 1)',
                'rgba(255, 206, 86, 1)',
                'rgba(75, 192, 192, 1)',
                'rgba(153, 102, 255, 1)',
                'rgba(255, 159, 64, 1)'
            ],
            borderWidth: 1
        }]
    },
    options: {
        scales: {
            y: {
                beginAtZero: true
            }
        }
    }
});


}