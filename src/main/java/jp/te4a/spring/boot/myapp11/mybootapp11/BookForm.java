package jp.te4a.spring.boot.myapp11.mybootapp11;

import jakarta.annotation.Nonnull;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


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

