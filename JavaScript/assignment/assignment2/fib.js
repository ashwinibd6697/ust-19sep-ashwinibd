function fib(n)
{
    var a=0;
    var b=1;
    var c;
    console.log(a,b);
    for(var i=1;i<=n;i++)
    {
        c=a+b;
        console.log(c);
        a=b;
        b=c;
    }
     
} fib(4)
var f=function(n)
{
    var a=0;
    var b=1;
    var c;
    console.log(a,b);
    for(var i=1;i<=n;i++)
    {
        c=a+b;
        console.log(c);
        a=b;
        b=c;
    }
}
f(4);
(function(n)
{
    var a=0;
    var b=1;
    var c;
    console.log(a,b);
    for(var i=1;i<=n;i++)
    {
        c=a+b;
        console.log(c);
        a=b;
        b=c;
    }
})(4);
var e=n=>{
    var a=0;
    var b=1;
    var c;
    console.log(a,b);
    for(var i=1;i<=n;i++)
    {
        c=a+b;
        console.log(c);
        a=b;
        b=c;
    }
}
e(4)