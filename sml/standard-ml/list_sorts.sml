(* insertionSort(list): reverses a given list *)
(* TODO: in this way, sorting will be unstable. *)
fun insertionSort(nil) = nil
  | insertionSort(head::tail) =
    let
      (* helper function *)
      fun insert(e, nil) = [e]
        | insert(e, es as head::tail) =
            if e <= head
            then e::es
            else head::insert(e, tail)
    in
      insert(head, insertionSort(tail))
    end;

