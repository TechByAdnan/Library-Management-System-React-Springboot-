import React, { useState } from "react";
import { addBook } from "../services/bookService";

function AddBook() {
  const [book, setBook] = useState({
    title: "",
    author: "",
    publisher: "",
    category: "",
    isbn: "",
    publishedDate: "",
    totalCopies: 1,
    availableCopies: 1
  });

  const handleChange = (e) => {
    setBook({ ...book, [e.target.name]: e.target.value });
  };

  const handleSubmit = async (e) => {
    e.preventDefault();
    try {
      await addBook(book);
      alert("Book added successfully!");
      setBook({
        title: "",
        author: "",
        publisher: "",
        category: "",
        isbn: "",
        publishedDate: "",
        totalCopies: 1,
        availableCopies: 1
      });
    } catch (error) {
      console.error(error);
      alert("Error adding book");
    }
  };

  return (
    <form onSubmit={handleSubmit} style={{ margin: "40px auto", width: "400px" }}>
      <h2>Add a New Book</h2>

      <input name="title" placeholder="Title" value={book.title} onChange={handleChange} required />
      <input name="author" placeholder="Author" value={book.author} onChange={handleChange} required />
      <input name="publisher" placeholder="Publisher" value={book.publisher} onChange={handleChange} />
      <input name="category" placeholder="Category" value={book.category} onChange={handleChange} />
      <input name="isbn" placeholder="ISBN" value={book.isbn} onChange={handleChange} />
      <input name="publishedDate" type="date" value={book.publishedDate} onChange={handleChange} />
      <input name="totalCopies" type="number" value={book.totalCopies} onChange={handleChange} />
      <input name="availableCopies" type="number" value={book.availableCopies} onChange={handleChange} />

      <button type="submit">Add Book</button>
    </form>
  );
}

export default AddBook;
