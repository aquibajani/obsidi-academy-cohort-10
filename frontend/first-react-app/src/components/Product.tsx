import React from "react";

type Props = {
  productName: string;
  productPrice: string;
  productImage: string;
};

function Product({ productName, productPrice, productImage }: Props) {
  return (
    <div>
      <h2>{productName}</h2>
      <p>CAD {productPrice}</p>
      <img src={productImage} alt={productName} />
      <button>Buy Now</button>
    </div>
  );
}

export default Product;
