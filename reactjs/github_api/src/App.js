import React from "react";
import Layout from "./components/layout";
import Profile from "./components/profile";
import Repositores from "./components/repositories";
import { ResetCSS } from "./global/resetCSS";

function App() {
  return (
    <main className="App">
      <ResetCSS />
      <Layout>
        <Profile />
        <Repositores />
      </Layout>
    </main>
  );
}

export default App;
