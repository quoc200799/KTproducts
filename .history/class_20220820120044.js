//vấn đề 1: class
class Human {
    contructor() {
        this.name = 'Luong Quoc';
        this.age = 10;
        this.demo = function () {

        }
    }
    sayHello() {
        console.log('Hunan Hello', this);
    }
}
class student extends Human {
    contructor() {
        // super();       //Human contructor
        this.score = 0;
    }
}
var st1 = new student();
console.log(st1);


// Destructoring

var { x, y } = { x: 1, y: 2 }//mapping object theo key
console.log(x, y); //output 1 2
var [, b] = [1, 2] //mapping theo vị trí
console.log(b) //output 2

// import and export