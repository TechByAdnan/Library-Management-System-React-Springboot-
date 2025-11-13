import React, { useEffect, useState } from "react";
import { getAllBooks, deleteBook } from "../services/bookService";

function BookList() {
  const [books, setBooks] = useState([]);

  useEffect(() => {
    getAllBooks().then((res) => setBooks(res.data.data));
  }, []);

  const handleDelete = (id) => {
    deleteBook(id).then(() => {
      setBooks(books.filter((book) => book.id !== id));
    });
  };

  return (
    <div className="container mt-5">
      <h2 className="text-center mb-4 text-primary">Book List</h2>
      <div className="table-responsive">
        <table className="table table-hover table-striped align-middle shadow-sm">
          <thead className="table-primary">
            <tr>
              <th>ID</th>
              <th>Title</th>
              <th>Author</th>
              <th>Category</th>
              <th>Publisher</th>
              <th>ISBN</th>
              <th>Published Date</th>
              <th>Total</th>
              <th>Available</th>
              <th>Action</th>
            </tr>
          </thead>
          <tbody>
            {books.map((book) => (
              <tr key={book.id}>
                <td>{book.id}</td>
                <td>{book.title}</td>
                <td>{book.author}</td>
                <td>{book.category}</td>
                <td>{book.publisher}</td>
                <td>{book.isbn}</td>
                <td>{book.publishedDate}</td>
                <td>{book.totalCopies}</td>
                <td>{book.availableCopies}</td>
                <td>
                  <button
                    className="btn btn-sm btn-danger"
                    onClick={() => handleDelete(book.id)}
                  >
                    Delete
                  </button>
                </td>
              </tr>
            ))}
            {books.length === 0 && (
              <tr>
                <td colSpan="10" className="text-center text-muted">
                  No books available.
                </td>
              </tr>
            )}
          </tbody>
        </table>
      </div>
    </div>
  );
}

export default BookList;
