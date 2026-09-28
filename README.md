# Drills 7–11 — offline batch

Unzip into ~/spring-lab (merges into src/). Run one at a time:
  mvn test -Dtest=MaximumSubarrayTest

After each goes green, close the file and write from memory:
trigger -> one-sentence invariant -> skeleton. That page is the interview.

7. MaximumSubarray      Kadane's greedy        "maximum contiguous sum" -> extend or restart
8. ProductOfArrayExceptSelf  Prefix/suffix     "except self, no division" -> left pass, right pass
9. ClimbingStairs        DP (Fibonacci)        "ways with 1-or-2 steps" -> ways(n) = ways(n-1) + ways(n-2)
10. BinarySearch         Halve the space       "sorted, find x" -> middle tells you which half to throw away
11. GroupAnagrams        HashMap canonical key "group rearrangements" -> sort letters into a key
