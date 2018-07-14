import { Injectable } from '@angular/core';
import { BOOKS } from './books.json';
import { Book } from './book';
import { Observable, of } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class BookService {

  private urlEndPoint: string = 'http://localhost:8080/api/books';
  private httpHeaders = new HttpHeaders({'Content-Type': 'application/json'});

  constructor(private http: HttpClient) { }

  getBooks(): Observable<Book[]> {
    // return of(BOOKS);
    return this.http.get(this.urlEndPoint).pipe(
      map((response) => response as Book[])
    );
  }

  create(book: Book): Observable<Book> {
    console.log(book);
    return this.http.post<Book>(this.urlEndPoint, book, { headers: this.httpHeaders});
  }

  getBook(id): Observable<Book> {
    return this.http.get<Book>(`${this.urlEndPoint}/${id}`);
  }

  update(book: Book): Observable<Book> {
    return this.http.put<Book>(`${this.urlEndPoint}/${book.id}`, book, { headers: this.httpHeaders });
  }

  delete(id: number): Observable<Book> {
    return this.http.delete<Book>(`${this.urlEndPoint}/${id}`, { headers: this.httpHeaders });
  }

}
