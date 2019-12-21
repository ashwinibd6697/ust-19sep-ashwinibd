import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-mobchild',
  templateUrl: './mobchild.component.html',
  styleUrls: ['./mobchild.component.css']
})
export class MobchildComponent implements OnInit {
  @Input() carName; 
  constructor() { }

  ngOnInit() {
  }

}
