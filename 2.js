// By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
let prev = 0
let curr = 1
let sum = 0
while (curr < 4000000) {
    if (curr % 2 == 0) {
        sum+=curr
    }
    let tmp = curr
    curr += prev
    prev = tmp
}
console.log(sum) // 4613732
