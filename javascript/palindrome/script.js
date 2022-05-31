// Solution 1
function verifyPalindrome(string) {
    if(!string) return "String inexistente"

    return string.split("").reverse().join("") === string
}

console.log(verifyPalindrome(''))

// Solution 2
function verifyPalindrome2(string) {
    if(!string) return "String inexistente"

    for(i = 0; i < string.length / 2; i++) {
        if(string[i] !== string[string.length - 1 - i]) {
            return false
        }
    }

    return true
}

console.log(verifyPalindrome2('abba'))