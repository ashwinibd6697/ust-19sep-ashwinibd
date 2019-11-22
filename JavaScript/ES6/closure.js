function outerFunction(a){
    function innerFunction(){
  let count;
  count=a+20;
  return count
    }
return innerFunction;
}
let innerf=outerFunction(10);
  //  let cnt=innerf();
  //  console.log('sum',cnt)
  console.log(innerf);