import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MobchildComponent } from './mobchild.component';

describe('MobchildComponent', () => {
  let component: MobchildComponent;
  let fixture: ComponentFixture<MobchildComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MobchildComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MobchildComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
