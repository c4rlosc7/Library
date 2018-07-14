import { Component, OnInit } from '@angular/core';
import { Book } from './book';
import { BookService } from './book.service';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.css']
})
export class FormComponent implements OnInit {
  private title: String = 'Create new book';
  private book: Book = new Book();



  constructor(
    private bookService: BookService,
    private router: Router,
    private activateRoute: ActivatedRoute
  ) { }

  ngOnInit() {
  }

  public create(): void {
    console.log(this.book);
    this.bookService.create(this.book)
      .subscribe(book => {
        this.router.navigate(['/books']);
        // swal('New book', `Book ${book.title} created success!!!`, 'successful')
      });
  }

  public update(): void {
    this.bookService.update(this.book)
      .subscribe(book => {
        this.router.navigate(['/books']);
        // swal('Update book', `Book ${book.title} updated success!!!`, 'success')
      });
  }


}
