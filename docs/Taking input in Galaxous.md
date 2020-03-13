## Taking input in Galaxous
```
import java.util.*
create public class test
main()
print "Enter your name:"
input(String name)
println "\nHello "+name
endm
end
```
### Output
```
Enter your name:Sahil //Type your name

Hello Sahil
```
### Explanation
- Taking input:
  ```
  input(<data type> <variable name>)
  ```
  The above code results into the following line in java:
  ```java
  String name=sc.nextLine(); //sc is the Scanner class object created by default
  ```
  ```
  Note: Always declare the variable inside the parenthesis of input statement.
  ```
  
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
                         
