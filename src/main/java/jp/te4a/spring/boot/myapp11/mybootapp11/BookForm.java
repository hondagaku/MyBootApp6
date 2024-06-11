package jp.te4a.spring.boot.myapp11.mybootapp11;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.annotation.Nonnull;
import jakarta.validation.Constraints.Size;

@Data
@NoArgsConstructor
public class BookForm {
private Integer id ;
 @Nonnull
 @Size(min = 3)
 @TestValid(param="abc")
 private String title;
 @Size(min = 3, max = 20)
 private String writter;
 private String publisher;
 @Min(0)
 private Integer price;
}

