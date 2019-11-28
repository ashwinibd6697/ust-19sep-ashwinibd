import { ElementRef, Directive, HostBinding, HostListener } from '@angular/core';

@Directive(
    {
        // tslint:disable-next-line: directive-selector
        selector : '[custDir]'
    }
)






export class CustomDirective {
    constructor(private el: ElementRef) {
        this.el.nativeElement.style.backgroundColor = 'red';
    }
    @HostBinding('style.backgroundColor') cname = 'yellow';
    @HostListener('mouseenter') m() {
        this.el.nativeElement.style.backgroundColor = 'red';
    }
    @HostListener('mouseleave') n() {
        this.el.nativeElement.style.backgroundColor = 'blue';
    }
}
