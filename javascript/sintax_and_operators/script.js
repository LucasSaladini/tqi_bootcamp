function numberCompare(num1, num2) {
    if(!num1 || !num2) return 'Defina dois números!'
    const firstSentence = createFirstSentence(num1, num2)
    const secondSentence = createSecondSentence(num1, num2)

    return `${firstSentence} ${secondSentence}`
}

function createFirstSentence(num1, num2) {
    let areEqual = ''
    
    if(num1 !== num2) {
        areEqual = 'não'
    }

    return `Os números ${num1} e ${num2} ${areEqual} são iguais.`
}

function createSecondSentence(num1, num2) {
    const sum = num1 + num2

    let result10 = 'menor'
    let result20 = 'menor'
    const compare10 = sum > 10
    const compare20 = sum > 20

    if(compare10) {
        result10 = 'maior'
    }

    if(compare20) {
        result20 = 'maior'
    }

    return `Sua soma é ${sum}, que é ${result10} que 10 e ${result20} que 20.`
}

console.log(numberCompare(1,2))