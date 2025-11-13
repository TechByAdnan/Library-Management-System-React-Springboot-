import React from "react";

const Header = () => {
  return (
    <header className="bg-gradient-to-r from-blue-600 to-indigo-700 text-white py-16 text-center">
      <h1 className="text-4xl font-bold mb-4">Welcome to Your Library</h1>
      <p className="text-lg text-gray-200">
        Manage books, track availability, and keep your library organized easily.
      </p>
    </header>
  );
};

export default Header;  // ✅ Make sure this line exists
