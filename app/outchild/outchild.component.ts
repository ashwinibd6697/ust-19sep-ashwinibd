import { Component, OnInit, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-outchild',
  templateUrl: './outchild.component.html',
  styleUrls: ['./outchild.component.css']
})
export class OutchildComponent implements OnInit {
  @Output() getComment=new EventEmitter();
  constructor() { }

  ngOnInit() {
  }
comment(form){
  console.log(form.value);
  this.getComment.emit(form.value);
}
}
