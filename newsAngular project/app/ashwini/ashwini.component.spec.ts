import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AshwiniComponent } from './ashwini.component';

describe('AshwiniComponent', () => {
  let component: AshwiniComponent;
  let fixture: ComponentFixture<AshwiniComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AshwiniComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AshwiniComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
