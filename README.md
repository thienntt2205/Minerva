# Minerva Challenges

## Section 1: SQL

### Student Attendance

> Write a query that selects `student_id` and **number of absent dates** for
> each user who has more than 3 absent dates. Check-in dates are distinct.

This problem can be solved using a single query with `group by` and `having`.

```sql
select
  student_id,
  count(absent_flag) as num_absent_dates
from
  attendance
where
  absent_flag = TRUE
group by
  student_id
having
  count(absent_flag) >= 3;
```

### SQL Pagination

> How many types of pagination in SQL?

TODO:

## Section 1: Coding Challenge

I have implemented the solutions as a Gradle Java library project, so we can run the test on Linux or macOS via:

```sh
./gradlew test
```

On Windows, please try

```sh
gradlew.bat test
```

### Problem 1: Good Pairs

Please find the solution in [`GoodPairs.java`][good_pairs_main],
and its unit test in [`GoodPairsTest.java`][good_pairs_test].

[good_pairs_main]: ./lib/src/main/java/good_pairs/GoodPairs.java
[good_pairs_test]: ./lib/src/test/java/good_pairs/GoodPairsTest.java

Assuming the expected output is the list of all good pairs, I've implemented a
`O(n^2)` Time Complexity solution with optimal Space Complexity (the amount of
additional space to store good pair list shouldn't be larger than twice of the
output). However, if the expected output is just the **number of pairs**, I can
implement a solution using `HashMap` with both Time and Space Complexity are
`O(n)`.

I don't know any solution that use 2 pointers but faster than `O(n)`. I also
recommend fixing the Example 2. Its output is a number, which is not consistent
with the statement _"List all pairs"_ and the other 2 examples.

### Problem 2: Beautiful Strings

- TODO:

## Section 3: System Design

Sorry, I don't have enough experience to design and implement a good
Proof-of-concept for this section. If you want, we can discuss a bit on this
area, but for now, I can only try my best to complete the other 2 sections.
