# Set Interface
### Main tips
- Set is an `interface` that extends `Collection`.
- Set doesn't allow duplicate elements. When adding new elements the existing element will be overriden.
- Sets cannot remove its items by index since its not classified.

### Set implementations

- HashSet
  - Does not keep the insertion or natural order of the elements
  - Does have an internal hashtable that allow operations with high performance
- TreeSet
  - Does keep the natural order of the elements
  - Does not have a good performance since it uses a tree with ordering algorithms
- LinkedHashSet 
  - Does keep the insertion order of the elements
