var currentNumberWrapper = document.getElementById('currentNumber')
var currentNumber = 0

function increment() {
    currentNumber  = currentNumber + 1
    currentNumberWrapper.innerHTML = currentNumber
}

function decrement() {
    currentNumber = currentNumber - 1
    currentNumberWrapper.innerHTML = currentNumber
}

//TODO
// 1- usar addEventListener
// 2- condicionais para desabilitar quando <= 0 e quando >= 10
// 3- mudar a cor quando o número for negativo