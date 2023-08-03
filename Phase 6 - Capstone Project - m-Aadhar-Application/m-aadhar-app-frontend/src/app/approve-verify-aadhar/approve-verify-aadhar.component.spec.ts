import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ApproveVerifyAadharComponent } from './approve-verify-aadhar.component';

describe('ApproveVerifyAadharComponent', () => {
  let component: ApproveVerifyAadharComponent;
  let fixture: ComponentFixture<ApproveVerifyAadharComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ApproveVerifyAadharComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ApproveVerifyAadharComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
