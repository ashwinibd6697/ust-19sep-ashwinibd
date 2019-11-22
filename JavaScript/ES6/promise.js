const m=new Promise(function(a,r){
      if(30>20)
      a('success')
      else
      r('failure')
})

m.then(function(msg){
console.log('good!!',msg)}).catch(function(rej){console.log('rejected',rez)})