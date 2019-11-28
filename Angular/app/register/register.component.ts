import { Component, OnInit, DoCheck, AfterViewInit, AfterViewChecked, OnDestroy } from '@angular/core';

import { NgForm } from '@angular/forms';
import { UserService } from '../user.service';
@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit, DoCheck, AfterViewInit, AfterViewChecked, OnDestroy{
   users;
   selectedUser;
   today=new Date();
  constructor(public service: UserService) {
    console.log('constructor is executed');
    this.getData();
   }
  ngOnInit() {
    console.log('ngOnInit is executed');
  }
  ngDoCheck() {
    console.log('ngDoCheck is executed');
  }
   ngAfterViewInit(){
     console.log('activeinit exctd');
  }
   ngAfterViewChecked(){
     console.log('check is executed');
 }
 ngOnDestroy(){
   console.log('destroyed')
 }
  loginData(form: NgForm) {
    console.log(form.value);
    this.service.postUser(form.value).subscribe(data => {
      console.log(data);
    }, err => {
      console.log(err);
    }, () => {
      console.log('data posted sucessfully');
    });

  }
  getData() {
    this.service.getUsers().subscribe(data => {
      console.log(data);
      this.users = data;
    }, err => {
      console.log(err);
    }, () => {
      console.log('data got sucessfully');
    });
  }
  deleteData(user){
    console.log(user);
    this.service.deleteUser(user.id).subscribe(data => {
      console.log(data);
      // this.users = data;
    }, err => {
      console.log(err);
    }, () => {
      console.log('data delete sucessfully');
    });
  }
  selectUser(user){
    console.log(user);
    this.selectedUser = user;
  }
  updateData(form){
    console.log(form.value);
    this.service.updateUser(form.value.id,form.value).subscribe(data => {
      console.log(data);
      // this.users = data;
    }, err => {
      console.log(err);
    }, () => {
      console.log('data updated sucessfully');
    });
  }
}
