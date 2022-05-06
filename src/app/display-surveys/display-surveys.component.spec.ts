import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DisplaySurveysComponent } from './display-surveys.component';

describe('DisplaySurveysComponent', () => {
  let component: DisplaySurveysComponent;
  let fixture: ComponentFixture<DisplaySurveysComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DisplaySurveysComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DisplaySurveysComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
