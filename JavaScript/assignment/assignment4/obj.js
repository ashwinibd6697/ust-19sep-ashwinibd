const items=[
    {item:'bangles',
     id: 1,
     price:100},
    {item:'lipstick',
     id:2,
    price:200},
    {item:'wathes',
     id:3,
     price:10000},
     {item:'bike',
      id:4,
      price:1000000}]
      
      const arr=items.map((item)=>{
        //console.log("item:",items[i].item)
        //nsole.log('id:',items[i].id)
            item.price=item.price+300
           return item;
          })
          console.log(items)
        //   console.log('price:',arr)
      //const arr2=items.filter((v,i)=>items[i].price>1000)
     
      const arr2=items.filter((v,i)=>v.price>1000)
      console.log(arr2)