import React, { useState, useEffect } from "react";

const DEBOUNCE_DELAY = 1000; // 500 milliseconds

const DebouncedInput = () => {
  // 1. Stores the current raw value from the input field
  const [inputValue, setInputValue] = useState<number>(0);
  // 2. Stores the value that is updated only after the debounce delay
  const [debouncedValue, setDebouncedValue] = useState<number>(0);
  // 3. Handle input change
  const onChangeInput = (event: any) => {
    setInputValue(event.target.value);
  };
  // 4. Implement Debouncing Logic
  useEffect(() => {
    const myTimeout = setTimeout(() => {
      setDebouncedValue(inputValue);
    }, 500);
    return () => {
      clearTimeout(myTimeout);
    };
  }, [inputValue]);
  // 5. Render the Component
  return (
    <>
      <input
        type="text"
        id="userInputValue"
        value={inputValue}
        onChange={onChangeInput}
      />
      <p>{debouncedValue}</p>
    </>
  );
};

export default DebouncedInput;
