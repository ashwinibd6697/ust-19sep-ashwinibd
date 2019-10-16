import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { OutchildComponent } from './outchild.component';

describe('OutchildComponent', () => {
  let component: OutchildComponent;
  let fixture: ComponentFixture<OutchildComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ OutchildComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(OutchildComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
