import { Component, OnInit } from '@angular/core';
import { ProductserviceService } from '../productservice.service';

@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css']
})
export class AddComponent implements OnInit {

  constructor(private service : ProductserviceService) { }
msg;
  addProduct(form) {
    this.service.addproduct(form.value).subscribe(res => {
       console.log('product added successfully');
       this.msg='product Added Successfully...!';
      
       form.reset();
    }, err => {
       console.log('product not added');
    });
 }
  ngOnInit() {
  }

}
