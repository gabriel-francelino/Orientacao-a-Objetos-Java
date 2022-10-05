import { Banco } from "../model/Banco.js";
import { Cliente } from "../model/Cliente.js";
import { ContaCorrente } from "../model/ContaCorrente.js";
import { ContaPoupanca } from "../model/ContaPoupanca.js";

const banco = new Banco();

export let bilbo = new Cliente("Bilbo", "Bolseiro", "01");
banco.adicionarCliente(bilbo);
bilbo.adicionarConta(new ContaCorrente(220000.00, "b1", 40000.00));
bilbo.adicionarConta(new ContaPoupanca(50000.00, "b2", 0.03));

export let frodo = new Cliente("Frodo", "Bolseiro", "02");
banco.adicionarCliente(frodo);
frodo.adicionarConta(new ContaCorrente(30000.00, "f1", 0));

let gandalf = new Cliente("Gandalf", "the Grey", "03");
banco.adicionarCliente(gandalf);
gandalf.adicionarConta(new ContaPoupanca(220000.00, "g1", 0.03));
gandalf.adicionarConta(frodo.getConta(0));

let sam = new Cliente("Samwise", "Gamgee", "04");
banco.adicionarCliente(sam);
sam.adicionarConta(new ContaPoupanca(127000.00, "s1", 0.04));
sam.adicionarConta(new ContaCorrente(80000.00, "s2", 12000.00));