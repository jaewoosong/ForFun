List operations
===============

## `remove(list, x)`
- remove the first item `x` from `list`.
- `remove([1,2,3], 2)` => `[1,3]`

## `reverse(list)`
- reverses the items of `list`.
- `reverse([1,2,3])` => `[3,2,1]`

# Future work
* s[i] = x
* s[i:j] = t
* del s[i:j]
* s[i:j:k] = t
* del s[i:j:k]
* s.append(x)
* s.clear()
* s.copy()
* s.extend(t) or s += t
* s *= n
* s.insert(i, x)
* s.pop([i])
* s.remove(x)

* item i of s is replaced by x
* slice of s from i to j is replaced by the contents of the iterable t
* same as s[i:j] = []
* the elements of s[i:j:k] are replaced by those of t
* removes the elements of s[i:j:k] from the list
* appends x to the end of the sequence (same as s[len(s):len(s)] = [x])
* removes all items from s (same as del s[:])
* creates a shallow copy of s (same as s[:])
* extends s with the contents of t (for the most part the same as s[len(s):len(s)] = t)
* updates s with its contents repeated n times
* inserts x into s at the index given by i (same as s[i:i] = [x])
* retrieves the item at i and also removes it from s

