function getData(){
    alert('Dileep Ellidiyappa')
}
function changecolor(){
    let h1=document.getElementById('h')
    h1.style.color='purple';
   // h1.style.fontSize='100px';
}
function removecolor(){
    let h2=document.getElementById('h')
h2.style.color='red'
}
function printHello(){
   // console.log('Hello!!');
   let uN=document.getElementById('q').value
   document.getElementById('show').textContent=uN;
}
let name='Kiran'
let age=22
let pno=7892648423
console.log('name is'+name +'age is',age +'phone no',pno);
console.log('name is ${name} age is ${age} +phone no ${pno}');
console.log('name is'+name +'age is',age +'phone no',pno);



