import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { VootComponent } from './voot.component';

describe('VootComponent', () => {
  let component: VootComponent;
  let fixture: ComponentFixture<VootComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ VootComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(VootComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
