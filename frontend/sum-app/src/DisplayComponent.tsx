import { useContext } from "react";
import type { JSX } from "react/jsx-runtime";
import { SumContext } from "./SumContext";

export const DisplayComponent = (): JSX.Element => {
  const context = useContext(SumContext);

  // 1. Context Safety Check
  // We must verify the component is wrapped in the Provider before pulling out data
  if (!context) {
    throw new Error("DisplayComponent must be used within a SumProvider");
  }

  // 2. Destructure safely
  const { sum } = context;

  return (
    <div>
      {/* 3. TypeScript already knows 'sum' is a number! */}
      <h2>Sum: {sum}</h2>
    </div>
  );
};
