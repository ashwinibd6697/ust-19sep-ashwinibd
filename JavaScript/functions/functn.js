//console.log('named functin.................')
//add(10,20); it works only for named fn
function add(a,b)
{
  console.log('sum=',a+b);

}add(10,20)

function add1(a,b,c)
{
  console.log('sum1=',a+b+c);

}
add1(10,20,30)
console.log('..........................')
//console.log('function expressin............')
//var sum=s(20,30) we cant call fn before defining except named function
var s=function(a,b)
{
    return a-b;
}
var sum=s(20,30)
console.log('sub=',sum)
var s1=function(a,b)
{
    return a-b;
}
var sum1=s(30)
console.log('diffrence=',sum1)
console.log('..........................');
//console.log('self invoked fuunctin.............');
(function(a,b)
{
  console.log('sum=',a+b);

})(10,20)

//console.log('fat arrow fn................    ')
//fat(10,20)
var fat=(a,b)=>{ console.log(a+b)} 
fat(10,20)
