import React, { type JSX } from "react";
import { SumProvider } from "./SumContext";
import { InputComponent } from "./InputComponent";
import { DisplayComponent } from "./DisplayComponent";

function App(): JSX.Element {
  return (
    // Because we typed 'children: ReactNode' in the SumProvider,
    // TypeScript happily accepts these nested child components!
    <SumProvider>
      <h1> Sum Two Numbers </h1>
      <div>
        <InputComponent />
        <DisplayComponent />
      </div>
    </SumProvider>
  );
}

export default App;
