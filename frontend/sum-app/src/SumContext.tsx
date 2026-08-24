import React, {
  createContext,
  useState,
  type JSX,
  type ReactNode,
} from "react";

// 1. Define the shape of the data and functions our context will hold
interface SumContextType {
  sum: number;
  // This tells TypeScript: "calculateSum is a function that takes two numbers and returns nothing."
  calculateSum: (a: number, b: number) => void;
}

// 2. Initialize the Context with our type, defaulting to undefined for safety
export const SumContext = createContext<SumContextType | undefined>(undefined);

// 3. Define the props for the Provider
interface SumProviderProps {
  // ReactNode is the standard type for anything that can be rendered inside a React component!
  children: ReactNode;
}

// 4. Apply the types to the component signature
export const SumProvider = ({ children }: SumProviderProps): JSX.Element => {
  const [sum, setSum] = useState<number>(0);

  // 5. Explicitly type the parameters and the return type of the helper function
  const calculateSum = (a: number, b: number): void => {
    setSum(a + b);
  };

  return (
    // TypeScript will now verify that the object passed to 'value'
    // exactly matches the SumContextType interface!
    <SumContext.Provider value={{ sum, calculateSum }}>
      {children}
    </SumContext.Provider>
  );
};
