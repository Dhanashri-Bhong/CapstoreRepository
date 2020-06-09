export class Product {

    constructor(
        public productId: number,
        public productName: string,
        public productPrice: number,
        public productQuantity: number,
        public productCategory: string,
        public productImage: string,
        public productDiscount: number,
        public productDiscountExpireDate: Date,
        public brandName: string,
        public email: string,
        public productRating: number,

    ) { }
}
