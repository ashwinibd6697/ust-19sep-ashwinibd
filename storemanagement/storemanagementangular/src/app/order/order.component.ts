import { Component, OnInit } from '@angular/core';
import { ProductserviceService } from '../productservice.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-order',
  templateUrl: './order.component.html',
  styleUrls: ['./order.component.css']
})
export class OrderComponent implements OnInit {

 
  products: any[] = [];
msg;


  constructor(private service: ProductserviceService, private router: Router) {
    this.display();
  }

   display(){
    this.service.viewCart().subscribe(data => {
      console.log(data);
      this.products = data.cart;

    });
   }
order(p){
  console.log(p);
 this.service.issue(p).subscribe(data => {
       this.msg='product is added to cart';
        console.log(data);
        this.display();
      
      });
   
}
  ngOnInit() {
  }

}
