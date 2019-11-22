function first(ashwini){
    setTimeout(function(){
        console.log('first function executed')
        ashwini();
    },3)
    //time in milliseconds
    //  console.log('executed')
}
function second(){
    console.log('second function executed')
}
first(second)
// Passing one fn as a parameter to another fn is called as callback function