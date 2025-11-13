import React from "react";

function Home() {
  return (
    <div className="container text-center mt-5">
      <h1 className="fw-bold text-primary mb-3">Welcome to Your Library</h1>
      <p className="lead text-muted">
        Manage your books, track availability, and organize your library with ease.
      </p>
      <img
        src="https://cdn-icons-png.flaticon.com/512/2232/2232688.png"
        alt="Library Illustration"
        className="img-fluid mt-4"
        style={{ width: "200px" }}
      />
    </div>
  );
}

export default Home;
