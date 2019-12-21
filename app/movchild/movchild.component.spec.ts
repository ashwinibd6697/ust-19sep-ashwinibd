import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MovchildComponent } from './movchild.component';

describe('MovchildComponent', () => {
  let component: MovchildComponent;
  let fixture: ComponentFixture<MovchildComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MovchildComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MovchildComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
