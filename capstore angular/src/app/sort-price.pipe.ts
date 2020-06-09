import { Pipe, PipeTransform } from '@angular/core';
import { Product } from './product-information';

@Pipe({
  name: 'sortPrice',
  pure: true
})
export class SortPricePipe implements PipeTransform {

  transform(array: any[], field: string): any[] {
    console.log('field.........', field);
    // if (!Array.isArray(array)) {
    //   return;
    // }
    let sortedArray = array.sort((a, b) => {
      console.log('.... insode', a.productPrice, a[field])
      if (a[field] > b[field]) {
        return 1;
      }
      if (a[field] < b[field]) {
        return -1;
      }
      return 0;

    });
    console.log('sorted', array);
    return sortedArray;
  }
}
