import React from "react";
import Product from "./components/Product";
import UserReview from "./components/UserReview";
import "./index.css";

function App() {
  const productData = [
    {
      productName: "Book",
      productPrice: "10.99",
      productImage:
        "https://m.media-amazon.com/images/S/compressed.photo.goodreads.com/books/1586722975i/2767052.jpg",
    },
    {
      productName: "Food",
      productPrice: "6.99",
      productImage:
        "https://img.magnific.com/free-psd/roasted-chicken-dinner-platter-delicious-feast_632498-25445.jpg?semt=ais_hybrid&w=740&q=80",
    },
    {
      productName: "Toy",
      productPrice: "24.99",
      productImage:
        "https://media.istockphoto.com/id/909772478/photo/brown-teddy-bear-isolated-in-front-of-a-white-background.jpg?s=612x612&w=0&k=20&c=F4252bOrMfRTB8kWm2oM2jlb9JXY08tKCaO5G_ms1Uw=",
    },
  ];

  return (
    <>
      <section id="products">
        {productData.map((product) => (
          <Product
            productName={product.productName}
            productImage={product.productImage}
            productPrice={product.productPrice}
          />
        ))}
      </section>
      <section id="reviews">
        <UserReview
          reviewContent="Lorem ipsum dolor sit amet, consectetur adipisicing elit. Iste ex illo incidunt nostrum unde et minima neque autem in placeat molestiae ratione tempora earum, itaque harum quas temporibus velit deserunt?"
          reviewRating={4.5}
        />
        <UserReview
          reviewContent="Lorem ipsum dolor sit amet consectetur adipisicing elit. A magni quis at dolorem voluptatem. Ipsum quis, deleniti ea voluptas in, quam perferendis, harum dolorum magnam saepe fugit natus praesentium culpa?"
          reviewRating={4}
        />
      </section>
    </>
  );
}

export default App;
