const d={
     nam:"asdf",
     ag1:12
}
const s={
    name:"wer",
    ag:13,
    p:1234543
}
const w={...s,...d};
console.log(w);
const q={...s}
// console.log(q.ag+300)
let s1=q.p+23;
console.log(q);

console.log(s)
function add(...n){
    let t=0;
    for(let i=0;i<n.length;i++)
    
    t=t+n[i];
    console.log(t);
}
add(10,80,90,120);