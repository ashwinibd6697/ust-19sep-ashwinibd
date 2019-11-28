import { Component } from '@angular/core';
@Component({
    selector: 'app-login',
    templateUrl: './login.component.html',
    styleUrls: ['./login.component.css']
})
export class LoginComponent {
    showHide = false;
    constructor() {
        setTimeout(() => {
            this.showHide = true;
        }, 5000);
    }
}
