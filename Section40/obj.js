

// const obj = {
//     name : 'Keyla',
//     age: 20,
//     nation: "USA",

//     myPage: function () {
//         console.log("Welcome to my chanel. This is " + this.name + " and my age is "+ this.age + " and from " + this.nation);
//     }
// }
// obj.myPage()

// const obj2 = {...obj}

// obj2.myPage = function (){
//     console.log("Welcome to my chanel. This is " + this.name + " and my age is "+ this.age + " and from " + this.nation + ". Please don't forget to subscribe. Thank you");
// }

// obj2.myPage()


// let key = 'name'

// console.log(obj[key]);

// const anotherObj = Object.assign({},obj)

// let equal =  anotherObj == obj;



// console.log(anotherObj);
// console.log(obj);
// console.log(equal);

// let name = 10;
// let age = 10;

// let equal = name === age;



// function example(name, age){
//     console.log("Hello everone! My name is " + name + " and my age is " + age);
// }

// example('Firdavs', 22);

// console.log(example);

// const anyotherObj = {...obj, age: 32, nation: "uzbek", job: "Web Developer"};
// console.log(anyotherObj);


let arr = [
    {ordinal: 1, name: "Nexia is the best one"},
    {ordinal: 4, name: "Nexia is the best one"},
    {ordinal: 2, name: "Nexia is the best one"},
    {ordinal: 3, name: "Nexia is the best one"},
]

const locations= ["Uzb", "USA", "Canada", "Seoul", "Tokyo"]

arr.push({ordinal: 5, name: "Nexia is the best one"});

// Read..................................................................................

let newArr = arr.map((value, index) => {
    value.location =  locations[value.ordinal -1]
    
    return value;
})

let sortByYear = newArr.sort((a,b)=> a.ordinal - b.ordinal)

// console.log(sortByYear);



// Delete.................................................................................

// const deleteUser = (id) =>{
//     sortByYear = sortByYear.filter((value) => value.ordinal !== id)

// }
// deleteUser(1)
// console.log(sortByYear);

// Create..................................................................................

const addUser = (user) => {
    sortByYear = [...sortByYear, {ordinal: arr.length +1, ...user}]
}

addUser({name:"Damas", location: "Italy"})
// console.log(sortByYear);


// Uptade..................................................................................

const onUpdate = (arrs) => {
    sortByYear = sortByYear.map(value => (value.ordinal == arrs.ordinal) ? {...value, ...arrs} : value);
}

onUpdate({ordinal: 6, name: "Mers" })
console.log(sortByYear);
