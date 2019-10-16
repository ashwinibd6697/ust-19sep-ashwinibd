import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';

import { AppComponent } from './app.component';
import { NavComponent } from './nav/nav.component';

import { HttpClientModule } from '@angular/common/http';
import { RouterModule } from '@angular/router';

import { FormsComponent } from './forms/forms.component';

import { LoginComponent } from './login/login.component';
import { MoviesComponent } from './movies/movies.component';
import { HttpClient } from 'selenium-webdriver/http';

@NgModule({
  declarations: [
    AppComponent,
    NavComponent,
    FormsComponent,
    MoviesComponent,
    LoginComponent
  ],
  imports: [
    BrowserModule,
     HttpClientModule,
    FormsModule,
    
   ReactiveFormsModule,
    RouterModule.forRoot([
    
    {path : 'l', component : LoginComponent},
    {path : 'm', component : MoviesComponent},
    {path: 'f',component : FormsComponent},
    
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
