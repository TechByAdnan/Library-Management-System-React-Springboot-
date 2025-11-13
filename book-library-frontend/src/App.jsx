import React from "react";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import Navbar from "./components/Navbar";
import Footer from "./components/Footer";
import Header from "./components/Header";
import BookList from "./components/BookList";
import AddBook from "./components/AddBook";

const App = () => {
  return (
    <Router>
      <Navbar />
      <Header />
      <div className="p-6">
        <Routes>
          <Route path="/" element={<BookList />} />
          <Route path="/books" element={<BookList />} />
          <Route path="/add-book" element={<AddBook />} />
          <Route
            path="/about"
            element={<p className="text-center text-xl mt-6">About This Project</p>}
          />
        </Routes>
      </div>
      <Footer />
    </Router>
  );
};

export default App;
