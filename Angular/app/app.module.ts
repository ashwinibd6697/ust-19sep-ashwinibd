import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { HelpComponent } from './help/help.component';
import { LoginComponent } from './directive/if/login/LoginComponent';
import { RouterModule } from '@angular/router';
import { from } from 'rxjs';
import { FooterComponent } from './footer/footer.component';
import { BindingComponent } from './binding/binding.component';
import { PropertyComponent } from './binding/property/property.component';
import { EventComponent } from './binding/event/event.component';
import { TwoWayComponent } from './binding/two-way/two-way.component';
import { FormsModule, ReactiveFormsModule} from '@angular/forms';
import {HttpClientModule } from '@angular/common/http';
import { DirectiveComponent } from './directive/directive.component';
import { IfComponent } from './directive/if/if.component';
import { ForComponent } from './directive/for/for.component';
import { NgSwitchComponent } from './directive/ng-switch/ng-switch.component';
import { CustomDirective } from './directive/custom.directive';
import { RegisterComponent } from './register/register.component';
import { AssignmentComponent } from './assignment/assignment.component';
import { Form1Component } from './assignment/form1/form1.component';
import { Form2Component } from './assignment/form2/form2.component';
import { Form3Component } from './assignment/form3/form3.component';
import { Form4Component } from './assignment/form4/form4.component';
import { RegisterPageComponent } from './register-page/register-page.component';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';
import { CommentComponent } from './comment/comment.component';
import { CommentdetailsComponent } from './commentdetails/commentdetails.component';
import { DollarPipe } from './dollar.pipe';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    AboutComponent,
    HelpComponent,
    LoginComponent,
    FooterComponent,
    BindingComponent,
    PropertyComponent,
    EventComponent,
    TwoWayComponent,
    DirectiveComponent,
    IfComponent,
    ForComponent,
    NgSwitchComponent,
     CustomDirective,
     RegisterComponent,
     AssignmentComponent,
     Form1Component,
     Form2Component,
     Form3Component,
     Form4Component,
     RegisterPageComponent,
     ParentComponent,
     ChildComponent,
     CommentComponent,
     CommentdetailsComponent,
     DollarPipe
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
     RouterModule.forRoot([
       {path: 'home', component: HomeComponent},
       {path: 'about', component: AboutComponent},
       {path: 'help', component: HelpComponent},
       {path: 'login', component: LoginComponent},
       {path: 'property', component: PropertyComponent},
       {path: 'event', component: EventComponent},
       {path : 'twoway', component: TwoWayComponent},
       {path : 'for', component: ForComponent},
       {path : 'switch', component : NgSwitchComponent},
       {path : 'reg', component : RegisterComponent},
       {path: 'f1', component : Form1Component},
       {path: 'f2', component : Form2Component},
       {path: 'f3', component : Form3Component},
       {path: 'f4', component : Form4Component},
       {path: 'rt', component : RegisterPageComponent},
       {path: 'parent', component : ParentComponent},
       {path: 'comment', component : CommentdetailsComponent}
     ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
