let mes = document.getElementById("mes");
let valor = document.getElementById("valor");
let listaMes = [];
let listaValor = [];

function salvar(){
    listaMes.push(mes.value);
    listaValor.push(valor.value);
    alert(`O mês ${mes.value} foi cadastrado com o valor de: R$${valor.value}`);
    mes.value=""
    mes.focus()
}

function carregar(){

const ctx = document.getElementById('myChart').getContext('2d');
const myChart = new Chart(ctx, {
    type: 'bar',
    data: {
        labels: listaMes,
        datasets: [{
            label: '# of Votes',
            data: listaValor,
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