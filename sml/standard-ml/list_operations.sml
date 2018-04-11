(* reverse(list): reverses a given list. *)
fun reverse(nil) = nil
  | reverse(head::nil) = [head]
  | reverse(head::tail) = reverse(tail)@[head];

