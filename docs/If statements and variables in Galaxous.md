## Variables

- To avoid inconvenience variable declarations in Galaxous is same as in pure java, but wait, you don't need to put the boring semicolons, yay!
- For example:
  ```
  int a = 4
  ```
  
## If statements
### If and else if ladder in Galaxous

```
import java.util.*

create public class test
main()
int a = 5
int b = 6
if a>b
println "a is bigger"
elif a==b
println "a and b are equal"
else
println "b is bigger"
endif 

endm 
end  
```
### Output
```
b is bigger
```

The above code intializes two int type variables a and b (a=5 and b=6) and then prints which one is bigger or they are equal.
```
Note: Don't declare variables in the same line.
```

### If statements declarations
```
if <condition>
<statements>
```
### elif
If you have ever used python then you might be familiar with elif which corresponds to else if in java.
```
elif <conditon>
<statements>
```
### else
```
else
<statements>
```
### endif
This marks the end of the if else ladder.
### The pure java code for the above program
```java
import java.util.*;
public class test {
 public static void main(String args[]) {
  Scanner sc = new Scanner(System.in);
  int a = 5;
  int b = 6;
  if(a>b){
    System.out.println( "a is bigger");
  }
  else if(a==b){ 
    System.out.println( "a and b are equal");
  }
  else{
      System.out.println( "b is bigger");
  }
 }
}
```
If you face any issues, comment down below or open an issue in the github repository.

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
                            
