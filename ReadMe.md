## Java Stream API

The **Java Stream API** is a powerful and versatile feature introduced in Java 8 to process sequences of data (collections or arrays) in a functional, declarative style. It allows you to perform operations on data, such as filtering, mapping, and reducing, with concise and expressive code.

### Stream Creation
You can create a stream from various data sources, including collections, arrays, or by generating a stream of elements.

```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
Stream<Integer> stream = numbers.stream();
```

### Intermediate Operations
Intermediate operations are used to transform, filter, or manipulate the data in the stream. Common intermediate operations include:

- `filter(Predicate<T> predicate)`: Filters elements based on a given condition.
- `map(Function<T, R> mapper)`: Transforms each element into another type.
- `sorted()`: Sorts the elements in the stream.
- `distinct()`: Removes duplicate elements.

```java
Stream<Integer> evenNumbers = numbers.stream()
  .filter(n -> n % 2 == 0)
  .map(n -> n * 2)
  .sorted()
  .distinct();
```

### Terminal Operations
Terminal operations are used to trigger the processing of the stream and produce a result. Common terminal operations include:

- `forEach(Consumer<T> action)`: Performs an action on each element.
- `collect(Collector<T, A, R> collector)`: Collects the elements into a collection or a single result.
- `reduce(BinaryOperator<T> accumulator)`: Reduces the stream to a single value.
- `count()`: Returns the number of elements in the stream.

```java
evenNumbers.forEach(System.out::println);
int sum = numbers.stream()
  .reduce(0, (a, b) -> a + b);
long count = numbers.stream().count();
```

### Lazy Evaluation
Streams are processed lazily, which means that intermediate operations are only executed when a terminal operation is called. This can lead to more efficient processing, especially for large data sets.

The Stream API is a powerful tool for simplifying and optimizing data processing tasks in Java. It encourages a functional programming approach and can make your code more concise and expressive. It's commonly used for data transformation, manipulation, and filtering operations.