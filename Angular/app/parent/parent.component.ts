import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {
  selectedCar;
  cars = [{
    name: 'wings',
    imgUrl: 'https://image.shutterstock.com/image-photo/fried-chicken-basket-on-wooden-600w-167023619.jpg'},
    {
      name: 'leg piece',
      imgUrl: 'https://image.shutterstock.com/image-photo/drum-stick3-600w-209023951.jpg'},
      {
        name: 'fish',
        imgUrl: 'https://image.shutterstock.com/image-photo/grilled-fish-260nw-580964716.jpg'},
        {
          name: 'squid',
          imgUrl: 'https://cdn.pixabay.com/photo/2017/08/30/04/23/food-2695883__340.jpg'}
  ]
  constructor() { }

  ngOnInit() {
  }
sendCar(car){
  this.selectedCar = car;
  console.log(car);
}
}
