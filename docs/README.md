# Galaxous (in development)
### Java just made simpler

Galaxous is a programming language which is based on java. The code written in Galaxous is much simpler and is converted into pure java by the Galaxous lexer.

![demo](/gademo.gif)

## Features

- No semicolons
- No braces
- No complex lines like java to take input
- **Want the pure java code?** Get it printed in your terminal
- And much more....

## Hello World program

```
import java.util.*
create public class test
main()
println "Hello World"
endm
end
```
### Explanation of the above code

The first line imports the java.util package.

create - This keyword is used for creation of any class or method.
- To create a class the following line of code is used `create <access specifier> class <class name>`.

main() - This simply means the creation of a general style main method in a java program. 
- The java code for this line is `public static void main(String args[]){`.

println "Hello World" - The java code for this keyword is `System.out.println("Hello World");`. You can also use print which will result to `System.out.print`.

endm - This marks the end of the current method(here main method).

end - This marks the end of the program.

``` 
Note: In a galaxous code you must import the java.util package. This might be updated in the future.
```

### The pure java code for above program

```java
import java.util.*;
public class test {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println( "Hello World");
  }
}
```
```
Note: The Scanner class line is included in the pure java code of every galaxous program to avoid input anomalies.
```

## Running a Galaxous program in Windows

```
Note: Be sure that java jdk is installed on your machine.
```

- Clone the [Galaxous repo](https://github.com/sahilsaha7773/Galaxous) to your local computer.
- Add the cloned Galaxous folder to the PATH environment variables.
- Write your galaxous code and save it with the extension ".ga".
- Open cmd and run the command `galaxous <the absolute path of your galaxous code file>`.
  For example:
  ```
  galaxous C:\Users\dell\test
  ```
  ```
  Note: Don't write the extension in the path.
  ```

## Learn more
- [Variables and if else in Galaxous](http://sahilsaha.me/Galaxous/If%20statements%20and%20variables%20in%20Galaxous)
- [Taking inputs in Galaxous](http://sahilsaha.me/Galaxous/Taking%20input%20in%20Galaxous)

Created by Sahil Saha
<div id="disqus_thread"></div>
<script>

/**
*  RECOMMENDED CONFIGURATION VARIABLES: EDIT AND UNCOMMENT THE SECTION BELOW TO INSERT DYNAMIC VALUES FROM YOUR PLATFORM OR CMS.
*  LEARN WHY DEFINING THESE VARIABLES IS IMPORTANT: https://disqus.com/admin/universalcode/#configuration-variables*/
/*
var disqus_config = function () {
this.page.url = PAGE_URL;  // Replace PAGE_URL with your page's canonical URL variable
this.page.identifier = PAGE_IDENTIFIER; // Replace PAGE_IDENTIFIER with your page's unique identifier variable
};
*/
(function() { // DON'T EDIT BELOW THIS LINE
var d = document, s = d.createElement('script');
s.src = 'https://galaxous-docs.disqus.com/embed.js';
s.setAttribute('data-timestamp', +new Date());
(d.head || d.body).appendChild(s);
})();
</script>
<noscript>Please enable JavaScript to view the <a href="https://disqus.com/?ref_noscript">comments powered by Disqus.</a></noscript>
                            
