import React, { type JSX } from "react";
import { useSelector, useDispatch } from "react-redux";
import { decrement, increment, reset } from "./redux/slice";
// Import the types we exported from our store configuration
import type { RootState, AppDispatch } from "./redux/store";

// 1. We type the styles object using React's built-in CSSProperties interface.
const styles: React.CSSProperties = {
  margin: "2px",
};

const App = (): JSX.Element => {
  // 2. We inject the RootState type so the compiler knows the shape of 'state'
  const count = useSelector((state: RootState) => state.counter.value);

  // 3. We inject the AppDispatch type so the compiler knows what actions are valid
  const dispatch = useDispatch<AppDispatch>();

  return (
    <div>
      <h1> Counter : {count}</h1>
      {/* 4. TypeScript verifies that 'styles' perfectly matches the expected style prop */}
      <button style={styles} onClick={() => dispatch(increment())}>
        Increase Counter
      </button>
      <button style={styles} onClick={() => dispatch(decrement())}>
        Decrease Counter
      </button>
      <button style={styles} onClick={() => dispatch(reset())}>
        Reset Counter
      </button>
    </div>
  );
};

export default App;
