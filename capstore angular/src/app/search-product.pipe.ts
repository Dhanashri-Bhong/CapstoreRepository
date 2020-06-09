import { Pipe, PipeTransform } from '@angular/core';
import { Product } from './product-information';

@Pipe({
  name: 'searchProduct'
})
export class SearchProductPipe implements PipeTransform {

  transform(productList: Product[], searchProductbyName: string): Product[] {
    if (searchProductbyName === undefined) {
      return productList;
    } else {
      return productList.filter(product => {
        return product.productName.toLowerCase().includes(searchProductbyName.toLowerCase());

      });
    }
  }

}
