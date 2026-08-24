import React, { useContext, useState, type JSX } from "react";
import { SumContext } from "./SumContext";

export const InputComponent = (): JSX.Element => {
  const context = useContext(SumContext);

  // 1. Context Safety Check
  // Because we typed SumContext as potentially 'undefined' in the previous file,
  // we must ensure it exists before trying to destructure calculateSum.
  if (!context) {
    throw new Error("InputComponent must be used within a SumProvider");
  }
  const { calculateSum } = context;

  // 2. Explicitly type the state
  const [num1, setNum1] = useState<number>(0);
  const [num2, setNum2] = useState<number>(0);

  // 3. Type the Form Event
  // We use React.FormEvent and specify that it comes from an <HTMLFormElement>
  const handleSubmit = (e: React.FormEvent<HTMLFormElement>): void => {
    e.preventDefault();
    calculateSum(num1, num2);
  };

  return (
    <form onSubmit={handleSubmit}>
      <label>
        Number 1:
        {/* 4. Type the Change Event */}
        {/* We use React.ChangeEvent and specify it comes from an <HTMLInputElement> */}
        <input
          type="number"
          onChange={(e: React.ChangeEvent<HTMLInputElement>) =>
            setNum1(+e.target.value)
          }
        />
      </label>
      <label>
        Number 2:
        <input
          type="number"
          onChange={(e: React.ChangeEvent<HTMLInputElement>) =>
            setNum2(+e.target.value)
          }
        />
      </label>
      <button type="submit">Add</button>
    </form>
  );
};
