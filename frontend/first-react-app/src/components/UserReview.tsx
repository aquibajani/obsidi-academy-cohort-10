import React from "react";

type Props = {
  reviewContent: string;
  reviewRating: number;
};

export default function UserReview({ reviewContent, reviewRating }: Props) {
  return (
    <div>
      <p>{reviewContent}</p>
      <p>Rating: {reviewRating}</p>
    </div>
  );
}
