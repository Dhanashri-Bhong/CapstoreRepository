import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class ProductServiceService {

  constructor(private http: HttpClient, private router: Router) { }

  productListbyBrand: any;

  getProductList() {
    return this.http.get<any>('http://localhost:8080/viewProduct');

  }

  getProductBrandList() {
    return this.http.get<any>('http://localhost:8080/viewProductByBrandName');

  }

  productsByBrandName(brandName) {
    console.log(brandName);
    this.http.post<any>('http://localhost:8080/getProductListByBrandName', brandName).subscribe((response) => {
      console.log('..........product list bye name', response);
      //this.roomResponse = response;
      this.productListbyBrand = response.productList;
      console.log(this.productListbyBrand);
      // if (this.roomList != null) {
      this.router.navigateByUrl('/brand-vise-product-list');
      // }

    },
      err => {
        console.log(err);
      }
    );
    return this.productListbyBrand;
  }
}
