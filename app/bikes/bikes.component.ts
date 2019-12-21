import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-bikes',
  templateUrl: './bikes.component.html',
  styleUrls: ['./bikes.component.css']
})
export class BikesComponent implements OnInit {
  s1;
  cars = [{
    name: 'Royal Enfield',
    imgUrl: 'https://cdn.pixabay.com/photo/2015/09/08/21/02/superbike-930715__340.jpg',
    details:'Model : 1945 The Maruti Swift has 1 Diesel Engine and 1 Petrol Engine on offer. The Diesel engine is 1248 cc while the Petrol engine is 1197 cc. Depending upon the variant and fuel type the Swift has a mileage of 22.0 to 28.4 kmpl. The Swift is a 5 seater Hatchback and has a length of 3840mm.'},
    {
      name: 'pulsur',
      imgUrl: 'https://cdn.pixabay.com/photo/2014/12/16/03/37/motor-cycle-569865__340.jpg',
      details:'Model : 1945 The Maruti Swift has 1 Diesel Engine and 1 Petrol Engine on offer. The Diesel engine is 1248 cc while the Petrol engine is 1197 cc. Depending upon the variant and fuel type the Swift has a mileage of 22.0 to 28.4 kmpl. The Swift is a 5 seater Hatchback and has a length of 3840mm.'},
      {
        name: 'hdgfd',
        imgUrl: 'https://cdn.pixabay.com/photo/2016/03/27/17/59/vintage-1283299__340.jpg',
        details: 'Model : 1945 The Maruti Swift has 1 Diesel Engine and 1 Petrol Engine on offer. The Diesel engine is 1248 cc while the Petrol engine is 1197 cc. Depending upon the variant and fuel type the Swift has a mileage of 22.0 to 28.4 kmpl. The Swift is a 5 seater Hatchback and has a length of 3840mm.'},
        {
          name: 'sdfdsg',
          imgUrl: 'https://cdn.pixabay.com/photo/2015/08/27/09/06/bike-909690__340.jpg',
          details:'Model : 1945 The Maruti Swift has 1 Diesel Engine and 1 Petrol Engine on offer. The Diesel engine is 1248 cc while the Petrol engine is 1197 cc. Depending upon the variant and fuel type the Swift has a mileage of 22.0 to 28.4 kmpl. The Swift is a 5 seater Hatchback and has a length of 3840mm.'}
  ];
  constructor() { }

  ngOnInit() {
  }
  sendCar(i) {
    this.s1 = i;
    console.log(i);
  }
}
