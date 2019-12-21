import { Component, OnInit } from '@angular/core';
import { ProductserviceService } from '../productservice.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

 
  products: any[] = [];
msg;


  constructor(private service: ProductserviceService, private router: Router) {
    this.display();
  }

   display(){
    this.service.viewProducts().subscribe(data => {
      console.log(data);
      this.products = data.products;

    });
   }


  sendRequest(p,i) {
   
    
     console.log(p);

   
    
   
   
     this.service.addtocart(p,5).subscribe(data => {
       this.msg='product is added to cart';
        console.log(data);
        this.display();
      
      });
   
   }

  ngOnInit() {
  }

}
