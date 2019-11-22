var a;
var a='ashwini'
a='bd'
console.log(a)
for(var i=0;i<5;i++){
    console.log(i)
}
console.log('i value',i)
console.log('==================using let keyword==========')
let b;
// let b=10; error
// b=20; re assignment
b=30;
console.log(b)
// no hoisting
for(let j=0;j<5;j++){
    console.log(j)
}
// console.log('j value',j)
console.log('=======================using const keyword===============')
// const c; error, we should intialz
const c=10;
// const c; no redeclaration
// c=30;no re assignment
console.log(c)
// no hoisting

