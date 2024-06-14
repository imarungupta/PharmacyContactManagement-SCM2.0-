/** @type {import('tailwindcss').Config} */
export default {
  content: ["./src/java/resources/**/*.{html,js}"],
  theme: {
    extend: {},
  },
  plugins: [],
  darkMode: "selector",
}

/** @type {import('tailwindcss').Config} */
module.exports = {
  content: [
    './pages/**/*.{html,js}',
    './components/**/*.{html,js}',
  ],
  // ...
}