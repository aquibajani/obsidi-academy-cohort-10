import { type JSX } from "react";
import { ThemeProvider } from "./ThemedContext";
import { ThemeToggler, ThemedContent } from "./ConsumerComponents";
import { useTheme } from "./useTheme";

function ThemedApp(): JSX.Element {
  const { theme } = useTheme();
  const isDark = theme === "dark";

  return (
    <div
      style={{
        backgroundColor: isDark ? "#111827" : "#ffffff",
        color: isDark ? "#f9fafb" : "#111827",
        minHeight: "100vh",
        padding: "30px",
      }}
    >
      <h1>Theme Manager</h1>
      <ThemeToggler />
      <ThemedContent />
    </div>
  );
}

function App(): JSX.Element {
  return (
    <ThemeProvider>
      <ThemedApp />
    </ThemeProvider>
  );
}

export default App;
