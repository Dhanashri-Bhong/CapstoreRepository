import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { Product } from '../product-information';
import { ProductServiceService } from '../product-service.service';
@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css'],
})
export class ProductListComponent implements OnInit {

  public productList: Product[];

  public searchProductbyName: any;

  public BrandName: any;

  public productBrandList: any[];
  constructor(public productService: ProductServiceService, private router: Router) {
    this.getProductList();
    this.getProductBrandList();
  }

  public getProductList() {
    this.productService.getProductList().subscribe((data) => {
      console.log(data.productList);
      this.productList = data.productList;
    },
      (err) => {
        console.log(err);
      },
    );
  }

  public getProductBrandList() {
    this.productService.getProductBrandList().subscribe((data) => {
      console.log(data.productBrandList);
      this.productBrandList = data.productBrandList;
      console.log(this.productBrandList);
    },
      (err) => {
        console.log(err);
      },
    );
  }

  public selectedBrandName() {
    console.log(this.BrandName);
    this.productsByBrandName(this.BrandName);
  }

  public productsByBrandName(data) {
    this.productService.productsByBrandName(data);
  }

  public ngOnInit(): void {
  }

}
