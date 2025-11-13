import axios from "axios";

const BASE_URL = "http://localhost:8080/books";

// Add a new book
export const addBook = (book) => axios.post(BASE_URL, book);

// Get all books
export const getAllBooks = () => axios.get(BASE_URL);

// Get book by ID
export const getBookById = (id) => axios.get(`${BASE_URL}/${id}`);

// Update book details
export const updateBook = (book) => axios.put(BASE_URL, book);

// Delete book by ID
export const deleteBook = (id) => axios.delete(`${BASE_URL}/${id}`);
