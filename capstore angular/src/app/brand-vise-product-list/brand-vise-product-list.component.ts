import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Product } from '../product-information';
import { ProductServiceService } from '../product-service.service';

@Component({
  selector: 'app-brand-vise-product-list',
  templateUrl: './brand-vise-product-list.component.html',
  // tslint:disable-next-line: object-literal-sort-keys
  styleUrls: ['./brand-vise-product-list.component.css'],
})
export class BrandViseProductListComponent implements OnInit {

  public productListbyBrand: Product[];
  // price: number;
  // productPrice: any;
  public searchProductbyName: any;
  // priceList = [];
  public sortedPriceList: Product[];
  public headerName: string[];
  public sortedColumn: string;
  constructor(public productService: ProductServiceService, private router: Router) {
    this.getlist();
    this.headerName = ['productName', 'productPrice'];
  }
  public getlist() {
    if (this.productService.productListbyBrand != null) {
      this.productListbyBrand = this.productService.productListbyBrand;
      console.log('........................', this.productListbyBrand);
    }
  }

  // getsortedpricelist() {

  //   this.sortedPriceList = this.productListbyBrand.slice(0);

  //   this.sortedPriceList.sort((left, right): number => {
  //     if (left.productPrice < right.productPrice) {
  //       return -1;
  //     }
  //     if (left.productPrice > right.productPrice) {
  //       return 1;
  //     }
  //     return 0;
  //   });

  //   console.log('sorted................', this.sortedPriceList);

  // }
public ngOnInit() {

  }

}
