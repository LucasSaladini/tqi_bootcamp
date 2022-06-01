function calculateAge(years) {
    return `Daqui a ${years} anos, ${this.name} terá ${
        this.age + years
    } anos de idade`
}

const person1 = {
    name: 'Maria',
    age: 30,
}

const person2 = {
    name: 'Carla',
    age: 26,
}

const animal = {
    name: 'Fiona',
    age: 5,
    breed: 'Pug',
}

console.log(calculateAge.call(person2, 30))
console.log(calculateAge.apply(person1, [4]))