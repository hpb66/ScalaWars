// https://www.codewars.com/kata/54e6533c92449cc251001667/train/scala

class Kata extends Display{
    def displayOutput(): Unit = {
        println(uniqueInOrder("AAAABBBCCDAABBB"))   
        println(uniqueInOrder("ABBCcAD"))           
        println(uniqueInOrder(List(1, 2, 2, 3, 3)))
    }
    def uniqueInOrder[T](xs: Iterable[T]): Seq[T] = {
        xs.toList.foldLeft(Seq.empty[T])((a, b) => if(a.isEmpty) a.appended(b) else if (!a.last.equals(b)) a.appended(b) else a)
    }
}