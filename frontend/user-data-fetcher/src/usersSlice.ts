import { createAsyncThunk, createSlice } from "@reduxjs/toolkit";

export interface User {
  id: number;
  name: string;
  username: string;
  email: string;
  company: { name: string };
}

interface UsersState {
  data: User[];
  status: "idle" | "loading" | "succeeded" | "failed";
  error: string | null;
}

const initialState: UsersState = { data: [], status: "idle", error: null };

export const fetchUserData = createAsyncThunk<
  User[],
  void,
  { rejectValue: string }
>("users/fetchUserData", async (_, { rejectWithValue }) => {
  try {
    const response = await fetch("https://jsonplaceholder.typicode.com/users");
    if (!response.ok) {
      return rejectWithValue(`Request failed with status ${response.status}`);
    }
    return (await response.json()) as User[];
  } catch {
    return rejectWithValue("Unable to fetch user data. Please try again.");
  }
});

const usersSlice = createSlice({
  name: "users",
  initialState,
  reducers: {},
  extraReducers: (builder) => {
    builder
      .addCase(fetchUserData.pending, (state) => {
        state.status = "loading";
        state.error = null;
      })
      .addCase(fetchUserData.fulfilled, (state, action) => {
        state.status = "succeeded";
        state.data = action.payload;
        state.error = null;
      })
      .addCase(fetchUserData.rejected, (state, action) => {
        state.status = "failed";
        state.error =
          action.payload ?? action.error.message ?? "Request failed.";
      });
  },
});

export default usersSlice.reducer;
