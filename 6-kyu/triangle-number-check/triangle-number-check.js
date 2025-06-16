function isTriangleNumber(number) {
  let n = 0
  for(let i = 1; i<=number; i++){
    n+=i
    if(n>=number) break
  }
  return n === number
}