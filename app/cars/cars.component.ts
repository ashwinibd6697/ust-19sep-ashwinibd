import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-cars',
  templateUrl: './cars.component.html',
  styleUrls: ['./cars.component.css']
})
export class CarsComponent implements OnInit {
  selectedCar;
  cars = [{
    name: 'bmw',
    imgUrl: 'https://cdn.pixabay.com/photo/2015/09/02/12/25/bmw-918408__340.jpg',
    details:"Model : 1945 The Maruti Swift has 1 Diesel Engine and 1 Petrol Engine on offer. The Diesel engine is 1248 cc while the Petrol engine is 1197 cc. Depending upon the variant and fuel type the Swift has a mileage of 22.0 to 28.4 kmpl. The Swift is a 5 seater Hatchback and has a length of 3840mm."  },
    {
      name: 'benz',
      imgUrl: 'https://cdn.pixabay.com/photo/2017/03/27/14/56/auto-2179220__340.jpg',
      details:"Model : 1945 The Maruti Swift has 1 Diesel Engine and 1 Petrol Engine on offer. The Diesel engine is 1248 cc while the Petrol engine is 1197 cc. Depending upon the variant and fuel type the Swift has a mileage of 22.0 to 28.4 kmpl. The Swift is a 5 seater Hatchback and has a length of 3840mm."    
    },
      {
        name: 'audi',
        imgUrl: 'https://cdn.pixabay.com/photo/2015/01/19/13/51/car-604019__340.jpg',
        details:"Model : 1945 The Maruti Swift has 1 Diesel Engine and 1 Petrol Engine on offer. The Diesel engine is 1248 cc while the Petrol engine is 1197 cc. Depending upon the variant and fuel type the Swift has a mileage of 22.0 to 28.4 kmpl. The Swift is a 5 seater Hatchback and has a length of 3840mm."
      },
        {
          name: 'maruti',
          imgUrl: 'https://cdn.pixabay.com/photo/2014/10/22/17/22/ford-498244_960_720.jpg',
          details:"Model : 1945 The Maruti Swift has 1 Diesel Engine and 1 Petrol Engine on offer. The Diesel engine is 1248 cc while the Petrol engine is 1197 cc. Depending upon the variant and fuel type the Swift has a mileage of 22.0 to 28.4 kmpl. The Swift is a 5 seater Hatchback and has a length of 3840mm."}
  ]
  constructor() { }

  ngOnInit() {
  }
sendCar(car){
  this.selectedCar = car;
  console.log(car);
}
}
