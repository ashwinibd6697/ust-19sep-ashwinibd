import { Component, OnInit } from '@angular/core';
import { NgModel, NgForm, FormGroup, FormControl, Validators } from '@angular/forms';
import { CustomValidation } from './custom.validation';

@Component({
  selector: 'app-forms',
  templateUrl: './forms.component.html',
  styleUrls: ['./forms.component.css']
})
export class FormsComponent implements OnInit {
  get text(){
    return this.form.get('text');
  }
  get password(){
    return this.form.get('password');
  }
  get url(){
    return this.form.get('url')
  }
  constructor() { }
 form=new FormGroup({
   text:new FormControl('',[Validators.required]),
   password: new FormControl('',[Validators.required]),
   url:new FormControl('',[Validators.required])
 })
  ngOnInit() {
  }
 login(form){
   console.log(form);
 }
}
