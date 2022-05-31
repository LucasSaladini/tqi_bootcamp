function calculator() {
    const operator = Number(prompt("Escolha uma operação: \n 1 - Soma \n 2 - Subtração \n 3 - Multiplicação \n 4 - Divisão Real \n 5 - Divisão Inteira \n 6 - Potenciação"))
    
    if (!operator || operator >= 7) {
        alert("Erro! Operação inválida!")
        calculator()
    } else {
        let n1 = Number(prompt("Insira o primeiro valor"))
        let n2 = Number(prompt("Insira o segundo valor"))
        let result

        if(!n1 || !n2) {
            alert("Erro! Valor inválido!")
            calculator()
        } else {
            function sum() {
                result = n1 + n2
                alert(`${n1} + ${n2} = ${result}`)
                newOperation()
            }
        
            function subtraction() {
                result = n1 - n2
                alert(`${n1} - ${n2} = ${result}`)
                newOperation()
            }
        
            function multiply() {
                result = n1 * n2
                alert(`${n1} * ${n2} = ${result}`)
                newOperation()
            }
        
            function realDivision() {
                result = n1 / n2
                alert(`${n1} / ${n2} = ${result}`)
                newOperation()
            }
        
            function integerDivision() {
                result = n1 % n2
                alert(`O resto da divisão entre ${n1} e ${n2} é ${result}`)
                newOperation()
            }
        
            function power() {
                result = n1 ** n2
                alert(`${n1} elevado a ${n2} = ${result}`)
                newOperation()
            }
        
            function newOperation() {
                let option = prompt("Deseja realizar outra operação?\n 1 - Sim \n 2 - Não")
                if (option == 1) {
                    calculator()
                } else if (option == 2) {
                    alert("Até mais!")
                } else {
                    alert("Opção inválida!")
                    newOperation()
                }
            }
        }
    
        switch (operator) {
            case 1: 
                sum()
                break
            case 2:
                subtraction()
                break
            case 3:
                multiply()
                break
            case 4:
                realDivision()
                break
            case 5:
                integerDivision()
                break
            case 6:
                power()
                break
        }
    }

}


calculator()