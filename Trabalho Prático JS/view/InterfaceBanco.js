import { Relatorio } from "../report/Relatorio.js";
import { bilbo, frodo } from "../report/TesteBanco.js";

// Elementos da interface
const btnTransacao = document.querySelector("#btnTransacao");
const btnBusca = document.querySelector("#btnBusca");
const btnRelatorio = document.querySelector("#btnRelatorio");
const terminal = document.querySelector("#terminalJS .resultado");

const r = new Relatorio();

// Função que exibe o conteúdo na interface e no console
export const escreverLinha = (str) => {
    console.log(str);
    terminal.innerHTML += `<span class="linha">${str}</span>`;
}

// EVENTOS
btnTransacao.addEventListener("click", () => {
    terminal.innerHTML = "";
    r.simularTransacoes(bilbo, frodo);
})
btnBusca.addEventListener("click", () => {
    terminal.innerHTML = "";
    r.criarRelatorioBusca();
})
btnRelatorio.addEventListener("click", () => {
    terminal.innerHTML = "";
    r.criarRelatorio();
})