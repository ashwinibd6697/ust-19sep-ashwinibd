function factor(num)
{
    var i;
    var n=1;
    for(i=1;i<=num;i++)
        n=n*i;
      console.log('factorial of a given number=',n);
      console.log('...............................');
}factor(3)
console.log('anonympus function')
var f=function(num1)
{var n1=1;
    for(var i=1;i<=num1;i++)
     n1=n1*i
    console.log('factorial of anonymous function=',n1);
    console.log('.................................');
}
f(4)

console.log('self invoked function ');
(function(n)
{
    var d=1;
    for(var i=1;i<=n;i++)
    d=d*i
    console.log('factorial of invoked dunction is  ',d);
    console.log('..........................')
})(5)
console.log('fat functin')
var r=n=>{
    var s=1;
    for(var i=1;i<=n;i++)
    s=s*i;
    console.log('factorial of fat fun is  ',s)
}
r(4);
console.log('.................................')