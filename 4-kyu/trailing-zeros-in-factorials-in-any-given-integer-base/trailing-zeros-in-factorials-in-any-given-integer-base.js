 
function trailingZeros(num, base) {
  let factorial = 1n, count = 0
  for(let i = 1; i <=num; i++) factorial = Number(factorial) * i
  const changedfactor = factorial.toString(Number(base)).toString().split('').reverse()
  for(let val of changedfactor) {
    if(val !== '0') break
    count++
  }
  return BigInt(count)
}