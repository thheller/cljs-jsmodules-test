# Does Using Javascript Modules vs normal Foreign Libs change build size much?

Testing Cljs [JavaScript Modules](https://clojurescript.org/guides/javascript-modules) with 
the [JS-Joda](https://github.com/js-joda/js-joda) library as an example.

Note: these are ungzipped sizes, resulting from advanced compilation

## Results

### Minimal  (hello, world) Clojurescript

`clojure -m figwheel.main --build no-other-deps`

=> 94k

### Now including js-joda as a normal foreign lib

`clojure -Anot-module -m figwheel.main --build regular-cljsjs-build`

=> 302K

### Now using Js-Joda as a Javascript Module 

`clojure -m figwheel.main --build js-modules-test`

=> 246K

## Conclusion

Getting the library as a module does reduce size a bit, entirely due to advanced compilation
renaming. 

Still, JS-Joda has been included in it's entirety even though just some of it is used. IOW, Google 
Closure is not doing dead code elimination here.
 
So... will is dead code elimination in the pipes for this scenario. Which pipes? When? etc