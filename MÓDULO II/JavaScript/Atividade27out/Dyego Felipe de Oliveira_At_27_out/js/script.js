function gerarPedido() {
    //formulários de entrada de dados
    let proteina = document.getElementById("proteina");
    let ac1 = document.getElementById("ac1");
    let ac2 = document.getElementById("ac2");
    let ac3 = document.getElementById("ac3");
    let bebida = document.getElementById("bebida");
    let nome = document.getElementById("nome");
    let rua = document.getElementById("rua");
    let numero = document.getElementById("numero");
    let contato = document.getElementById("contato");
    let opFormaPag = document.getElementById("formaPagemnto");

    //saídas de dados (resumo do pedido)
    let total = document.getElementById("total");
    let formaPag = document.getElementById("formaPag")
    let pedido = document.getElementById("pedido");
    let resNome = document.getElementById("resNome")
    let resTel = document.getElementById("resTel")
    let resRua = document.getElementById("resRua")
    let resNumero = document.getElementById("resNumero")

    // variáveis para auxiliar no manuseio de dados textuais ou numéricos do form type select
    let opcao1 = proteina.options[proteina.selectedIndex];
    let opcao2 = bebida.options[bebida.selectedIndex];
    let opcao3 = opFormaPag.options[opFormaPag.selectedIndex];
    let opcao4 = ac1.options[ac1.selectedIndex];
    let opcao5 = ac2.options[ac2.selectedIndex];
    let opcao6 = ac3.options[ac3.selectedIndex];



    // validação do formulário

    if (opcao1.value == "") {
        alert("Selecione a proteína!")
    }
    else if (opcao2.value == "") {
        alert("Selecione a bebida!")
    } else if (opcao4.value == "") {
        alert("Selecione o acompanhamento 1")
    } else if (opcao5.value == "") {
        alert("Selecione o acompanhamento 2")
    } else if (opcao6.value == "") {
        alert("Selecione o acompanhamento 3")
    } else if (nome.value == "") {
        alert("Digite seu nome!")
    } else if (rua.value == "") {
        alert("Digite a rua onde você mora!")
    } else if (numero.value == "") {
        alert("Digite o número da sua casa!")
    } else if (contato.value == "") {
        alert("Digite seu telefone de contato!")
    } else if (opcao3.value == "") {
        alert("Selecione sua forma de pagamento!")
    } else {
        let totalPedido = Number(opcao1.value) + Number(opcao2.value);
        total.innerHTML = ("<b>R$" + parseFloat(totalPedido).toFixed(2) + "</b>");

        formaPag.innerHTML = ("<b>" + opcao3.text + "</b>");

        pedido.innerHTML = ("<br>PROTEÍNA: <b>" + opcao1.text + "</b><br>BEBIDA: <b>" + opcao2.text + "</b><br>ACOMPANHAMENTO 1: <b>" + opcao4.text + "</b><br>ACOMPANHAMENTO 2: <b>" + opcao5.text + "</b><br>ACOMPANHAMENTO 3: <b>" + opcao6.text + "</b>");

        resNome.innerHTML = ("NOME: <b>" + nome.value + "</b>");
        resTel.innerHTML = ("TELEFONE: <b>" + contato.value + "</b>");
        resRua.innerHTML = ("RUA: <b>" + rua.value + "</b>")
        resNumero.innerHTML = ("N. DA CASA: <b>" + numero.value + "</b>")

    }




















}