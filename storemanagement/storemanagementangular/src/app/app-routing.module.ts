import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddComponent } from './add/add.component';
import { HomeComponent } from './home/home.component';
import { OrderComponent } from './order/order.component';


const routes: Routes = [
  {path:"add" , component : AddComponent},
  {path : "get",component : HomeComponent},
  {path:"cart", component : OrderComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
