package com.hnkj.springboot_01.contraller;
import com.hnkj.springboot_01.entity.Book;
import com.hnkj.springboot_01.entity.Copyright;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;
import java.util.List;

@Controller
public class BookController {
    private List<Book> books = new ArrayList<>();
    private Copyright copyright = new Copyright("IU","海南科技职业大学所有权！");

    {
        books.add(new Book(1,"西游记","吴承恩","清华出版社"));
        books.add(new Book(2,"三国演义","罗贯中","北大出版社"));
        books.add(new Book(3,"红楼梦","曹雪芹","厦门出版社"));
        books.add(new Book(4,"水浒传","施耐庵","同济出版社"));
    }

    @RequestMapping("/list")
    public String list(Model model){
        model.addAttribute("books", books);
        model.addAttribute("copyright", copyright);
        return "book";
    }
    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable int id, Model model) {
        Book book = null;
        for (Book b : books) {
            if (b.getId() == id) {
                book = b;
                break;
            }
        }
        if (book != null) {
            books.remove(book);
        }

        return "redirect:/list";
    }
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable int id, Model model) {
        Book book = null;
        for (Book b : books) {
            if (b.getId() == id) {
                book = b;
                break;
            }
        }
        if (book != null) {
            model.addAttribute("book", book);
        }
        return "edit";
    }
    @PostMapping("/update/{id}")
    public String update(@PathVariable int id, @ModelAttribute Book book, Model model) {
        Book existingBook = null;
        for (Book b : books) {
            if (b.getId() == id) {
                existingBook = b;
                break;
            }
        }
        if (existingBook != null) {
            existingBook.setName(book.getName());
            existingBook.setAuthor(book.getAuthor());
            existingBook.setPublisher(book.getPublisher());
        }
        return "redirect:/list";
    }
}