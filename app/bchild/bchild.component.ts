import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-bchild',
  templateUrl: './bchild.component.html',
  styleUrls: ['./bchild.component.css']
})
export class BchildComponent implements OnInit {
  @Input() carName;
  constructor() { }

  ngOnInit() {
  }

}
