import { Injectable } from '@angular/core';
import { BOOKS } from './books.json';
import { Book } from './book';
import { Observable, of } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class BookService {

  constructor() { }

  getBooks(): Observable<Book[]> {
    return of(BOOKS);
  }
}
