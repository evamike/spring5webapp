package guru.springframework.spring5webapp.bootstrap;

import guru.springframework.spring5webapp.domain.Author;
import guru.springframework.spring5webapp.domain.Book;
import guru.springframework.spring5webapp.domain.Publisher;
import guru.springframework.spring5webapp.repository.AuthorRepository;
import guru.springframework.spring5webapp.repository.BookRepository;
import guru.springframework.spring5webapp.repository.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

  private final AuthorRepository authorRepository;
  private final BookRepository bookRepository;
  private final PublisherRepository publisherRepository;

  public BootstrapData(AuthorRepository authorRepository,
      BookRepository bookRepository,
      PublisherRepository publisherRepository
  ) {
    this.authorRepository = authorRepository;
    this.bookRepository = bookRepository;
    this.publisherRepository  = publisherRepository;
  }

  @Override
  public void run(String... args) throws Exception {

    Publisher publisher = new Publisher("publisher name", "line1", "Berlin", "Berlin", "10117");
    publisherRepository.save(publisher);
    System.out.println("Started Bootstrap");
    System.out.println("Number of publishers=" + publisherRepository.count());
    Author erik = new Author("Eric",  "Evans");
    Book ddd = new Book("Domain Driven Design","123123");
    erik.getBooks().add(ddd);
    ddd.getAuthors().add(erik);
    ddd.setPublisher(publisher);
    authorRepository.save(erik);
    bookRepository.save(ddd);

    Author rod = new Author("Rod",  "Johnson");
    Book noEJB = new Book("J2EE Dev without EJB","456456");
    rod.getBooks().add(noEJB);
    noEJB.getAuthors().add(rod);
    noEJB.setPublisher(publisher);
    authorRepository.save(rod);
    bookRepository.save(noEJB);

    publisher.getBooks().add(ddd);
    publisher.getBooks().add(noEJB);
    publisherRepository.save(publisher);
    System.out.println("Number of books=" + bookRepository.count());
    System.out.println("Number of authors=" + authorRepository.count());
  }
}
