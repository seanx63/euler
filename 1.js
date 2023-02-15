//If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
// Find the sum of all the multiples of 3 or 5 below 1000.
let sum = 0;
for (three = 3; three < 1000; three += 3) {
    sum += three;
}
for (five = 5; five < 1000; five += 5) {
    sum += five;
}
for (fifteen = 15; fifteen < 1000; fifteen += 15) {
    sum -= fifteen;
}
console.log(sum); // 233168 
// Alternate solution below, both have very similar execution time.

// let sum = 0;
// for (i = 0; i < 1000; i++) {
//     if (i % 3 == 0 || i % 5 == 0) {
//         sum += i;
//     }
// }
// console.log(sum); // 233168