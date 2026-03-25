
**LOCAL VARIABLES**

In Java, while dealing with local variables,you cannot apply any modifier except final to a local variable. i.e. you cannot make them transient, volatile, static, public, and private.
But you can apply access modifiers (public private and protected) and final, transient, volatile, static to instance variables.
You cannot apply native and synchronized to any kind of variable.





**INHERITANCE & INTERFACES**

Consider this code:

```java
interface X1{ }
interface X2{ }
class A { }
class B extends A implements X1{ }
class C extends B implements X2{
D d = new D();
}
class D { }

```
Now, Inheritance defines an is-a relation , so C is-a B because C extends B. This actually means that C can be used in all the places where B is used. C can substitute for B anywhere because C is-a B. As all objects have Object as their super class, every object 'is-a' Object.

Since C implements X2, it is sometimes said that C 'is-like-a' X2. That is, although C is not an X2 but for all purposes C is like an X2. The distinction between is-a and is-like-a is not important for the exam. For the purpose of the exam, is-like-a is same as is-a. Therefore, C is-a X2 as well.

Aggregation defines a has-a relation. Here, D is a member object in C. In other words, D is contained within C. It is therefore said that C 'has-a' D.

All Java objects have the class Object as the ultimate superclass, and so Object is always at the root of any inheritance hierarchy.

**DATE API**
LocalDate, LocalTime, and LocalDateTime implement TemporalAccessor.




