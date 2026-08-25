import { configureStore } from "@reduxjs/toolkit";
// Assuming your slice is saved in a 'features' or 'slices' directory
import counterReducer from "./slice";

// 1. Assign the configured store to a variable
const store = configureStore({
  reducer: {
    // 2. Add the counter reducer to the store
    counter: counterReducer,
  },
});

// 3. Infer RootState and AppDispatch directly from the store
export type RootState = ReturnType<typeof store.getState>;
export type AppDispatch = typeof store.dispatch;

export default store;
