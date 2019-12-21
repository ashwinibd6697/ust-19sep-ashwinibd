import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-car1',
  templateUrl: './car1.component.html',
  styleUrls: ['./car1.component.css']
})
export class Car1Component implements OnInit {
  @Input() carName; 

  constructor() { }

  ngOnInit() {
  }

}
