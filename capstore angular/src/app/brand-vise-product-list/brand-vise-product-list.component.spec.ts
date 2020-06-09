import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BrandViseProductListComponent } from './brand-vise-product-list.component';

describe('BrandViseProductListComponent', () => {
  let component: BrandViseProductListComponent;
  let fixture: ComponentFixture<BrandViseProductListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BrandViseProductListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BrandViseProductListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
