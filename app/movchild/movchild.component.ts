import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-movchild',
  templateUrl: './movchild.component.html',
  styleUrls: ['./movchild.component.css']
})
export class MovchildComponent implements OnInit {
  @Input() carName; 
  constructor() { }

  ngOnInit() {
  }

}
