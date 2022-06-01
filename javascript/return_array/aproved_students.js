const students = [
    {
        name: 'João',
        grade: 5,
        class: '1B',
    },
    {
        name: 'Sofia',
        grade: 9,
        class: '1B'
    },
    {
        name: 'Paulo',
        grade: 6,
        class: '2C'
    },
    {
        name: 'Miguel',
        grade: 3,
        class: '2C'
    }
]

function aprovedStudents(arr, avg) {
    let aproved = []
    
    for(let i = 0; i < arr.length; i++) {
        const {grade, name} = arr[i]

        if(grade >= avg) {
            aproved.push(name)
        }
    } 


    return aproved
}

console.log(aprovedStudents(students, 5))