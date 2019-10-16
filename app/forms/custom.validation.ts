import { AbstractControl, ValidationErrors } from '@angular/forms';
// import { getMaxListeners } from 'cluster';




export class CustomValidation{
constructor(){}
    static unique(control:AbstractControl):ValidationErrors|null{
        if(control.value==='as@gmail.com'){
            return {unique:true}
        } else{
            return null;
        }

    }
}

