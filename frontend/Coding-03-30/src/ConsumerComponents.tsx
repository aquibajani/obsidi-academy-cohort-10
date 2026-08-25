import { useTheme } from "./useTheme"; // Import the custom hook

// 4. ThemeToggler Component
export function ThemeToggler() {
  const { theme, toggleTheme } = useTheme();
  const nextTheme = theme === "light" ? "dark" : "light";
  const isDark = theme === "dark";

  return (
    <button
      type="button"
      onClick={toggleTheme}
      style={{
        backgroundColor: isDark ? "#f9fafb" : "#111827",
        border: "none",
        color: isDark ? "#111827" : "#f9fafb",
        cursor: "pointer",
        padding: "10px 16px",
      }}
    >
      Switch to {nextTheme}
    </button>
  );
}

export function ThemedContent() {
  const { theme } = useTheme();
  const isDark = theme === "dark";

  return (
    <section
      style={{
        backgroundColor: isDark ? "#1f2937" : "#f3f4f6",
        color: isDark ? "#f9fafb" : "#111827",
        marginTop: "20px",
        padding: "20px",
      }}
    >
      <h2>{theme === "light" ? "Light" : "Dark"} theme</h2>
      <p>This content responds to the current theme.</p>
    </section>
  );
}
