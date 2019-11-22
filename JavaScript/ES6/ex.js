const emp=new Promise(function(resolve,reject){
     if(30>20){
         resolve([{
            name:'Madhu',
            age :22},{
                name:'Madhu',
                age :22}])
     }
     else
     reject('failure');
})
emp.then(function(data){
    console.log("Employees Data",data)

}).catch(function(d){
    console.log('failure',d)
    
})